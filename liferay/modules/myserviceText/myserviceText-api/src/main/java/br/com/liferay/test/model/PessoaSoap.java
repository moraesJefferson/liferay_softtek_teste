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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class PessoaSoap implements Serializable {

	public static PessoaSoap toSoapModel(Pessoa model) {
		PessoaSoap soapModel = new PessoaSoap();

		soapModel.setName(model.getName());
		soapModel.setData_nascimento(model.getData_nascimento());
		soapModel.setRg(model.getRg());
		soapModel.setData_expedicao_rg(model.getData_expedicao_rg());
		soapModel.setCpf(model.getCpf());
		soapModel.setNome_pai(model.getNome_pai());
		soapModel.setNome_mae(model.getNome_mae());
		soapModel.setNaturalidade(model.getNaturalidade());
		soapModel.setUf(model.getUf());
		soapModel.setId(model.getId());
		soapModel.setPlano_id(model.getPlano_id());

		return soapModel;
	}

	public static PessoaSoap[] toSoapModels(Pessoa[] models) {
		PessoaSoap[] soapModels = new PessoaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PessoaSoap[][] toSoapModels(Pessoa[][] models) {
		PessoaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PessoaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PessoaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PessoaSoap[] toSoapModels(List<Pessoa> models) {
		List<PessoaSoap> soapModels = new ArrayList<PessoaSoap>(models.size());

		for (Pessoa model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PessoaSoap[soapModels.size()]);
	}

	public PessoaSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public Date getData_nascimento() {
		return _data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		_data_nascimento = data_nascimento;
	}

	public String getRg() {
		return _rg;
	}

	public void setRg(String rg) {
		_rg = rg;
	}

	public Date getData_expedicao_rg() {
		return _data_expedicao_rg;
	}

	public void setData_expedicao_rg(Date data_expedicao_rg) {
		_data_expedicao_rg = data_expedicao_rg;
	}

	public String getCpf() {
		return _cpf;
	}

	public void setCpf(String cpf) {
		_cpf = cpf;
	}

	public String getNome_pai() {
		return _nome_pai;
	}

	public void setNome_pai(String nome_pai) {
		_nome_pai = nome_pai;
	}

	public String getNome_mae() {
		return _nome_mae;
	}

	public void setNome_mae(String nome_mae) {
		_nome_mae = nome_mae;
	}

	public String getNaturalidade() {
		return _naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		_naturalidade = naturalidade;
	}

	public String getUf() {
		return _uf;
	}

	public void setUf(String uf) {
		_uf = uf;
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getPlano_id() {
		return _plano_id;
	}

	public void setPlano_id(long plano_id) {
		_plano_id = plano_id;
	}

	private String _name;
	private Date _data_nascimento;
	private String _rg;
	private Date _data_expedicao_rg;
	private String _cpf;
	private String _nome_pai;
	private String _nome_mae;
	private String _naturalidade;
	private String _uf;
	private long _id;
	private long _plano_id;

}