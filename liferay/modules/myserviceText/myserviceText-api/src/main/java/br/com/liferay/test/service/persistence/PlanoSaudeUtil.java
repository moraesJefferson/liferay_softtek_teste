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

import br.com.liferay.test.model.PlanoSaude;

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
 * The persistence utility for the plano saude service. This utility wraps <code>br.com.liferay.test.service.persistence.impl.PlanoSaudePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanoSaudePersistence
 * @generated
 */
@ProviderType
public class PlanoSaudeUtil {

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
	public static void clearCache(PlanoSaude planoSaude) {
		getPersistence().clearCache(planoSaude);
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
	public static Map<Serializable, PlanoSaude> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PlanoSaude> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PlanoSaude> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PlanoSaude> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PlanoSaude> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PlanoSaude update(PlanoSaude planoSaude) {
		return getPersistence().update(planoSaude);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PlanoSaude update(
		PlanoSaude planoSaude, ServiceContext serviceContext) {

		return getPersistence().update(planoSaude, serviceContext);
	}

	/**
	 * Returns all the plano saudes where descricao = &#63;.
	 *
	 * @param descricao the descricao
	 * @return the matching plano saudes
	 */
	public static List<PlanoSaude> findBydescricao(String descricao) {
		return getPersistence().findBydescricao(descricao);
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
	public static List<PlanoSaude> findBydescricao(
		String descricao, int start, int end) {

		return getPersistence().findBydescricao(descricao, start, end);
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
	public static List<PlanoSaude> findBydescricao(
		String descricao, int start, int end,
		OrderByComparator<PlanoSaude> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBydescricao(
			descricao, start, end, orderByComparator, useFinderCache);
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
	public static List<PlanoSaude> findBydescricao(
		String descricao, int start, int end,
		OrderByComparator<PlanoSaude> orderByComparator) {

		return getPersistence().findBydescricao(
			descricao, start, end, orderByComparator);
	}

	/**
	 * Returns the first plano saude in the ordered set where descricao = &#63;.
	 *
	 * @param descricao the descricao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plano saude
	 * @throws NoSuchPlanoSaudeException if a matching plano saude could not be found
	 */
	public static PlanoSaude findBydescricao_First(
			String descricao, OrderByComparator<PlanoSaude> orderByComparator)
		throws br.com.liferay.test.exception.NoSuchPlanoSaudeException {

		return getPersistence().findBydescricao_First(
			descricao, orderByComparator);
	}

	/**
	 * Returns the first plano saude in the ordered set where descricao = &#63;.
	 *
	 * @param descricao the descricao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plano saude, or <code>null</code> if a matching plano saude could not be found
	 */
	public static PlanoSaude fetchBydescricao_First(
		String descricao, OrderByComparator<PlanoSaude> orderByComparator) {

		return getPersistence().fetchBydescricao_First(
			descricao, orderByComparator);
	}

	/**
	 * Returns the last plano saude in the ordered set where descricao = &#63;.
	 *
	 * @param descricao the descricao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plano saude
	 * @throws NoSuchPlanoSaudeException if a matching plano saude could not be found
	 */
	public static PlanoSaude findBydescricao_Last(
			String descricao, OrderByComparator<PlanoSaude> orderByComparator)
		throws br.com.liferay.test.exception.NoSuchPlanoSaudeException {

		return getPersistence().findBydescricao_Last(
			descricao, orderByComparator);
	}

	/**
	 * Returns the last plano saude in the ordered set where descricao = &#63;.
	 *
	 * @param descricao the descricao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plano saude, or <code>null</code> if a matching plano saude could not be found
	 */
	public static PlanoSaude fetchBydescricao_Last(
		String descricao, OrderByComparator<PlanoSaude> orderByComparator) {

		return getPersistence().fetchBydescricao_Last(
			descricao, orderByComparator);
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
	public static PlanoSaude[] findBydescricao_PrevAndNext(
			long plano_id, String descricao,
			OrderByComparator<PlanoSaude> orderByComparator)
		throws br.com.liferay.test.exception.NoSuchPlanoSaudeException {

		return getPersistence().findBydescricao_PrevAndNext(
			plano_id, descricao, orderByComparator);
	}

	/**
	 * Removes all the plano saudes where descricao = &#63; from the database.
	 *
	 * @param descricao the descricao
	 */
	public static void removeBydescricao(String descricao) {
		getPersistence().removeBydescricao(descricao);
	}

	/**
	 * Returns the number of plano saudes where descricao = &#63;.
	 *
	 * @param descricao the descricao
	 * @return the number of matching plano saudes
	 */
	public static int countBydescricao(String descricao) {
		return getPersistence().countBydescricao(descricao);
	}

	/**
	 * Caches the plano saude in the entity cache if it is enabled.
	 *
	 * @param planoSaude the plano saude
	 */
	public static void cacheResult(PlanoSaude planoSaude) {
		getPersistence().cacheResult(planoSaude);
	}

	/**
	 * Caches the plano saudes in the entity cache if it is enabled.
	 *
	 * @param planoSaudes the plano saudes
	 */
	public static void cacheResult(List<PlanoSaude> planoSaudes) {
		getPersistence().cacheResult(planoSaudes);
	}

	/**
	 * Creates a new plano saude with the primary key. Does not add the plano saude to the database.
	 *
	 * @param plano_id the primary key for the new plano saude
	 * @return the new plano saude
	 */
	public static PlanoSaude create(long plano_id) {
		return getPersistence().create(plano_id);
	}

	/**
	 * Removes the plano saude with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param plano_id the primary key of the plano saude
	 * @return the plano saude that was removed
	 * @throws NoSuchPlanoSaudeException if a plano saude with the primary key could not be found
	 */
	public static PlanoSaude remove(long plano_id)
		throws br.com.liferay.test.exception.NoSuchPlanoSaudeException {

		return getPersistence().remove(plano_id);
	}

	public static PlanoSaude updateImpl(PlanoSaude planoSaude) {
		return getPersistence().updateImpl(planoSaude);
	}

	/**
	 * Returns the plano saude with the primary key or throws a <code>NoSuchPlanoSaudeException</code> if it could not be found.
	 *
	 * @param plano_id the primary key of the plano saude
	 * @return the plano saude
	 * @throws NoSuchPlanoSaudeException if a plano saude with the primary key could not be found
	 */
	public static PlanoSaude findByPrimaryKey(long plano_id)
		throws br.com.liferay.test.exception.NoSuchPlanoSaudeException {

		return getPersistence().findByPrimaryKey(plano_id);
	}

	/**
	 * Returns the plano saude with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param plano_id the primary key of the plano saude
	 * @return the plano saude, or <code>null</code> if a plano saude with the primary key could not be found
	 */
	public static PlanoSaude fetchByPrimaryKey(long plano_id) {
		return getPersistence().fetchByPrimaryKey(plano_id);
	}

	/**
	 * Returns all the plano saudes.
	 *
	 * @return the plano saudes
	 */
	public static List<PlanoSaude> findAll() {
		return getPersistence().findAll();
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
	public static List<PlanoSaude> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<PlanoSaude> findAll(
		int start, int end, OrderByComparator<PlanoSaude> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
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
	public static List<PlanoSaude> findAll(
		int start, int end, OrderByComparator<PlanoSaude> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Removes all the plano saudes from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of plano saudes.
	 *
	 * @return the number of plano saudes
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PlanoSaudePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<PlanoSaudePersistence, PlanoSaudePersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(PlanoSaudePersistence.class);

		ServiceTracker<PlanoSaudePersistence, PlanoSaudePersistence>
			serviceTracker =
				new ServiceTracker
					<PlanoSaudePersistence, PlanoSaudePersistence>(
						bundle.getBundleContext(), PlanoSaudePersistence.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}