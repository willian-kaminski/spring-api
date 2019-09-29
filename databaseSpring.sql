create table paises(
	i_paises serial primary key, 
	nome varchar not null		 
);

create table estados(
	i_estados serial primary key, 
	i_paises integer not null,		
	nome varchar not null,
	sigla char(2) not null,
	foreign key(i_paises) references paises(i_paises)
);

create table cidades(
	i_cidades serial primary key, 
	i_estados integer not null,   
	nome varchar not null,
	foreign key(i_estados) references estados(i_estados)
);

create table pessoas(
	i_pessoas serial primary key, 	
	nome varchar not null,			
	cpf varchar(11) not null,
	sexo varchar not null,
	email varchar,
	ddd varchar,
	telefone varchar(8)
);

create table pessoas_enderecos(
	i_pessoas_enderecos serial primary key,
	i_pessoas integer not null,
	i_cidades integer not null,
	logradouro varchar not null,
	numero integer not null,
	foreign key(i_pessoas) references pessoas(i_pessoas),
	foreign key(i_cidades) references cidades(i_cidades)
);

-- ----------------------------

insert into paises(nome) values
('Brasil'),
('Argentina'),
('Estado Unidos');

insert into estados(i_paises, nome, sigla) values
(1, 'Rio Grande do Sul', 'RS'),
(1, 'Santa Catarina', 'SC'),
(1, 'Paraná', 'PR'),
(1, 'Rio de Janeiro', 'RJ');

insert into cidades(i_estados, nome) values
(1, 'Porto Alegre'),
(1, 'Gravataí'),
(1, 'Cachoeirinha'),
(2, 'Crissiuma'),
(2, 'Chapecó');

insert into pessoas(nome, cpf, sexo, email, ddd, telefone) values
('Willian Kaminski', '00000000000', 'M', null, '51', null),
('Joaõ da Silva', '00000000000', 'F', null, '51', null),
('Raimundo', '00000000000', 'F', null, '51', null);

insert into pessoas_enderecos(i_pessoas, i_cidades, logradouro, numero) values
(1, 2, 'Rua dae Asfalto', 79),
(2, 1, 'Av. Assis Brasil', 1005),
(3, 1, 'Rua não Informada', 001);