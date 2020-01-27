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

package br.com.liferay.test.service.persistence;

import br.com.liferay.test.model.Pessoa;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the pessoa service. This utility wraps <code>br.com.liferay.test.service.persistence.impl.PessoaPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PessoaPersistence
 * @generated
 */
@ProviderType
public class PessoaUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Pessoa pessoa) {
		getPersistence().clearCache(pessoa);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Pessoa> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Pessoa> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Pessoa> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Pessoa> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Pessoa> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Pessoa update(Pessoa pessoa) {
		return getPersistence().update(pessoa);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Pessoa update(Pessoa pessoa, ServiceContext serviceContext) {
		return getPersistence().update(pessoa, serviceContext);
	}

	/**
	 * Caches the pessoa in the entity cache if it is enabled.
	 *
	 * @param pessoa the pessoa
	 */
	public static void cacheResult(Pessoa pessoa) {
		getPersistence().cacheResult(pessoa);
	}

	/**
	 * Caches the pessoas in the entity cache if it is enabled.
	 *
	 * @param pessoas the pessoas
	 */
	public static void cacheResult(List<Pessoa> pessoas) {
		getPersistence().cacheResult(pessoas);
	}

	/**
	 * Creates a new pessoa with the primary key. Does not add the pessoa to the database.
	 *
	 * @param id the primary key for the new pessoa
	 * @return the new pessoa
	 */
	public static Pessoa create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the pessoa with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the pessoa
	 * @return the pessoa that was removed
	 * @throws NoSuchPessoaException if a pessoa with the primary key could not be found
	 */
	public static Pessoa remove(long id)
		throws br.com.liferay.test.exception.NoSuchPessoaException {

		return getPersistence().remove(id);
	}

	public static Pessoa updateImpl(Pessoa pessoa) {
		return getPersistence().updateImpl(pessoa);
	}

	/**
	 * Returns the pessoa with the primary key or throws a <code>NoSuchPessoaException</code> if it could not be found.
	 *
	 * @param id the primary key of the pessoa
	 * @return the pessoa
	 * @throws NoSuchPessoaException if a pessoa with the primary key could not be found
	 */
	public static Pessoa findByPrimaryKey(long id)
		throws br.com.liferay.test.exception.NoSuchPessoaException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the pessoa with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the pessoa
	 * @return the pessoa, or <code>null</code> if a pessoa with the primary key could not be found
	 */
	public static Pessoa fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the pessoas.
	 *
	 * @return the pessoas
	 */
	public static List<Pessoa> findAll() {
		return getPersistence().findAll();
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
	public static List<Pessoa> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<Pessoa> findAll(
		int start, int end, OrderByComparator<Pessoa> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
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
	public static List<Pessoa> findAll(
		int start, int end, OrderByComparator<Pessoa> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Removes all the pessoas from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of pessoas.
	 *
	 * @return the number of pessoas
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PessoaPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<PessoaPersistence, PessoaPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(PessoaPersistence.class);

		ServiceTracker<PessoaPersistence, PessoaPersistence> serviceTracker =
			new ServiceTracker<PessoaPersistence, PessoaPersistence>(
				bundle.getBundleContext(), PessoaPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}