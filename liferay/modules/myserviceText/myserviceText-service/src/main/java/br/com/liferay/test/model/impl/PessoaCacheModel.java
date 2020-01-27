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

package br.com.liferay.test.model.impl;

import br.com.liferay.test.model.Pessoa;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing Pessoa in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class PessoaCacheModel implements CacheModel<Pessoa>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PessoaCacheModel)) {
			return false;
		}

		PessoaCacheModel pessoaCacheModel = (PessoaCacheModel)obj;

		if (id == pessoaCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{name=");
		sb.append(name);
		sb.append(", data_nascimento=");
		sb.append(data_nascimento);
		sb.append(", rg=");
		sb.append(rg);
		sb.append(", data_expedicao_rg=");
		sb.append(data_expedicao_rg);
		sb.append(", cpf=");
		sb.append(cpf);
		sb.append(", nome_pai=");
		sb.append(nome_pai);
		sb.append(", nome_mae=");
		sb.append(nome_mae);
		sb.append(", naturalidade=");
		sb.append(naturalidade);
		sb.append(", uf=");
		sb.append(uf);
		sb.append(", id=");
		sb.append(id);
		sb.append(", plano_id=");
		sb.append(plano_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Pessoa toEntityModel() {
		PessoaImpl pessoaImpl = new PessoaImpl();

		if (name == null) {
			pessoaImpl.setName("");
		}
		else {
			pessoaImpl.setName(name);
		}

		if (data_nascimento == Long.MIN_VALUE) {
			pessoaImpl.setData_nascimento(null);
		}
		else {
			pessoaImpl.setData_nascimento(new Date(data_nascimento));
		}

		if (rg == null) {
			pessoaImpl.setRg("");
		}
		else {
			pessoaImpl.setRg(rg);
		}

		if (data_expedicao_rg == Long.MIN_VALUE) {
			pessoaImpl.setData_expedicao_rg(null);
		}
		else {
			pessoaImpl.setData_expedicao_rg(new Date(data_expedicao_rg));
		}

		if (cpf == null) {
			pessoaImpl.setCpf("");
		}
		else {
			pessoaImpl.setCpf(cpf);
		}

		if (nome_pai == null) {
			pessoaImpl.setNome_pai("");
		}
		else {
			pessoaImpl.setNome_pai(nome_pai);
		}

		if (nome_mae == null) {
			pessoaImpl.setNome_mae("");
		}
		else {
			pessoaImpl.setNome_mae(nome_mae);
		}

		if (naturalidade == null) {
			pessoaImpl.setNaturalidade("");
		}
		else {
			pessoaImpl.setNaturalidade(naturalidade);
		}

		if (uf == null) {
			pessoaImpl.setUf("");
		}
		else {
			pessoaImpl.setUf(uf);
		}

		pessoaImpl.setId(id);
		pessoaImpl.setPlano_id(plano_id);

		pessoaImpl.resetOriginalValues();

		return pessoaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		name = objectInput.readUTF();
		data_nascimento = objectInput.readLong();
		rg = objectInput.readUTF();
		data_expedicao_rg = objectInput.readLong();
		cpf = objectInput.readUTF();
		nome_pai = objectInput.readUTF();
		nome_mae = objectInput.readUTF();
		naturalidade = objectInput.readUTF();
		uf = objectInput.readUTF();

		id = objectInput.readLong();

		plano_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeLong(data_nascimento);

		if (rg == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(rg);
		}

		objectOutput.writeLong(data_expedicao_rg);

		if (cpf == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cpf);
		}

		if (nome_pai == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nome_pai);
		}

		if (nome_mae == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nome_mae);
		}

		if (naturalidade == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(naturalidade);
		}

		if (uf == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uf);
		}

		objectOutput.writeLong(id);

		objectOutput.writeLong(plano_id);
	}

	public String name;
	public long data_nascimento;
	public String rg;
	public long data_expedicao_rg;
	public String cpf;
	public String nome_pai;
	public String nome_mae;
	public String naturalidade;
	public String uf;
	public long id;
	public long plano_id;

}