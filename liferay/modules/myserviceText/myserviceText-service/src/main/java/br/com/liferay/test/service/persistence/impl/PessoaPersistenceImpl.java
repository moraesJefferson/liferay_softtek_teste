/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package br.com.liferay.test.service.persistence.impl;

import br.com.liferay.test.exception.NoSuchPessoaException;
import br.com.liferay.test.model.Pessoa;
import br.com.liferay.test.model.impl.PessoaImpl;
import br.com.liferay.test.model.impl.PessoaModelImpl;
import br.com.liferay.test.service.persistence.PessoaPersistence;
import br.com.liferay.test.service.persistence.impl.constants.FirstPersistenceConstants;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the pessoa service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = PessoaPersistence.class)
@ProviderType
public class PessoaPersistenceImpl
	extends BasePersistenceImpl<Pessoa> implements PessoaPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PessoaUtil</code> to access the pessoa persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PessoaImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public PessoaPersistenceImpl() {
		setModelClass(Pessoa.class);

		setModelImplClass(PessoaImpl.class);
		setModelPKClass(long.class);

		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("id", "id_");

		setDBColumnNames(dbColumnNames);
	}

	/**
	 * Caches the pessoa in the entity cache if it is enabled.
	 *
	 * @param pessoa the pessoa
	 */
	@Override
	public void cacheResult(Pessoa pessoa) {
		entityCache.putResult(
			entityCacheEnabled, PessoaImpl.class, pessoa.getPrimaryKey(),
			pessoa);

		pessoa.resetOriginalValues();
	}

	/**
	 * Caches the pessoas in the entity cache if it is enabled.
	 *
	 * @param pessoas the pessoas
	 */
	@Override
	public void cacheResult(List<Pessoa> pessoas) {
		for (Pessoa pessoa : pessoas) {
			if (entityCache.getResult(
					entityCacheEnabled, PessoaImpl.class,
					pessoa.getPrimaryKey()) == null) {

				cacheResult(pessoa);
			}
			else {
				pessoa.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all pessoas.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PessoaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the pessoa.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Pessoa pessoa) {
		entityCache.removeResult(
			entityCacheEnabled, PessoaImpl.class, pessoa.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Pessoa> pessoas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Pessoa pessoa : pessoas) {
			entityCache.removeResult(
				entityCacheEnabled, PessoaImpl.class, pessoa.getPrimaryKey());
		}
	}

	/**
	 * Creates a new pessoa with the primary key. Does not add the pessoa to the database.
	 *
	 * @param id the primary key for the new pessoa
	 * @return the new pessoa
	 */
	@Override
	public Pessoa create(long id) {
		Pessoa pessoa = new PessoaImpl();

		pessoa.setNew(true);
		pessoa.setPrimaryKey(id);

		return pessoa;
	}

	/**
	 * Removes the pessoa with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the pessoa
	 * @return the pessoa that was removed
	 * @throws NoSuchPessoaException if a pessoa with the primary key could not be found
	 */
	@Override
	public Pessoa remove(long id) throws NoSuchPessoaException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the pessoa with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the pessoa
	 * @return the pessoa that was removed
	 * @throws NoSuchPessoaException if a pessoa with the primary key could not be found
	 */
	@Override
	public Pessoa remove(Serializable primaryKey) throws NoSuchPessoaException {
		Session session = null;

		try {
			session = openSession();

			Pessoa pessoa = (Pessoa)session.get(PessoaImpl.class, primaryKey);

			if (pessoa == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPessoaException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(pessoa);
		}
		catch (NoSuchPessoaException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Pessoa removeImpl(Pessoa pessoa) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(pessoa)) {
				pessoa = (Pessoa)session.get(
					PessoaImpl.class, pessoa.getPrimaryKeyObj());
			}

			if (pessoa != null) {
				session.delete(pessoa);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (pessoa != null) {
			clearCache(pessoa);
		}

		return pessoa;
	}

	@Override
	public Pessoa updateImpl(Pessoa pessoa) {
		boolean isNew = pessoa.isNew();

		Session session = null;

		try {
			session = openSession();

			if (pessoa.isNew()) {
				session.save(pessoa);

				pessoa.setNew(false);
			}
			else {
				pessoa = (Pessoa)session.merge(pessoa);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}

		entityCache.putResult(
			entityCacheEnabled, PessoaImpl.class, pessoa.getPrimaryKey(),
			pessoa, false);

		pessoa.resetOriginalValues();

		return pessoa;
	}

	/**
	 * Returns the pessoa with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the pessoa
	 * @return the pessoa
	 * @throws NoSuchPessoaException if a pessoa with the primary key could not be found
	 */
	@Override
	public Pessoa findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPessoaException {

		Pessoa pessoa = fetchByPrimaryKey(primaryKey);

		if (pessoa == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPessoaException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return pessoa;
	}

	/**
	 * Returns the pessoa with the primary key or throws a <code>NoSuchPessoaException</code> if it could not be found.
	 *
	 * @param id the primary key of the pessoa
	 * @return the pessoa
	 * @throws NoSuchPessoaException if a pessoa with the primary key could not be found
	 */
	@Override
	public Pessoa findByPrimaryKey(long id) throws NoSuchPessoaException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the pessoa with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the pessoa
	 * @return the pessoa, or <code>null</code> if a pessoa with the primary key could not be found
	 */
	@Override
	public Pessoa fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the pessoas.
	 *
	 * @return the pessoas
	 */
	@Override
	public List<Pessoa> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pessoas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PessoaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of pessoas
	 * @param end the upper bound of the range of pessoas (not inclusive)
	 * @return the range of pessoas
	 */
	@Override
	public List<Pessoa> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the pessoas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PessoaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of pessoas
	 * @param end the upper bound of the range of pessoas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pessoas
	 */
	@Deprecated
	@Override
	public List<Pessoa> findAll(
		int start, int end, OrderByComparator<Pessoa> orderByComparator,
		boolean useFinderCache) {

		return findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pessoas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PessoaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of pessoas
	 * @param end the upper bound of the range of pessoas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pessoas
	 */
	@Override
	public List<Pessoa> findAll(
		int start, int end, OrderByComparator<Pessoa> orderByComparator) {

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindAll;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Pessoa> list = (List<Pessoa>)finderCache.getResult(
			finderPath, finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_PESSOA);

				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PESSOA;

				if (pagination) {
					sql = sql.concat(PessoaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Pessoa>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Pessoa>)QueryUtil.list(
						q, getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the pessoas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Pessoa pessoa : findAll()) {
			remove(pessoa);
		}
	}

	/**
	 * Returns the number of pessoas.
	 *
	 * @return the number of pessoas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PESSOA);

				count = (Long)q.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				finderCache.removeResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "id_";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PESSOA;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PessoaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the pessoa persistence.
	 */
	@Activate
	public void activate() {
		PessoaModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		PessoaModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, PessoaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, PessoaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(PessoaImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	@Reference(
		target = FirstPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
		super.setConfiguration(configuration);

		_columnBitmaskEnabled = GetterUtil.getBoolean(
			configuration.get(
				"value.object.column.bitmask.enabled.br.com.liferay.test.model.Pessoa"),
			true);
	}

	@Override
	@Reference(
		target = FirstPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FirstPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private boolean _columnBitmaskEnabled;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_PESSOA =
		"SELECT pessoa FROM Pessoa pessoa";

	private static final String _SQL_COUNT_PESSOA =
		"SELECT COUNT(pessoa) FROM Pessoa pessoa";

	private static final String _ORDER_BY_ENTITY_ALIAS = "pessoa.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Pessoa exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		PessoaPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"id"});

	static {
		try {
			Class.forName(FirstPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException cnfe) {
			throw new ExceptionInInitializerError(cnfe);
		}
	}

}