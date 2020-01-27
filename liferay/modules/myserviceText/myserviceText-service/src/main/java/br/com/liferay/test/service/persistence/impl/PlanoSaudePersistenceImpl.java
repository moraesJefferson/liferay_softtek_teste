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

import br.com.liferay.test.exception.NoSuchPlanoSaudeException;
import br.com.liferay.test.model.PlanoSaude;
import br.com.liferay.test.model.impl.PlanoSaudeImpl;
import br.com.liferay.test.model.impl.PlanoSaudeModelImpl;
import br.com.liferay.test.service.persistence.PlanoSaudePersistence;
import br.com.liferay.test.service.persistence.impl.constants.FirstPersistenceConstants;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.sql.DataSource;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the plano saude service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = PlanoSaudePersistence.class)
@ProviderType
public class PlanoSaudePersistenceImpl
	extends BasePersistenceImpl<PlanoSaude> implements PlanoSaudePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PlanoSaudeUtil</code> to access the plano saude persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PlanoSaudeImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBydescricao;
	private FinderPath _finderPathWithoutPaginationFindBydescricao;
	private FinderPath _finderPathCountBydescricao;

	/**
	 * Returns all the plano saudes where descricao = &#63;.
	 *
	 * @param descricao the descricao
	 * @return the matching plano saudes
	 */
	@Override
	public List<PlanoSaude> findBydescricao(String descricao) {
		return findBydescricao(
			descricao, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the plano saudes where descricao = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PlanoSaudeModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param descricao the descricao
	 * @param start the lower bound of the range of plano saudes
	 * @param end the upper bound of the range of plano saudes (not inclusive)
	 * @return the range of matching plano saudes
	 */
	@Override
	public List<PlanoSaude> findBydescricao(
		String descricao, int start, int end) {

		return findBydescricao(descricao, start, end, null);
	}

	/**
	 * Returns an ordered range of all the plano saudes where descricao = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PlanoSaudeModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findBydescricao(String, int, int, OrderByComparator)}
	 * @param descricao the descricao
	 * @param start the lower bound of the range of plano saudes
	 * @param end the upper bound of the range of plano saudes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching plano saudes
	 */
	@Deprecated
	@Override
	public List<PlanoSaude> findBydescricao(
		String descricao, int start, int end,
		OrderByComparator<PlanoSaude> orderByComparator,
		boolean useFinderCache) {

		return findBydescricao(descricao, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the plano saudes where descricao = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PlanoSaudeModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param descricao the descricao
	 * @param start the lower bound of the range of plano saudes
	 * @param end the upper bound of the range of plano saudes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plano saudes
	 */
	@Override
	public List<PlanoSaude> findBydescricao(
		String descricao, int start, int end,
		OrderByComparator<PlanoSaude> orderByComparator) {

		descricao = Objects.toString(descricao, "");

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindBydescricao;
			finderArgs = new Object[] {descricao};
		}
		else {
			finderPath = _finderPathWithPaginationFindBydescricao;
			finderArgs = new Object[] {
				descricao, start, end, orderByComparator
			};
		}

		List<PlanoSaude> list = (List<PlanoSaude>)finderCache.getResult(
			finderPath, finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (PlanoSaude planoSaude : list) {
				if (!descricao.equals(planoSaude.getDescricao())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_PLANOSAUDE_WHERE);

			boolean bindDescricao = false;

			if (descricao.isEmpty()) {
				query.append(_FINDER_COLUMN_DESCRICAO_DESCRICAO_3);
			}
			else {
				bindDescricao = true;

				query.append(_FINDER_COLUMN_DESCRICAO_DESCRICAO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else if (pagination) {
				query.append(PlanoSaudeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDescricao) {
					qPos.add(descricao);
				}

				if (!pagination) {
					list = (List<PlanoSaude>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<PlanoSaude>)QueryUtil.list(
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
	 * Returns the first plano saude in the ordered set where descricao = &#63;.
	 *
	 * @param descricao the descricao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plano saude
	 * @throws NoSuchPlanoSaudeException if a matching plano saude could not be found
	 */
	@Override
	public PlanoSaude findBydescricao_First(
			String descricao, OrderByComparator<PlanoSaude> orderByComparator)
		throws NoSuchPlanoSaudeException {

		PlanoSaude planoSaude = fetchBydescricao_First(
			descricao, orderByComparator);

		if (planoSaude != null) {
			return planoSaude;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("descricao=");
		msg.append(descricao);

		msg.append("}");

		throw new NoSuchPlanoSaudeException(msg.toString());
	}

	/**
	 * Returns the first plano saude in the ordered set where descricao = &#63;.
	 *
	 * @param descricao the descricao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plano saude, or <code>null</code> if a matching plano saude could not be found
	 */
	@Override
	public PlanoSaude fetchBydescricao_First(
		String descricao, OrderByComparator<PlanoSaude> orderByComparator) {

		List<PlanoSaude> list = findBydescricao(
			descricao, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last plano saude in the ordered set where descricao = &#63;.
	 *
	 * @param descricao the descricao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plano saude
	 * @throws NoSuchPlanoSaudeException if a matching plano saude could not be found
	 */
	@Override
	public PlanoSaude findBydescricao_Last(
			String descricao, OrderByComparator<PlanoSaude> orderByComparator)
		throws NoSuchPlanoSaudeException {

		PlanoSaude planoSaude = fetchBydescricao_Last(
			descricao, orderByComparator);

		if (planoSaude != null) {
			return planoSaude;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("descricao=");
		msg.append(descricao);

		msg.append("}");

		throw new NoSuchPlanoSaudeException(msg.toString());
	}

	/**
	 * Returns the last plano saude in the ordered set where descricao = &#63;.
	 *
	 * @param descricao the descricao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plano saude, or <code>null</code> if a matching plano saude could not be found
	 */
	@Override
	public PlanoSaude fetchBydescricao_Last(
		String descricao, OrderByComparator<PlanoSaude> orderByComparator) {

		int count = countBydescricao(descricao);

		if (count == 0) {
			return null;
		}

		List<PlanoSaude> list = findBydescricao(
			descricao, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the plano saudes before and after the current plano saude in the ordered set where descricao = &#63;.
	 *
	 * @param plano_id the primary key of the current plano saude
	 * @param descricao the descricao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plano saude
	 * @throws NoSuchPlanoSaudeException if a plano saude with the primary key could not be found
	 */
	@Override
	public PlanoSaude[] findBydescricao_PrevAndNext(
			long plano_id, String descricao,
			OrderByComparator<PlanoSaude> orderByComparator)
		throws NoSuchPlanoSaudeException {

		descricao = Objects.toString(descricao, "");

		PlanoSaude planoSaude = findByPrimaryKey(plano_id);

		Session session = null;

		try {
			session = openSession();

			PlanoSaude[] array = new PlanoSaudeImpl[3];

			array[0] = getBydescricao_PrevAndNext(
				session, planoSaude, descricao, orderByComparator, true);

			array[1] = planoSaude;

			array[2] = getBydescricao_PrevAndNext(
				session, planoSaude, descricao, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected PlanoSaude getBydescricao_PrevAndNext(
		Session session, PlanoSaude planoSaude, String descricao,
		OrderByComparator<PlanoSaude> orderByComparator, boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PLANOSAUDE_WHERE);

		boolean bindDescricao = false;

		if (descricao.isEmpty()) {
			query.append(_FINDER_COLUMN_DESCRICAO_DESCRICAO_3);
		}
		else {
			bindDescricao = true;

			query.append(_FINDER_COLUMN_DESCRICAO_DESCRICAO_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(PlanoSaudeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDescricao) {
			qPos.add(descricao);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(planoSaude)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<PlanoSaude> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the plano saudes where descricao = &#63; from the database.
	 *
	 * @param descricao the descricao
	 */
	@Override
	public void removeBydescricao(String descricao) {
		for (PlanoSaude planoSaude :
				findBydescricao(
					descricao, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(planoSaude);
		}
	}

	/**
	 * Returns the number of plano saudes where descricao = &#63;.
	 *
	 * @param descricao the descricao
	 * @return the number of matching plano saudes
	 */
	@Override
	public int countBydescricao(String descricao) {
		descricao = Objects.toString(descricao, "");

		FinderPath finderPath = _finderPathCountBydescricao;

		Object[] finderArgs = new Object[] {descricao};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PLANOSAUDE_WHERE);

			boolean bindDescricao = false;

			if (descricao.isEmpty()) {
				query.append(_FINDER_COLUMN_DESCRICAO_DESCRICAO_3);
			}
			else {
				bindDescricao = true;

				query.append(_FINDER_COLUMN_DESCRICAO_DESCRICAO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDescricao) {
					qPos.add(descricao);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_DESCRICAO_DESCRICAO_2 =
		"planoSaude.descricao = ?";

	private static final String _FINDER_COLUMN_DESCRICAO_DESCRICAO_3 =
		"(planoSaude.descricao IS NULL OR planoSaude.descricao = '')";

	public PlanoSaudePersistenceImpl() {
		setModelClass(PlanoSaude.class);

		setModelImplClass(PlanoSaudeImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the plano saude in the entity cache if it is enabled.
	 *
	 * @param planoSaude the plano saude
	 */
	@Override
	public void cacheResult(PlanoSaude planoSaude) {
		entityCache.putResult(
			entityCacheEnabled, PlanoSaudeImpl.class,
			planoSaude.getPrimaryKey(), planoSaude);

		planoSaude.resetOriginalValues();
	}

	/**
	 * Caches the plano saudes in the entity cache if it is enabled.
	 *
	 * @param planoSaudes the plano saudes
	 */
	@Override
	public void cacheResult(List<PlanoSaude> planoSaudes) {
		for (PlanoSaude planoSaude : planoSaudes) {
			if (entityCache.getResult(
					entityCacheEnabled, PlanoSaudeImpl.class,
					planoSaude.getPrimaryKey()) == null) {

				cacheResult(planoSaude);
			}
			else {
				planoSaude.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all plano saudes.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PlanoSaudeImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the plano saude.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PlanoSaude planoSaude) {
		entityCache.removeResult(
			entityCacheEnabled, PlanoSaudeImpl.class,
			planoSaude.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<PlanoSaude> planoSaudes) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PlanoSaude planoSaude : planoSaudes) {
			entityCache.removeResult(
				entityCacheEnabled, PlanoSaudeImpl.class,
				planoSaude.getPrimaryKey());
		}
	}

	/**
	 * Creates a new plano saude with the primary key. Does not add the plano saude to the database.
	 *
	 * @param plano_id the primary key for the new plano saude
	 * @return the new plano saude
	 */
	@Override
	public PlanoSaude create(long plano_id) {
		PlanoSaude planoSaude = new PlanoSaudeImpl();

		planoSaude.setNew(true);
		planoSaude.setPrimaryKey(plano_id);

		return planoSaude;
	}

	/**
	 * Removes the plano saude with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param plano_id the primary key of the plano saude
	 * @return the plano saude that was removed
	 * @throws NoSuchPlanoSaudeException if a plano saude with the primary key could not be found
	 */
	@Override
	public PlanoSaude remove(long plano_id) throws NoSuchPlanoSaudeException {
		return remove((Serializable)plano_id);
	}

	/**
	 * Removes the plano saude with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the plano saude
	 * @return the plano saude that was removed
	 * @throws NoSuchPlanoSaudeException if a plano saude with the primary key could not be found
	 */
	@Override
	public PlanoSaude remove(Serializable primaryKey)
		throws NoSuchPlanoSaudeException {

		Session session = null;

		try {
			session = openSession();

			PlanoSaude planoSaude = (PlanoSaude)session.get(
				PlanoSaudeImpl.class, primaryKey);

			if (planoSaude == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPlanoSaudeException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(planoSaude);
		}
		catch (NoSuchPlanoSaudeException nsee) {
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
	protected PlanoSaude removeImpl(PlanoSaude planoSaude) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(planoSaude)) {
				planoSaude = (PlanoSaude)session.get(
					PlanoSaudeImpl.class, planoSaude.getPrimaryKeyObj());
			}

			if (planoSaude != null) {
				session.delete(planoSaude);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (planoSaude != null) {
			clearCache(planoSaude);
		}

		return planoSaude;
	}

	@Override
	public PlanoSaude updateImpl(PlanoSaude planoSaude) {
		boolean isNew = planoSaude.isNew();

		if (!(planoSaude instanceof PlanoSaudeModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(planoSaude.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(planoSaude);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in planoSaude proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom PlanoSaude implementation " +
					planoSaude.getClass());
		}

		PlanoSaudeModelImpl planoSaudeModelImpl =
			(PlanoSaudeModelImpl)planoSaude;

		Session session = null;

		try {
			session = openSession();

			if (planoSaude.isNew()) {
				session.save(planoSaude);

				planoSaude.setNew(false);
			}
			else {
				planoSaude = (PlanoSaude)session.merge(planoSaude);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!_columnBitmaskEnabled) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {planoSaudeModelImpl.getDescricao()};

			finderCache.removeResult(_finderPathCountBydescricao, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindBydescricao, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((planoSaudeModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindBydescricao.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					planoSaudeModelImpl.getOriginalDescricao()
				};

				finderCache.removeResult(_finderPathCountBydescricao, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindBydescricao, args);

				args = new Object[] {planoSaudeModelImpl.getDescricao()};

				finderCache.removeResult(_finderPathCountBydescricao, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindBydescricao, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, PlanoSaudeImpl.class,
			planoSaude.getPrimaryKey(), planoSaude, false);

		planoSaude.resetOriginalValues();

		return planoSaude;
	}

	/**
	 * Returns the plano saude with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the plano saude
	 * @return the plano saude
	 * @throws NoSuchPlanoSaudeException if a plano saude with the primary key could not be found
	 */
	@Override
	public PlanoSaude findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPlanoSaudeException {

		PlanoSaude planoSaude = fetchByPrimaryKey(primaryKey);

		if (planoSaude == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPlanoSaudeException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return planoSaude;
	}

	/**
	 * Returns the plano saude with the primary key or throws a <code>NoSuchPlanoSaudeException</code> if it could not be found.
	 *
	 * @param plano_id the primary key of the plano saude
	 * @return the plano saude
	 * @throws NoSuchPlanoSaudeException if a plano saude with the primary key could not be found
	 */
	@Override
	public PlanoSaude findByPrimaryKey(long plano_id)
		throws NoSuchPlanoSaudeException {

		return findByPrimaryKey((Serializable)plano_id);
	}

	/**
	 * Returns the plano saude with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param plano_id the primary key of the plano saude
	 * @return the plano saude, or <code>null</code> if a plano saude with the primary key could not be found
	 */
	@Override
	public PlanoSaude fetchByPrimaryKey(long plano_id) {
		return fetchByPrimaryKey((Serializable)plano_id);
	}

	/**
	 * Returns all the plano saudes.
	 *
	 * @return the plano saudes
	 */
	@Override
	public List<PlanoSaude> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the plano saudes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PlanoSaudeModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of plano saudes
	 * @param end the upper bound of the range of plano saudes (not inclusive)
	 * @return the range of plano saudes
	 */
	@Override
	public List<PlanoSaude> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the plano saudes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PlanoSaudeModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @deprecated As of Mueller (7.2.x), replaced by {@link #findAll(int, int, OrderByComparator)}
	 * @param start the lower bound of the range of plano saudes
	 * @param end the upper bound of the range of plano saudes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of plano saudes
	 */
	@Deprecated
	@Override
	public List<PlanoSaude> findAll(
		int start, int end, OrderByComparator<PlanoSaude> orderByComparator,
		boolean useFinderCache) {

		return findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the plano saudes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>PlanoSaudeModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of plano saudes
	 * @param end the upper bound of the range of plano saudes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of plano saudes
	 */
	@Override
	public List<PlanoSaude> findAll(
		int start, int end, OrderByComparator<PlanoSaude> orderByComparator) {

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

		List<PlanoSaude> list = (List<PlanoSaude>)finderCache.getResult(
			finderPath, finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_PLANOSAUDE);

				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PLANOSAUDE;

				if (pagination) {
					sql = sql.concat(PlanoSaudeModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PlanoSaude>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<PlanoSaude>)QueryUtil.list(
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
	 * Removes all the plano saudes from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (PlanoSaude planoSaude : findAll()) {
			remove(planoSaude);
		}
	}

	/**
	 * Returns the number of plano saudes.
	 *
	 * @return the number of plano saudes
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PLANOSAUDE);

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
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "plano_id";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PLANOSAUDE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PlanoSaudeModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the plano saude persistence.
	 */
	@Activate
	public void activate() {
		PlanoSaudeModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		PlanoSaudeModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, PlanoSaudeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, PlanoSaudeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindBydescricao = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, PlanoSaudeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBydescricao",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindBydescricao = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, PlanoSaudeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBydescricao",
			new String[] {String.class.getName()},
			PlanoSaudeModelImpl.DESCRICAO_COLUMN_BITMASK);

		_finderPathCountBydescricao = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBydescricao",
			new String[] {String.class.getName()});
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(PlanoSaudeImpl.class.getName());
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
				"value.object.column.bitmask.enabled.br.com.liferay.test.model.PlanoSaude"),
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

	private static final String _SQL_SELECT_PLANOSAUDE =
		"SELECT planoSaude FROM PlanoSaude planoSaude";

	private static final String _SQL_SELECT_PLANOSAUDE_WHERE =
		"SELECT planoSaude FROM PlanoSaude planoSaude WHERE ";

	private static final String _SQL_COUNT_PLANOSAUDE =
		"SELECT COUNT(planoSaude) FROM PlanoSaude planoSaude";

	private static final String _SQL_COUNT_PLANOSAUDE_WHERE =
		"SELECT COUNT(planoSaude) FROM PlanoSaude planoSaude WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "planoSaude.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No PlanoSaude exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No PlanoSaude exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		PlanoSaudePersistenceImpl.class);

	static {
		try {
			Class.forName(FirstPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException cnfe) {
			throw new ExceptionInInitializerError(cnfe);
		}
	}

}