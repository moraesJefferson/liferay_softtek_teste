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
import br.com.liferay.test.model.PessoaModel;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.ProxyUtil;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model implementation for the Pessoa service. Represents a row in the &quot;pessoa&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface </code>PessoaModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PessoaImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PessoaImpl
 * @generated
 */
@ProviderType
public class PessoaModelImpl
	extends BaseModelImpl<Pessoa> implements PessoaModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a pessoa model instance should use the <code>Pessoa</code> interface instead.
	 */
	public static final String TABLE_NAME = "pessoa";

	public static final Object[][] TABLE_COLUMNS = {
		{"name", Types.VARCHAR}, {"data_nascimento", Types.TIMESTAMP},
		{"rg", Types.VARCHAR}, {"data_expedicao_rg", Types.TIMESTAMP},
		{"cpf", Types.VARCHAR}, {"nome_pai", Types.VARCHAR},
		{"nome_mae", Types.VARCHAR}, {"naturalidade", Types.VARCHAR},
		{"uf", Types.VARCHAR}, {"id_", Types.BIGINT}, {"plano_id", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("data_nascimento", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("rg", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("data_expedicao_rg", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("cpf", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("nome_pai", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("nome_mae", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("naturalidade", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("uf", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("id_", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("plano_id", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table pessoa (name VARCHAR(75) null,data_nascimento DATE null,rg VARCHAR(75) null,data_expedicao_rg DATE null,cpf VARCHAR(75) null,nome_pai VARCHAR(75) null,nome_mae VARCHAR(75) null,naturalidade VARCHAR(75) null,uf VARCHAR(75) null,id_ LONG not null primary key,plano_id LONG)";

	public static final String TABLE_SQL_DROP = "drop table pessoa";

	public static final String ORDER_BY_JPQL = " ORDER BY pessoa.id ASC";

	public static final String ORDER_BY_SQL = " ORDER BY pessoa.id_ ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
		_entityCacheEnabled = entityCacheEnabled;
	}

	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
		_finderCacheEnabled = finderCacheEnabled;
	}

	public PessoaModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Pessoa.class;
	}

	@Override
	public String getModelClassName() {
		return Pessoa.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Pessoa, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Pessoa, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Pessoa, Object> attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Pessoa)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Pessoa, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Pessoa, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Pessoa)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Pessoa, Object>> getAttributeGetterFunctions() {
		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Pessoa, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, Pessoa>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			Pessoa.class.getClassLoader(), Pessoa.class, ModelWrapper.class);

		try {
			Constructor<Pessoa> constructor =
				(Constructor<Pessoa>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException roe) {
					throw new InternalError(roe);
				}
			};
		}
		catch (NoSuchMethodException nsme) {
			throw new InternalError(nsme);
		}
	}

	private static final Map<String, Function<Pessoa, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Pessoa, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Pessoa, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Pessoa, Object>>();
		Map<String, BiConsumer<Pessoa, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Pessoa, ?>>();

		attributeGetterFunctions.put("name", Pessoa::getName);
		attributeSetterBiConsumers.put(
			"name", (BiConsumer<Pessoa, String>)Pessoa::setName);
		attributeGetterFunctions.put(
			"data_nascimento", Pessoa::getData_nascimento);
		attributeSetterBiConsumers.put(
			"data_nascimento",
			(BiConsumer<Pessoa, Date>)Pessoa::setData_nascimento);
		attributeGetterFunctions.put("rg", Pessoa::getRg);
		attributeSetterBiConsumers.put(
			"rg", (BiConsumer<Pessoa, String>)Pessoa::setRg);
		attributeGetterFunctions.put(
			"data_expedicao_rg", Pessoa::getData_expedicao_rg);
		attributeSetterBiConsumers.put(
			"data_expedicao_rg",
			(BiConsumer<Pessoa, Date>)Pessoa::setData_expedicao_rg);
		attributeGetterFunctions.put("cpf", Pessoa::getCpf);
		attributeSetterBiConsumers.put(
			"cpf", (BiConsumer<Pessoa, String>)Pessoa::setCpf);
		attributeGetterFunctions.put("nome_pai", Pessoa::getNome_pai);
		attributeSetterBiConsumers.put(
			"nome_pai", (BiConsumer<Pessoa, String>)Pessoa::setNome_pai);
		attributeGetterFunctions.put("nome_mae", Pessoa::getNome_mae);
		attributeSetterBiConsumers.put(
			"nome_mae", (BiConsumer<Pessoa, String>)Pessoa::setNome_mae);
		attributeGetterFunctions.put("naturalidade", Pessoa::getNaturalidade);
		attributeSetterBiConsumers.put(
			"naturalidade",
			(BiConsumer<Pessoa, String>)Pessoa::setNaturalidade);
		attributeGetterFunctions.put("uf", Pessoa::getUf);
		attributeSetterBiConsumers.put(
			"uf", (BiConsumer<Pessoa, String>)Pessoa::setUf);
		attributeGetterFunctions.put("id", Pessoa::getId);
		attributeSetterBiConsumers.put(
			"id", (BiConsumer<Pessoa, Long>)Pessoa::setId);
		attributeGetterFunctions.put("plano_id", Pessoa::getPlano_id);
		attributeSetterBiConsumers.put(
			"plano_id", (BiConsumer<Pessoa, Long>)Pessoa::setPlano_id);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@Override
	public String getName() {
		if (_name == null) {
			return "";
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_name = name;
	}

	@Override
	public Date getData_nascimento() {
		return _data_nascimento;
	}

	@Override
	public void setData_nascimento(Date data_nascimento) {
		_data_nascimento = data_nascimento;
	}

	@Override
	public String getRg() {
		if (_rg == null) {
			return "";
		}
		else {
			return _rg;
		}
	}

	@Override
	public void setRg(String rg) {
		_rg = rg;
	}

	@Override
	public Date getData_expedicao_rg() {
		return _data_expedicao_rg;
	}

	@Override
	public void setData_expedicao_rg(Date data_expedicao_rg) {
		_data_expedicao_rg = data_expedicao_rg;
	}

	@Override
	public String getCpf() {
		if (_cpf == null) {
			return "";
		}
		else {
			return _cpf;
		}
	}

	@Override
	public void setCpf(String cpf) {
		_cpf = cpf;
	}

	@Override
	public String getNome_pai() {
		if (_nome_pai == null) {
			return "";
		}
		else {
			return _nome_pai;
		}
	}

	@Override
	public void setNome_pai(String nome_pai) {
		_nome_pai = nome_pai;
	}

	@Override
	public String getNome_mae() {
		if (_nome_mae == null) {
			return "";
		}
		else {
			return _nome_mae;
		}
	}

	@Override
	public void setNome_mae(String nome_mae) {
		_nome_mae = nome_mae;
	}

	@Override
	public String getNaturalidade() {
		if (_naturalidade == null) {
			return "";
		}
		else {
			return _naturalidade;
		}
	}

	@Override
	public void setNaturalidade(String naturalidade) {
		_naturalidade = naturalidade;
	}

	@Override
	public String getUf() {
		if (_uf == null) {
			return "";
		}
		else {
			return _uf;
		}
	}

	@Override
	public void setUf(String uf) {
		_uf = uf;
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;
	}

	@Override
	public long getPlano_id() {
		return _plano_id;
	}

	@Override
	public void setPlano_id(long plano_id) {
		_plano_id = plano_id;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			0, Pessoa.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Pessoa toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Pessoa>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		PessoaImpl pessoaImpl = new PessoaImpl();

		pessoaImpl.setName(getName());
		pessoaImpl.setData_nascimento(getData_nascimento());
		pessoaImpl.setRg(getRg());
		pessoaImpl.setData_expedicao_rg(getData_expedicao_rg());
		pessoaImpl.setCpf(getCpf());
		pessoaImpl.setNome_pai(getNome_pai());
		pessoaImpl.setNome_mae(getNome_mae());
		pessoaImpl.setNaturalidade(getNaturalidade());
		pessoaImpl.setUf(getUf());
		pessoaImpl.setId(getId());
		pessoaImpl.setPlano_id(getPlano_id());

		pessoaImpl.resetOriginalValues();

		return pessoaImpl;
	}

	@Override
	public int compareTo(Pessoa pessoa) {
		long primaryKey = pessoa.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Pessoa)) {
			return false;
		}

		Pessoa pessoa = (Pessoa)obj;

		long primaryKey = pessoa.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _entityCacheEnabled;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _finderCacheEnabled;
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Pessoa> toCacheModel() {
		PessoaCacheModel pessoaCacheModel = new PessoaCacheModel();

		pessoaCacheModel.name = getName();

		String name = pessoaCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			pessoaCacheModel.name = null;
		}

		Date data_nascimento = getData_nascimento();

		if (data_nascimento != null) {
			pessoaCacheModel.data_nascimento = data_nascimento.getTime();
		}
		else {
			pessoaCacheModel.data_nascimento = Long.MIN_VALUE;
		}

		pessoaCacheModel.rg = getRg();

		String rg = pessoaCacheModel.rg;

		if ((rg != null) && (rg.length() == 0)) {
			pessoaCacheModel.rg = null;
		}

		Date data_expedicao_rg = getData_expedicao_rg();

		if (data_expedicao_rg != null) {
			pessoaCacheModel.data_expedicao_rg = data_expedicao_rg.getTime();
		}
		else {
			pessoaCacheModel.data_expedicao_rg = Long.MIN_VALUE;
		}

		pessoaCacheModel.cpf = getCpf();

		String cpf = pessoaCacheModel.cpf;

		if ((cpf != null) && (cpf.length() == 0)) {
			pessoaCacheModel.cpf = null;
		}

		pessoaCacheModel.nome_pai = getNome_pai();

		String nome_pai = pessoaCacheModel.nome_pai;

		if ((nome_pai != null) && (nome_pai.length() == 0)) {
			pessoaCacheModel.nome_pai = null;
		}

		pessoaCacheModel.nome_mae = getNome_mae();

		String nome_mae = pessoaCacheModel.nome_mae;

		if ((nome_mae != null) && (nome_mae.length() == 0)) {
			pessoaCacheModel.nome_mae = null;
		}

		pessoaCacheModel.naturalidade = getNaturalidade();

		String naturalidade = pessoaCacheModel.naturalidade;

		if ((naturalidade != null) && (naturalidade.length() == 0)) {
			pessoaCacheModel.naturalidade = null;
		}

		pessoaCacheModel.uf = getUf();

		String uf = pessoaCacheModel.uf;

		if ((uf != null) && (uf.length() == 0)) {
			pessoaCacheModel.uf = null;
		}

		pessoaCacheModel.id = getId();

		pessoaCacheModel.plano_id = getPlano_id();

		return pessoaCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Pessoa, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Pessoa, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Pessoa, Object> attributeGetterFunction = entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((Pessoa)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<Pessoa, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Pessoa, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Pessoa, Object> attributeGetterFunction = entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Pessoa)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Pessoa>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

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
	private Pessoa _escapedModel;

}