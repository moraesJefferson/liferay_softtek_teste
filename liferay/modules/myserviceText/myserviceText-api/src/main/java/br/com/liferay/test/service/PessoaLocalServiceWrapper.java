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
 * Provides a wrapper for {@link PessoaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PessoaLocalService
 * @generated
 */
@ProviderType
public class PessoaLocalServiceWrapper
	implements PessoaLocalService, ServiceWrapper<PessoaLocalService> {

	public PessoaLocalServiceWrapper(PessoaLocalService pessoaLocalService) {
		_pessoaLocalService = pessoaLocalService;
	}

	/**
	 * Adds the pessoa to the database. Also notifies the appropriate model listeners.
	 *
	 * @param pessoa the pessoa
	 * @return the pessoa that was added
	 */
	@Override
	public br.com.liferay.test.model.Pessoa addPessoa(
		br.com.liferay.test.model.Pessoa pessoa) {

		return _pessoaLocalService.addPessoa(pessoa);
	}

	/**
	 * Creates a new pessoa with the primary key. Does not add the pessoa to the database.
	 *
	 * @param id the primary key for the new pessoa
	 * @return the new pessoa
	 */
	@Override
	public br.com.liferay.test.model.Pessoa createPessoa(long id) {
		return _pessoaLocalService.createPessoa(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pessoaLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the pessoa with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the pessoa
	 * @return the pessoa that was removed
	 * @throws PortalException if a pessoa with the primary key could not be found
	 */
	@Override
	public br.com.liferay.test.model.Pessoa deletePessoa(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pessoaLocalService.deletePessoa(id);
	}

	/**
	 * Deletes the pessoa from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pessoa the pessoa
	 * @return the pessoa that was removed
	 */
	@Override
	public br.com.liferay.test.model.Pessoa deletePessoa(
		br.com.liferay.test.model.Pessoa pessoa) {

		return _pessoaLocalService.deletePessoa(pessoa);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _pessoaLocalService.dynamicQuery();
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

		return _pessoaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>br.com.liferay.test.model.impl.PessoaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _pessoaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>br.com.liferay.test.model.impl.PessoaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _pessoaLocalService.dynamicQuery(
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

		return _pessoaLocalService.dynamicQueryCount(dynamicQuery);
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

		return _pessoaLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public br.com.liferay.test.model.Pessoa fetchPessoa(long id) {
		return _pessoaLocalService.fetchPessoa(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _pessoaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _pessoaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pessoaLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pessoaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the pessoa with the primary key.
	 *
	 * @param id the primary key of the pessoa
	 * @return the pessoa
	 * @throws PortalException if a pessoa with the primary key could not be found
	 */
	@Override
	public br.com.liferay.test.model.Pessoa getPessoa(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pessoaLocalService.getPessoa(id);
	}

	/**
	 * Returns a range of all the pessoas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>br.com.liferay.test.model.impl.PessoaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of pessoas
	 * @param end the upper bound of the range of pessoas (not inclusive)
	 * @return the range of pessoas
	 */
	@Override
	public java.util.List<br.com.liferay.test.model.Pessoa> getPessoas(
		int start, int end) {

		return _pessoaLocalService.getPessoas(start, end);
	}

	/**
	 * Returns the number of pessoas.
	 *
	 * @return the number of pessoas
	 */
	@Override
	public int getPessoasCount() {
		return _pessoaLocalService.getPessoasCount();
	}

	/**
	 * Updates the pessoa in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param pessoa the pessoa
	 * @return the pessoa that was updated
	 */
	@Override
	public br.com.liferay.test.model.Pessoa updatePessoa(
		br.com.liferay.test.model.Pessoa pessoa) {

		return _pessoaLocalService.updatePessoa(pessoa);
	}

	@Override
	public PessoaLocalService getWrappedService() {
		return _pessoaLocalService;
	}

	@Override
	public void setWrappedService(PessoaLocalService pessoaLocalService) {
		_pessoaLocalService = pessoaLocalService;
	}

	private PessoaLocalService _pessoaLocalService;

}