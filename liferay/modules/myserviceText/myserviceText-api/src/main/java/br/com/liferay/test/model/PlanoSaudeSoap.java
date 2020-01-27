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
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class PlanoSaudeSoap implements Serializable {

	public static PlanoSaudeSoap toSoapModel(PlanoSaude model) {
		PlanoSaudeSoap soapModel = new PlanoSaudeSoap();

		soapModel.setPlano_id(model.getPlano_id());
		soapModel.setDescricao(model.getDescricao());

		return soapModel;
	}

	public static PlanoSaudeSoap[] toSoapModels(PlanoSaude[] models) {
		PlanoSaudeSoap[] soapModels = new PlanoSaudeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PlanoSaudeSoap[][] toSoapModels(PlanoSaude[][] models) {
		PlanoSaudeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PlanoSaudeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PlanoSaudeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PlanoSaudeSoap[] toSoapModels(List<PlanoSaude> models) {
		List<PlanoSaudeSoap> soapModels = new ArrayList<PlanoSaudeSoap>(
			models.size());

		for (PlanoSaude model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PlanoSaudeSoap[soapModels.size()]);
	}

	public PlanoSaudeSoap() {
	}

	public long getPrimaryKey() {
		return _plano_id;
	}

	public void setPrimaryKey(long pk) {
		setPlano_id(pk);
	}

	public long getPlano_id() {
		return _plano_id;
	}

	public void setPlano_id(long plano_id) {
		_plano_id = plano_id;
	}

	public String getDescricao() {
		return _descricao;
	}

	public void setDescricao(String descricao) {
		_descricao = descricao;
	}

	private long _plano_id;
	private String _descricao;

}