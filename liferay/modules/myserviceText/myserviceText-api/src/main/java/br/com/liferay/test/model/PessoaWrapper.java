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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <p>
 * This class is a wrapper for {@link Pessoa}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Pessoa
 * @generated
 */
@ProviderType
public class PessoaWrapper
	extends BaseModelWrapper<Pessoa> implements Pessoa, ModelWrapper<Pessoa> {

	public PessoaWrapper(Pessoa pessoa) {
		super(pessoa);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("name", getName());
		attributes.put("data_nascimento", getData_nascimento());
		attributes.put("rg", getRg());
		attributes.put("data_expedicao_rg", getData_expedicao_rg());
		attributes.put("cpf", getCpf());
		attributes.put("nome_pai", getNome_pai());
		attributes.put("nome_mae", getNome_mae());
		attributes.put("naturalidade", getNaturalidade());
		attributes.put("uf", getUf());
		attributes.put("id", getId());
		attributes.put("plano_id", getPlano_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Date data_nascimento = (Date)attributes.get("data_nascimento");

		if (data_nascimento != null) {
			setData_nascimento(data_nascimento);
		}

		String rg = (String)attributes.get("rg");

		if (rg != null) {
			setRg(rg);
		}

		Date data_expedicao_rg = (Date)attributes.get("data_expedicao_rg");

		if (data_expedicao_rg != null) {
			setData_expedicao_rg(data_expedicao_rg);
		}

		String cpf = (String)attributes.get("cpf");

		if (cpf != null) {
			setCpf(cpf);
		}

		String nome_pai = (String)attributes.get("nome_pai");

		if (nome_pai != null) {
			setNome_pai(nome_pai);
		}

		String nome_mae = (String)attributes.get("nome_mae");

		if (nome_mae != null) {
			setNome_mae(nome_mae);
		}

		String naturalidade = (String)attributes.get("naturalidade");

		if (naturalidade != null) {
			setNaturalidade(naturalidade);
		}

		String uf = (String)attributes.get("uf");

		if (uf != null) {
			setUf(uf);
		}

		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long plano_id = (Long)attributes.get("plano_id");

		if (plano_id != null) {
			setPlano_id(plano_id);
		}
	}

	/**
	 * Returns the cpf of this pessoa.
	 *
	 * @return the cpf of this pessoa
	 */
	@Override
	public String getCpf() {
		return model.getCpf();
	}

	/**
	 * Returns the data_expedicao_rg of this pessoa.
	 *
	 * @return the data_expedicao_rg of this pessoa
	 */
	@Override
	public Date getData_expedicao_rg() {
		return model.getData_expedicao_rg();
	}

	/**
	 * Returns the data_nascimento of this pessoa.
	 *
	 * @return the data_nascimento of this pessoa
	 */
	@Override
	public Date getData_nascimento() {
		return model.getData_nascimento();
	}

	/**
	 * Returns the ID of this pessoa.
	 *
	 * @return the ID of this pessoa
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the name of this pessoa.
	 *
	 * @return the name of this pessoa
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the naturalidade of this pessoa.
	 *
	 * @return the naturalidade of this pessoa
	 */
	@Override
	public String getNaturalidade() {
		return model.getNaturalidade();
	}

	/**
	 * Returns the nome_mae of this pessoa.
	 *
	 * @return the nome_mae of this pessoa
	 */
	@Override
	public String getNome_mae() {
		return model.getNome_mae();
	}

	/**
	 * Returns the nome_pai of this pessoa.
	 *
	 * @return the nome_pai of this pessoa
	 */
	@Override
	public String getNome_pai() {
		return model.getNome_pai();
	}

	/**
	 * Returns the plano_id of this pessoa.
	 *
	 * @return the plano_id of this pessoa
	 */
	@Override
	public long getPlano_id() {
		return model.getPlano_id();
	}

	/**
	 * Returns the primary key of this pessoa.
	 *
	 * @return the primary key of this pessoa
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the rg of this pessoa.
	 *
	 * @return the rg of this pessoa
	 */
	@Override
	public String getRg() {
		return model.getRg();
	}

	/**
	 * Returns the uf of this pessoa.
	 *
	 * @return the uf of this pessoa
	 */
	@Override
	public String getUf() {
		return model.getUf();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the cpf of this pessoa.
	 *
	 * @param cpf the cpf of this pessoa
	 */
	@Override
	public void setCpf(String cpf) {
		model.setCpf(cpf);
	}

	/**
	 * Sets the data_expedicao_rg of this pessoa.
	 *
	 * @param data_expedicao_rg the data_expedicao_rg of this pessoa
	 */
	@Override
	public void setData_expedicao_rg(Date data_expedicao_rg) {
		model.setData_expedicao_rg(data_expedicao_rg);
	}

	/**
	 * Sets the data_nascimento of this pessoa.
	 *
	 * @param data_nascimento the data_nascimento of this pessoa
	 */
	@Override
	public void setData_nascimento(Date data_nascimento) {
		model.setData_nascimento(data_nascimento);
	}

	/**
	 * Sets the ID of this pessoa.
	 *
	 * @param id the ID of this pessoa
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the name of this pessoa.
	 *
	 * @param name the name of this pessoa
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the naturalidade of this pessoa.
	 *
	 * @param naturalidade the naturalidade of this pessoa
	 */
	@Override
	public void setNaturalidade(String naturalidade) {
		model.setNaturalidade(naturalidade);
	}

	/**
	 * Sets the nome_mae of this pessoa.
	 *
	 * @param nome_mae the nome_mae of this pessoa
	 */
	@Override
	public void setNome_mae(String nome_mae) {
		model.setNome_mae(nome_mae);
	}

	/**
	 * Sets the nome_pai of this pessoa.
	 *
	 * @param nome_pai the nome_pai of this pessoa
	 */
	@Override
	public void setNome_pai(String nome_pai) {
		model.setNome_pai(nome_pai);
	}

	/**
	 * Sets the plano_id of this pessoa.
	 *
	 * @param plano_id the plano_id of this pessoa
	 */
	@Override
	public void setPlano_id(long plano_id) {
		model.setPlano_id(plano_id);
	}

	/**
	 * Sets the primary key of this pessoa.
	 *
	 * @param primaryKey the primary key of this pessoa
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the rg of this pessoa.
	 *
	 * @param rg the rg of this pessoa
	 */
	@Override
	public void setRg(String rg) {
		model.setRg(rg);
	}

	/**
	 * Sets the uf of this pessoa.
	 *
	 * @param uf the uf of this pessoa
	 */
	@Override
	public void setUf(String uf) {
		model.setUf(uf);
	}

	@Override
	protected PessoaWrapper wrap(Pessoa pessoa) {
		return new PessoaWrapper(pessoa);
	}

}