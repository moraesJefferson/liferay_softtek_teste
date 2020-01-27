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

import br.com.liferay.test.exception.NoSuchPlanoSaudeException;
import br.com.liferay.test.model.PlanoSaude;

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the plano saude service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanoSaudeUtil
 * @generated
 */
@ProviderType
public interface PlanoSaudePersistence extends BasePersistence<PlanoSaude> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PlanoSaudeUtil} to access the plano saude persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the plano saudes where descricao = &#63;.
	 *
	 * @param descricao the descricao
	 * @return the matching plano saudes
	 */
	public java.util.List<PlanoSaude> findBydescricao(String descricao);

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
	public java.util.List<PlanoSaude> findBydescricao(
		String descricao, int start, int end);

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
	public java.util.List<PlanoSaude> findBydescricao(
		String descricao, int start, int end,
		OrderByComparator<PlanoSaude> orderByComparator,
		boolean useFinderCache);

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
	public java.util.List<PlanoSaude> findBydescricao(
		String descricao, int start, int end,
		OrderByComparator<PlanoSaude> orderByComparator);

	/**
	 * Returns the first plano saude in the ordered set where descricao = &#63;.
	 *
	 * @param descricao the descricao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plano saude
	 * @throws NoSuchPlanoSaudeException if a matching plano saude could not be found
	 */
	public PlanoSaude findBydescricao_First(
			String descricao, OrderByComparator<PlanoSaude> orderByComparator)
		throws NoSuchPlanoSaudeException;

	/**
	 * Returns the first plano saude in the ordered set where descricao = &#63;.
	 *
	 * @param descricao the descricao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plano saude, or <code>null</code> if a matching plano saude could not be found
	 */
	public PlanoSaude fetchBydescricao_First(
		String descricao, OrderByComparator<PlanoSaude> orderByComparator);

	/**
	 * Returns the last plano saude in the ordered set where descricao = &#63;.
	 *
	 * @param descricao the descricao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plano saude
	 * @throws NoSuchPlanoSaudeException if a matching plano saude could not be found
	 */
	public PlanoSaude findBydescricao_Last(
			String descricao, OrderByComparator<PlanoSaude> orderByComparator)
		throws NoSuchPlanoSaudeException;

	/**
	 * Returns the last plano saude in the ordered set where descricao = &#63;.
	 *
	 * @param descricao the descricao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plano saude, or <code>null</code> if a matching plano saude could not be found
	 */
	public PlanoSaude fetchBydescricao_Last(
		String descricao, OrderByComparator<PlanoSaude> orderByComparator);

	/**
	 * Returns the plano saudes before and after the current plano saude in the ordered set where descricao = &#63;.
	 *
	 * @param plano_id the primary key of the current plano saude
	 * @param descricao the descricao
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plano saude
	 * @throws NoSuchPlanoSaudeException if a plano saude with the primary key could not be found
	 */
	public PlanoSaude[] findBydescricao_PrevAndNext(
			long plano_id, String descricao,
			OrderByComparator<PlanoSaude> orderByComparator)
		throws NoSuchPlanoSaudeException;

	/**
	 * Removes all the plano saudes where descricao = &#63; from the database.
	 *
	 * @param descricao the descricao
	 */
	public void removeBydescricao(String descricao);

	/**
	 * Returns the number of plano saudes where descricao = &#63;.
	 *
	 * @param descricao the descricao
	 * @return the number of matching plano saudes
	 */
	public int countBydescricao(String descricao);

	/**
	 * Caches the plano saude in the entity cache if it is enabled.
	 *
	 * @param planoSaude the plano saude
	 */
	public void cacheResult(PlanoSaude planoSaude);

	/**
	 * Caches the plano saudes in the entity cache if it is enabled.
	 *
	 * @param planoSaudes the plano saudes
	 */
	public void cacheResult(java.util.List<PlanoSaude> planoSaudes);

	/**
	 * Creates a new plano saude with the primary key. Does not add the plano saude to the database.
	 *
	 * @param plano_id the primary key for the new plano saude
	 * @return the new plano saude
	 */
	public PlanoSaude create(long plano_id);

	/**
	 * Removes the plano saude with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param plano_id the primary key of the plano saude
	 * @return the plano saude that was removed
	 * @throws NoSuchPlanoSaudeException if a plano saude with the primary key could not be found
	 */
	public PlanoSaude remove(long plano_id) throws NoSuchPlanoSaudeException;

	public PlanoSaude updateImpl(PlanoSaude planoSaude);

	/**
	 * Returns the plano saude with the primary key or throws a <code>NoSuchPlanoSaudeException</code> if it could not be found.
	 *
	 * @param plano_id the primary key of the plano saude
	 * @return the plano saude
	 * @throws NoSuchPlanoSaudeException if a plano saude with the primary key could not be found
	 */
	public PlanoSaude findByPrimaryKey(long plano_id)
		throws NoSuchPlanoSaudeException;

	/**
	 * Returns the plano saude with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param plano_id the primary key of the plano saude
	 * @return the plano saude, or <code>null</code> if a plano saude with the primary key could not be found
	 */
	public PlanoSaude fetchByPrimaryKey(long plano_id);

	/**
	 * Returns all the plano saudes.
	 *
	 * @return the plano saudes
	 */
	public java.util.List<PlanoSaude> findAll();

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
	public java.util.List<PlanoSaude> findAll(int start, int end);

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
	public java.util.List<PlanoSaude> findAll(
		int start, int end, OrderByComparator<PlanoSaude> orderByComparator,
		boolean useFinderCache);

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
	public java.util.List<PlanoSaude> findAll(
		int start, int end, OrderByComparator<PlanoSaude> orderByComparator);

	/**
	 * Removes all the plano saudes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of plano saudes.
	 *
	 * @return the number of plano saudes
	 */
	public int countAll();

}