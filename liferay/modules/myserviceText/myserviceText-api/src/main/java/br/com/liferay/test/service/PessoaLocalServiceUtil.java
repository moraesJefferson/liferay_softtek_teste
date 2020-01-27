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
 * Provides the local service utility for Pessoa. This utility wraps
 * <code>br.com.liferay.test.service.impl.PessoaLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see PessoaLocalService
 * @generated
 */
@ProviderType
public class PessoaLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>br.com.liferay.test.service.impl.PessoaLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the pessoa to the database. Also notifies the appropriate model listeners.
	 *
	 * @param pessoa the pessoa
	 * @return the pessoa that was added
	 */
	public static br.com.liferay.test.model.Pessoa addPessoa(
		br.com.liferay.test.model.Pessoa pessoa) {

		return getService().addPessoa(pessoa);
	}

	/**
	 * Creates a new pessoa with the primary key. Does not add the pessoa to the database.
	 *
	 * @param id the primary key for the new pessoa
	 * @return the new pessoa
	 */
	public static br.com.liferay.test.model.Pessoa createPessoa(long id) {
		return getService().createPessoa(id);
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
	 * Deletes the pessoa with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the pessoa
	 * @return the pessoa that was removed
	 * @throws PortalException if a pessoa with the primary key could not be found
	 */
	public static br.com.liferay.test.model.Pessoa deletePessoa(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePessoa(id);
	}

	/**
	 * Deletes the pessoa from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pessoa the pessoa
	 * @return the pessoa that was removed
	 */
	public static br.com.liferay.test.model.Pessoa deletePessoa(
		br.com.liferay.test.model.Pessoa pessoa) {

		return getService().deletePessoa(pessoa);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>br.com.liferay.test.model.impl.PessoaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>br.com.liferay.test.model.impl.PessoaModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static br.com.liferay.test.model.Pessoa fetchPessoa(long id) {
		return getService().fetchPessoa(id);
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
	 * Returns the pessoa with the primary key.
	 *
	 * @param id the primary key of the pessoa
	 * @return the pessoa
	 * @throws PortalException if a pessoa with the primary key could not be found
	 */
	public static br.com.liferay.test.model.Pessoa getPessoa(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPessoa(id);
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
	public static java.util.List<br.com.liferay.test.model.Pessoa> getPessoas(
		int start, int end) {

		return getService().getPessoas(start, end);
	}

	/**
	 * Returns the number of pessoas.
	 *
	 * @return the number of pessoas
	 */
	public static int getPessoasCount() {
		return getService().getPessoasCount();
	}

	/**
	 * Updates the pessoa in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param pessoa the pessoa
	 * @return the pessoa that was updated
	 */
	public static br.com.liferay.test.model.Pessoa updatePessoa(
		br.com.liferay.test.model.Pessoa pessoa) {

		return getService().updatePessoa(pessoa);
	}

	public static PessoaLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<PessoaLocalService, PessoaLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(PessoaLocalService.class);

		ServiceTracker<PessoaLocalService, PessoaLocalService> serviceTracker =
			new ServiceTracker<PessoaLocalService, PessoaLocalService>(
				bundle.getBundleContext(), PessoaLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}