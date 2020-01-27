create table PlanoSaude (
	plano_id LONG not null primary key,
	descricao VARCHAR(75) null
);

create table pessoa (
	name VARCHAR(75) null,
	data_nascimento DATE null,
	rg VARCHAR(75) null,
	data_expedicao_rg DATE null,
	cpf VARCHAR(75) null,
	nome_pai VARCHAR(75) null,
	nome_mae VARCHAR(75) null,
	naturalidade VARCHAR(75) null,
	uf VARCHAR(75) null,
	id_ LONG not null primary key,
	plano_id LONG
);