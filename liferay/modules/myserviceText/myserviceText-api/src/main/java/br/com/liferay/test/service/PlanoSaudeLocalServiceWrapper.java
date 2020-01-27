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

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides a wrapper for {@link PlanoSaudeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PlanoSaudeLocalService
 * @generated
 */
@ProviderType
public class PlanoSaudeLocalServiceWrapper
	implements PlanoSaudeLocalService, ServiceWrapper<PlanoSaudeLocalService> {

	public PlanoSaudeLocalServiceWrapper(
		PlanoSaudeLocalService planoSaudeLocalService) {

		_planoSaudeLocalService = planoSaudeLocalService;
	}

	/**
	 * Adds the plano saude to the database. Also notifies the appropriate model listeners.
	 *
	 * @param planoSaude the plano saude
	 * @return the plano saude that was added
	 */
	@Override
	public br.com.liferay.test.model.PlanoSaude addPlanoSaude(
		br.com.liferay.test.model.PlanoSaude planoSaude) {

		return _planoSaudeLocalService.addPlanoSaude(planoSaude);
	}

	/**
	 * Creates a new plano saude with the primary key. Does not add the plano saude to the database.
	 *
	 * @param plano_id the primary key for the new plano saude
	 * @return the new plano saude
	 */
	@Override
	public br.com.liferay.test.model.PlanoSaude createPlanoSaude(
		long plano_id) {

		return _planoSaudeLocalService.createPlanoSaude(plano_id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planoSaudeLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the plano saude with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param plano_id the primary key of the plano saude
	 * @return the plano saude that was removed
	 * @throws PortalException if a plano saude with the primary key could not be found
	 */
	@Override
	public br.com.liferay.test.model.PlanoSaude deletePlanoSaude(long plano_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planoSaudeLocalService.deletePlanoSaude(plano_id);
	}

	/**
	 * Deletes the plano saude from the database. Also notifies the appropriate model listeners.
	 *
	 * @param planoSaude the plano saude
	 * @return the plano saude that was removed
	 */
	@Override
	public br.com.liferay.test.model.PlanoSaude deletePlanoSaude(
		br.com.liferay.test.model.PlanoSaude planoSaude) {

		return _planoSaudeLocalService.deletePlanoSaude(planoSaude);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _planoSaudeLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _planoSaudeLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _planoSaudeLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _planoSaudeLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _planoSaudeLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _planoSaudeLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public br.com.liferay.test.model.PlanoSaude fetchPlanoSaude(long plano_id) {
		return _planoSaudeLocalService.fetchPlanoSaude(plano_id);
	}

	@Override
	public java.util.List<br.com.liferay.test.model.PlanoSaude> findAll() {
		return _planoSaudeLocalService.findAll();
	}

	@Override
	public java.util.List<br.com.liferay.test.model.PlanoSaude> findByDescricao(
		String descricao) {

		return _planoSaudeLocalService.findByDescricao(descricao);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _planoSaudeLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _planoSaudeLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _planoSaudeLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planoSaudeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the plano saude with the primary key.
	 *
	 * @param plano_id the primary key of the plano saude
	 * @return the plano saude
	 * @throws PortalException if a plano saude with the primary key could not be found
	 */
	@Override
	public br.com.liferay.test.model.PlanoSaude getPlanoSaude(long plano_id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planoSaudeLocalService.getPlanoSaude(plano_id);
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
	@Override
	public java.util.List<br.com.liferay.test.model.PlanoSaude> getPlanoSaudes(
		int start, int end) {

		return _planoSaudeLocalService.getPlanoSaudes(start, end);
	}

	/**
	 * Returns the number of plano saudes.
	 *
	 * @return the number of plano saudes
	 */
	@Override
	public int getPlanoSaudesCount() {
		return _planoSaudeLocalService.getPlanoSaudesCount();
	}

	/**
	 * Updates the plano saude in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param planoSaude the plano saude
	 * @return the plano saude that was updated
	 */
	@Override
	public br.com.liferay.test.model.PlanoSaude updatePlanoSaude(
		br.com.liferay.test.model.PlanoSaude planoSaude) {

		return _planoSaudeLocalService.updatePlanoSaude(planoSaude);
	}

	@Override
	public PlanoSaudeLocalService getWrappedService() {
		return _planoSaudeLocalService;
	}

	@Override
	public void setWrappedService(
		PlanoSaudeLocalService planoSaudeLocalService) {

		_planoSaudeLocalService = planoSaudeLocalService;
	}

	private PlanoSaudeLocalService _planoSaudeLocalService;

}