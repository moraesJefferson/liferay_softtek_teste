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

package br.com.liferay.test.service;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for PlanoSaude. This utility wraps
 * <code>br.com.liferay.test.service.impl.PlanoSaudeLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see PlanoSaudeLocalService
 * @generated
 */
@ProviderType
public class PlanoSaudeLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.liferay.test.service.impl.PlanoSaudeLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the plano saude to the database. Also notifies the appropriate model listeners.
	 *
	 * @param planoSaude the plano saude
	 * @return the plano saude that was added
	 */
	public static br.com.liferay.test.model.PlanoSaude addPlanoSaude(
		br.com.liferay.test.model.PlanoSaude planoSaude) {

		return getService().addPlanoSaude(planoSaude);
	}

	/**
	 * Creates a new plano saude with the primary key. Does not add the plano saude to the database.
	 *
	 * @param plano_id the primary key for the new plano saude
	 * @return the new plano saude
	 */
	public static br.com.liferay.test.model.PlanoSaude createPlanoSaude(
		long plano_id) {

		return getService().createPlanoSaude(plano_id);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the plano saude with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param plano_id the primary key of the plano saude
	 * @return the plano saude that was removed
	 * @throws PortalException if a plano saude with the primary key could not be found
	 */
	public static br.com.liferay.test.model.PlanoSaude deletePlanoSaude(
			long plano_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePlanoSaude(plano_id);
	}

	/**
	 * Deletes the plano saude from the database. Also notifies the appropriate model listeners.
	 *
	 * @param planoSaude the plano saude
	 * @return the plano saude that was removed
	 */
	public static br.com.liferay.test.model.PlanoSaude deletePlanoSaude(
		br.com.liferay.test.model.PlanoSaude planoSaude) {

		return getService().deletePlanoSaude(planoSaude);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>br.com.liferay.test.model.impl.PlanoSaudeModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>br.com.liferay.test.model.impl.PlanoSaudeModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static br.com.liferay.test.model.PlanoSaude fetchPlanoSaude(
		long plano_id) {

		return getService().fetchPlanoSaude(plano_id);
	}

	public static java.util.List<br.com.liferay.test.model.PlanoSaude>
		findAll() {

		return getService().findAll();
	}

	public static java.util.List<br.com.liferay.test.model.PlanoSaude>
		findByDescricao(String descricao) {

		return getService().findByDescricao(descricao);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the plano saude with the primary key.
	 *
	 * @param plano_id the primary key of the plano saude
	 * @return the plano saude
	 * @throws PortalException if a plano saude with the primary key could not be found
	 */
	public static br.com.liferay.test.model.PlanoSaude getPlanoSaude(
			long plano_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPlanoSaude(plano_id);
	}

	/**
	 * Returns a range of all the plano saudes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>br.com.liferay.test.model.impl.PlanoSaudeModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of plano saudes
	 * @param end the upper bound of the range of plano saudes (not inclusive)
	 * @return the range of plano saudes
	 */
	public static java.util.List<br.com.liferay.test.model.PlanoSaude>
		getPlanoSaudes(int start, int end) {

		return getService().getPlanoSaudes(start, end);
	}

	/**
	 * Returns the number of plano saudes.
	 *
	 * @return the number of plano saudes
	 */
	public static int getPlanoSaudesCount() {
		return getService().getPlanoSaudesCount();
	}

	/**
	 * Updates the plano saude in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param planoSaude the plano saude
	 * @return the plano saude that was updated
	 */
	public static br.com.liferay.test.model.PlanoSaude updatePlanoSaude(
		br.com.liferay.test.model.PlanoSaude planoSaude) {

		return getService().updatePlanoSaude(planoSaude);
	}

	public static PlanoSaudeLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<PlanoSaudeLocalService, PlanoSaudeLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(PlanoSaudeLocalService.class);

		ServiceTracker<PlanoSaudeLocalService, PlanoSaudeLocalService>
			serviceTracker =
				new ServiceTracker
					<PlanoSaudeLocalService, PlanoSaudeLocalService>(
						bundle.getBundleContext(), PlanoSaudeLocalService.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}