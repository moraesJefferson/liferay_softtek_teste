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

import br.com.liferay.test.exception.NoSuchPessoaException;
import br.com.liferay.test.model.Pessoa;

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the pessoa service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PessoaUtil
 * @generated
 */
@ProviderType
public interface PessoaPersistence extends BasePersistence<Pessoa> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PessoaUtil} to access the pessoa persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the pessoa in the entity cache if it is enabled.
	 *
	 * @param pessoa the pessoa
	 */
	public void cacheResult(Pessoa pessoa);

	/**
	 * Caches the pessoas in the entity cache if it is enabled.
	 *
	 * @param pessoas the pessoas
	 */
	public void cacheResult(java.util.List<Pessoa> pessoas);

	/**
	 * Creates a new pessoa with the primary key. Does not add the pessoa to the database.
	 *
	 * @param id the primary key for the new pessoa
	 * @return the new pessoa
	 */
	public Pessoa create(long id);

	/**
	 * Removes the pessoa with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the pessoa
	 * @return the pessoa that was removed
	 * @throws NoSuchPessoaException if a pessoa with the primary key could not be found
	 */
	public Pessoa remove(long id) throws NoSuchPessoaException;

	public Pessoa updateImpl(Pessoa pessoa);

	/**
	 * Returns the pessoa with the primary key or throws a <code>NoSuchPessoaException</code> if it could not be found.
	 *
	 * @param id the primary key of the pessoa
	 * @return the pessoa
	 * @throws NoSuchPessoaException if a pessoa with the primary key could not be found
	 */
	public Pessoa findByPrimaryKey(long id) throws NoSuchPessoaException;

	/**
	 * Returns the pessoa with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the pessoa
	 * @return the pessoa, or <code>null</code> if a pessoa with the primary key could not be found
	 */
	public Pessoa fetchByPrimaryKey(long id);

	/**
	 * Returns all the pessoas.
	 *
	 * @return the pessoas
	 */
	public java.util.List<Pessoa> findAll();

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
	public java.util.List<Pessoa> findAll(int start, int end);

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
	public java.util.List<Pessoa> findAll(
		int start, int end, OrderByComparator<Pessoa> orderByComparator,
		boolean useFinderCache);

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
	public java.util.List<Pessoa> findAll(
		int start, int end, OrderByComparator<Pessoa> orderByComparator);

	/**
	 * Removes all the pessoas from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of pessoas.
	 *
	 * @return the number of pessoas
	 */
	public int countAll();

}