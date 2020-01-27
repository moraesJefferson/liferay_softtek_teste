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

import br.com.liferay.test.model.PlanoSaude;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing PlanoSaude in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class PlanoSaudeCacheModel
	implements CacheModel<PlanoSaude>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PlanoSaudeCacheModel)) {
			return false;
		}

		PlanoSaudeCacheModel planoSaudeCacheModel = (PlanoSaudeCacheModel)obj;

		if (plano_id == planoSaudeCacheModel.plano_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, plano_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{plano_id=");
		sb.append(plano_id);
		sb.append(", descricao=");
		sb.append(descricao);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PlanoSaude toEntityModel() {
		PlanoSaudeImpl planoSaudeImpl = new PlanoSaudeImpl();

		planoSaudeImpl.setPlano_id(plano_id);

		if (descricao == null) {
			planoSaudeImpl.setDescricao("");
		}
		else {
			planoSaudeImpl.setDescricao(descricao);
		}

		planoSaudeImpl.resetOriginalValues();

		return planoSaudeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		plano_id = objectInput.readLong();
		descricao = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(plano_id);

		if (descricao == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(descricao);
		}
	}

	public long plano_id;
	public String descricao;

}