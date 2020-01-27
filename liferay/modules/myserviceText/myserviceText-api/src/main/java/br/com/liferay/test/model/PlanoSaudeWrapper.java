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

package br.com.liferay.test.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <p>
 * This class is a wrapper for {@link PlanoSaude}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanoSaude
 * @generated
 */
@ProviderType
public class PlanoSaudeWrapper
	extends BaseModelWrapper<PlanoSaude>
	implements PlanoSaude, ModelWrapper<PlanoSaude> {

	public PlanoSaudeWrapper(PlanoSaude planoSaude) {
		super(planoSaude);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("plano_id", getPlano_id());
		attributes.put("descricao", getDescricao());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long plano_id = (Long)attributes.get("plano_id");

		if (plano_id != null) {
			setPlano_id(plano_id);
		}

		String descricao = (String)attributes.get("descricao");

		if (descricao != null) {
			setDescricao(descricao);
		}
	}

	/**
	 * Returns the descricao of this plano saude.
	 *
	 * @return the descricao of this plano saude
	 */
	@Override
	public String getDescricao() {
		return model.getDescricao();
	}

	/**
	 * Returns the plano_id of this plano saude.
	 *
	 * @return the plano_id of this plano saude
	 */
	@Override
	public long getPlano_id() {
		return model.getPlano_id();
	}

	/**
	 * Returns the primary key of this plano saude.
	 *
	 * @return the primary key of this plano saude
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the descricao of this plano saude.
	 *
	 * @param descricao the descricao of this plano saude
	 */
	@Override
	public void setDescricao(String descricao) {
		model.setDescricao(descricao);
	}

	/**
	 * Sets the plano_id of this plano saude.
	 *
	 * @param plano_id the plano_id of this plano saude
	 */
	@Override
	public void setPlano_id(long plano_id) {
		model.setPlano_id(plano_id);
	}

	/**
	 * Sets the primary key of this plano saude.
	 *
	 * @param primaryKey the primary key of this plano saude
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected PlanoSaudeWrapper wrap(PlanoSaude planoSaude) {
		return new PlanoSaudeWrapper(planoSaude);
	}

}