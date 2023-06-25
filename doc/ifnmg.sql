drop TABLE Amizade;
drop TABLE ConsoleDaContaItensAdiquiridos;
drop TABLE ConsolesDeJogos;
drop TABLE TrofeusRecebidos;
drop TABLE CartaoDeCredito;
drop TABLE SubConta;
drop TABLE ContaPrincipal;
drop TABLE Usuarios;
drop TABLE consoleJogosComprados;
drop TABLE ConsoleDaConta;
drop TABLE ItensAdiquiridos;
drop TABLE JogoComprado;
drop TABLE JogoConta;
drop TABLE Conta;
drop TABLE Console;
drop TABLE ItensAdicionais;
drop TABLE Trofeu;
drop TABLE IdiomasLegendas;
drop TABLE LinguagensDoJogo;
drop TABLE GeneroDoJogo;
drop table Jogos;
drop table empresa;

select * from empresa;

CREATE TABLE Empresa(
nome VARCHAR(80) NOT NULL,
website VARCHAR(80),
nomeDoPresidente VARCHAR(80),
dataDaFundacao DATE,
cidade VARCHAR(80),
estado VARCHAR(80),
pais VARCHAR(80),
nomeDoFundador VARCHAR(80),
CONSTRAINT pkEmpresa PRIMARY KEY (nome)
);
select * from empresa;
insert into Empresa (nome, website, nomeDoPresidente, dataDaFundacao, cidade, estado, pais, nomeDoFundador) 
VALUES ('Empresa de Jogos Brasil','www.brasil.com.br','JOAO DOS SANTOS',TO_DATE('2023/06/05','yyyy/mm/dd'), 'SÃO PAULO','SP','BRASIL','ELEOTERIO DOS SANTOS');
insert into Empresa (nome, website, nomeDoPresidente, dataDaFundacao, cidade, estado, pais, nomeDoFundador) 
VALUES ('JFG JOGOS E CIA LTDA','www.JFG.com.br','JOSE FRANCISCO GOMES',TO_DATE('2022/12/05','yyyy/mm/dd'), 'BELO HORIZONTE','MG','BRASIL','ALEXANDRE MENDES');
insert into Empresa (nome, website, nomeDoPresidente, dataDaFundacao, cidade, estado, pais, nomeDoFundador) 
VALUES ('JOGOS PAN AMERICANO','www.JOGOSPANAMERICANO.com.br','SANDRO EMANUEL',TO_DATE('2019/06/18','yyyy/mm/dd'), 'MONTES CLAROS','MG','BRASIL','MARIA JOSE');
insert into Empresa (nome, website, nomeDoPresidente, dataDaFundacao, cidade, estado, pais, nomeDoFundador) 
VALUES ('SEUS JOGOS','www.SEUSJOGOS.com.br','EDVALDO LEMOS',TO_DATE('2015/03/30','yyyy/mm/dd'), 'PORTO ALEGRE','RS','BRASIL','ANA MARIA');
insert into Empresa (nome, website, nomeDoPresidente, dataDaFundacao, cidade, estado, pais, nomeDoFundador) 
VALUES ('JOGOS DE COMPUTADOR','www.JOGOSDECOMPUTADOR.com.br','LEONARDO JOAO',TO_DATE('2021/01/28','yyyy/mm/dd'), 'BUENOPOLIS','MG','BRASIL','ANTONIO FELICIO');
insert into Empresa (nome, website, nomeDoPresidente, dataDaFundacao, cidade, estado, pais, nomeDoFundador) 
VALUES ('CONSTRUMAR JOGOS','www.CONSTRUMARJOGOS.com.br','DANIEL FILHO',TO_DATE('2015/11/15','yyyy/mm/dd'), 'SAO CAETAMO','SP','BRASIL','HERCULANO LIMA');
insert into Empresa (nome, website, nomeDoPresidente, dataDaFundacao, cidade, estado, pais, nomeDoFundador) 
VALUES ('MEUS JOGOS','www.MEUSJOGOS.com.br','JOANA CARVALHO',TO_DATE('1998/06/10','yyyy/mm/dd'), 'SAO JOSE','SP','BRASIL','FRANCISCO SILVA');
insert into Empresa (nome, website, nomeDoPresidente, dataDaFundacao, cidade, estado, pais, nomeDoFundador) 
VALUES ('SAO PAULO JOGOS','www.SAOPAULOJOGOS.com.br','LENISE CHAVES',TO_DATE('2005/07/21','yyyy/mm/dd'), 'RIBEIRAO','SP','BRASIL','PETRONIO LUCIO');
insert into Empresa (nome, website, nomeDoPresidente, dataDaFundacao, cidade, estado, pais, nomeDoFundador) 
VALUES ('JOGOS DE VIDEO GAME','www.JVC.com.br','MARIA EUGENIA',TO_DATE('2018/12/26','yyyy/mm/dd'), 'SAO JOAO','SP','BRASIL','SAMUEL FRANCISCO');
insert into Empresa (nome, website, nomeDoPresidente, dataDaFundacao, cidade, estado, pais, nomeDoFundador) 
VALUES ('LIMEIRA JOGOS','www.LIMEIRA.com.br','JOAO DOS SANTOS',TO_DATE('2018/12/26','yyyy/mm/dd'), 'LIMEIRA','SP','BRASIL','ANA LUCIA');


CREATE TABLE Jogos(
id VARCHAR(15) NOT NULL,
nome VARCHAR(80),
nomeDesenvolvedor VARCHAR(80),
nomeDistribuidor VARCHAR(80),
sinopse VARCHAR(560),
classificacaoEtaria VARCHAR(2),
edicao VARCHAR(2),
dataDeLancamento DATE,
CONSTRAINT pkJogos PRIMARY KEY (id),
CONSTRAINT fkJogosEmpresaDesenvolvedor foreign KEY (nomeDesenvolvedor)
REFERENCES Empresa (nome),
CONSTRAINT fkJogosEmpresaDistribuidor foreign KEY (nomeDistribuidor)
REFERENCES Empresa (nome)
);
select * from jogos;
insert into Jogos (id, nome, nomeDesenvolvedor, nomeDistribuidor, sinopse, classificacaoEtaria, edicao, dataDeLancamento) 
VALUES ('1','COPA DO MUNDO 2002','LIMEIRA JOGOS','SEUS JOGOS','COPA DO MUNDO 2002','18','02',TO_DATE('2010/05/06','yyyy/mm/dd'));
insert into Jogos (id, nome, nomeDesenvolvedor, nomeDistribuidor, sinopse, classificacaoEtaria, edicao, dataDeLancamento) 
VALUES ('2','LUTA DE BOX','SAO PAULO JOGOS','SEUS JOGOS','LUTA DE BOX','18','01',TO_DATE('2013/10/12','yyyy/mm/dd'));
insert into Jogos (id, nome, nomeDesenvolvedor, nomeDistribuidor, sinopse, classificacaoEtaria, edicao, dataDeLancamento) 
VALUES ('3','GUERRA NAS ESTRELAS','MEUS JOGOS','JOGOS DE VIDEO GAME','GUERRA NAS ESTRELAS','18','02',TO_DATE('2001/07/16','yyyy/mm/dd'));
insert into Jogos (id, nome, nomeDesenvolvedor, nomeDistribuidor, sinopse, classificacaoEtaria, edicao, dataDeLancamento) 
VALUES ('4','JOGO DE CIENCIAS','LIMEIRA JOGOS','SEUS JOGOS','JOGO DIDATICO PARA CRIANCAS','04','05',TO_DATE('2014/02/26','yyyy/mm/dd'));
insert into Jogos (id, nome, nomeDesenvolvedor, nomeDistribuidor, sinopse, classificacaoEtaria, edicao, dataDeLancamento) 
VALUES ('5','JOGO LUTA LIVRE','CONSTRUMAR JOGOS','SEUS JOGOS','JOGO LUTA LIVRE','18','02',TO_DATE('2018/12/26','yyyy/mm/dd'));
insert into Jogos (id, nome, nomeDesenvolvedor, nomeDistribuidor, sinopse, classificacaoEtaria, edicao, dataDeLancamento) 
VALUES ('6','CAMPEONATO ESPANHOL DE FUTEBOL','CONSTRUMAR JOGOS','JOGOS DE VIDEO GAME','CAMPEONATO ESPANHOL DE FUTEBOL','18','02',TO_DATE('2018/12/26','yyyy/mm/dd'));
insert into Jogos (id, nome, nomeDesenvolvedor, nomeDistribuidor, sinopse, classificacaoEtaria, edicao, dataDeLancamento) 
VALUES ('7','GUERRA DE CIBORGUES','LIMEIRA JOGOS','SEUS JOGOS','GUERRA DE CIBORGUES','18','02',TO_DATE('2018/12/26','yyyy/mm/dd'));
insert into Jogos (id, nome, nomeDesenvolvedor, nomeDistribuidor, sinopse, classificacaoEtaria, edicao, dataDeLancamento) 
VALUES ('8','JOGO DE TENIS','LIMEIRA JOGOS','SEUS JOGOS','JOGO DE TENIS','18','02',TO_DATE('2018/12/26','yyyy/mm/dd'));
insert into Jogos (id, nome, nomeDesenvolvedor, nomeDistribuidor, sinopse, classificacaoEtaria, edicao, dataDeLancamento) 
VALUES ('9','COMANDOS EM ACAO','MEUS JOGOS','SEUS JOGOS','COMANDOS EM ACAO','18','02',TO_DATE('2018/12/26','yyyy/mm/dd'));
insert into Jogos (id, nome, nomeDesenvolvedor, nomeDistribuidor, sinopse, classificacaoEtaria, edicao, dataDeLancamento) 
VALUES ('10','SEGUNDA GUERRA MUNDIAL','LIMEIRA JOGOS','SEUS JOGOS','SEGUNDA GUERRA MUNDIAL','18','02',TO_DATE('2018/12/26','yyyy/mm/dd'));



CREATE TABLE GeneroDoJogo(
genero VARCHAR(80),
idJogo VARCHAR(15),
CONSTRAINT pkGeneroDoJogo PRIMARY KEY (genero),
CONSTRAINT fkGeneroDoJogoJogos foreign KEY (idJogo)
REFERENCES Jogos (id)
);


CREATE TABLE LinguagensDoJogo(
Linguagens VARCHAR(80),
idJogo VARCHAR(15),
CONSTRAINT pkLinguagensDoJogo PRIMARY KEY (Linguagens),
CONSTRAINT fkLinguagensDoJogoJogos foreign KEY (idJogo)
REFERENCES Jogos (id)
);


CREATE TABLE IdiomasLegendas(
IdiomasLegenda VARCHAR(80),
idJogo VARCHAR(15),
CONSTRAINT pkIdiomasLegendas PRIMARY KEY (IdiomasLegenda),
CONSTRAINT fkIdiomasLegendasJogos foreign KEY (idJogo)
REFERENCES Jogos (id)
);


CREATE TABLE Trofeu(
id VARCHAR(15) NOT NULL,
idJogo VARCHAR(15),
descricaoDoObjetivo VARCHAR(280),
dificuldadeDoObjetivo VARCHAR(30),
tipoTrofeu VARCHAR(30),
CONSTRAINT pkTrofeu PRIMARY KEY (id),
CONSTRAINT fkTrofeuJogos foreign KEY (idJogo)
REFERENCES Jogos (id)
);



CREATE TABLE ItensAdicionais(
nome VARCHAR(80),
idJogo VARCHAR(15),
precoUnitario FLOAT, 
informacao VARCHAR(80),
CONSTRAINT pkItensAdicionais PRIMARY KEY (nome, idJogo),
CONSTRAINT fkItensAdicionaisJogos foreign KEY (idJogo)
REFERENCES Jogos (id)
);


CREATE TABLE Console(
nome VARCHAR(20),
versao VARCHAR(20),
tipo VARCHAR(20),
CONSTRAINT pkConsole PRIMARY KEY (nome)
);


CREATE TABLE Conta(
login VARCHAR(15) NOT NULL,
senha VARCHAR(10),
apelido VARCHAR(15),
perguntaDeSeguranca VARCHAR(150),
respostaDeSeguranca VARCHAR(150),
CONSTRAINT pkConta PRIMARY KEY (login)
);

INSERT INTO CONTA (login, senha, apelido,perguntaDeSeguranca, respostaDeSeguranca)
VALUES ('ANA','CAROLINA', 'ANA','NOME DO PAI','ANTONIO');
INSERT INTO CONTA (login, senha, apelido,perguntaDeSeguranca, respostaDeSeguranca)
VALUES ('ANA-SUB','CAROLINA', 'ANA','NOME DO PAI','ANTONIO');
INSERT INTO CONTA (login, senha, apelido,perguntaDeSeguranca, respostaDeSeguranca)
VALUES ('BEATRIZ','EUFRASIL', 'BEATRIZ','NOME DO PAI','JOSE');
INSERT INTO CONTA (login, senha, apelido,perguntaDeSeguranca, respostaDeSeguranca)
VALUES ('BEATRIZ-SUB','EUFRASIL', 'BEATRIZ','NOME DO PAI','JOSE');
INSERT INTO CONTA (login, senha, apelido,perguntaDeSeguranca, respostaDeSeguranca)
VALUES ('ANTONIO','JOAO', 'JOAO','NOME DO PAI','JOAO');
INSERT INTO CONTA (login, senha, apelido,perguntaDeSeguranca, respostaDeSeguranca)
VALUES ('ANTONIO-SUB','JOAO', 'JOAO','NOME DO PAI','JOAO');
INSERT INTO CONTA (login, senha, apelido,perguntaDeSeguranca, respostaDeSeguranca)
VALUES ('JOSE','FILHO', 'FILHO','NOME DO PAI','FILHO');
INSERT INTO CONTA (login, senha, apelido,perguntaDeSeguranca, respostaDeSeguranca)
VALUES ('JOSE-SUB','FILHO', 'FILHO','NOME DO PAI','FILHO');
INSERT INTO CONTA (login, senha, apelido,perguntaDeSeguranca, respostaDeSeguranca)
VALUES ('DANIEL','SILVA', 'SILVA','NOME DO PAI','SILVA');
INSERT INTO CONTA (login, senha, apelido,perguntaDeSeguranca, respostaDeSeguranca)
VALUES ('DANIEL-SUB','SILVA', 'SILVA','NOME DO PAI','SILVA');
INSERT INTO CONTA (login, senha, apelido,perguntaDeSeguranca, respostaDeSeguranca)
VALUES ('SHEILA','CARVALHO', 'CARVALHO','NOME DO PAI','CARVALHO');
INSERT INTO CONTA (login, senha, apelido,perguntaDeSeguranca, respostaDeSeguranca)
VALUES ('SHEILA-SUB','CARVALHO', 'CARVALHO','NOME DO PAI','CARVALHO');
INSERT INTO CONTA (login, senha, apelido,perguntaDeSeguranca, respostaDeSeguranca)
VALUES ('VICENTE','RAPOSO', 'RAPOSO','NOME DO PAI','RAPOSO');
INSERT INTO CONTA (login, senha, apelido,perguntaDeSeguranca, respostaDeSeguranca)
VALUES ('VICENTE-SUB','RAPOSO', 'RAPOSO','NOME DO PAI','RAPOSO');
INSERT INTO CONTA (login, senha, apelido,perguntaDeSeguranca, respostaDeSeguranca)
VALUES ('LUIZ','CARLOS', 'CARLOS','NOME DO PAI','CARLOS');
INSERT INTO CONTA (login, senha, apelido,perguntaDeSeguranca, respostaDeSeguranca)
VALUES ('LUIZ-SUB','CARLOS', 'CARLOS','NOME DO PAI','CARLOS');
INSERT INTO CONTA (login, senha, apelido,perguntaDeSeguranca, respostaDeSeguranca)
VALUES ('CARLOS','JOSE', 'JOSE','NOME DO PAI','JOSE');
INSERT INTO CONTA (login, senha, apelido,perguntaDeSeguranca, respostaDeSeguranca)
VALUES ('CARLOS-SUB','JOSE', 'JOSE','NOME DO PAI','JOSE');
INSERT INTO CONTA (login, senha, apelido,perguntaDeSeguranca, respostaDeSeguranca)
VALUES ('WELLINGTON','PASCOAL', 'PASCOAL','NOME DO PAI','PASCOAL');
INSERT INTO CONTA (login, senha, apelido,perguntaDeSeguranca, respostaDeSeguranca)
VALUES ('WELLINGTON-SUB','PASCOAL', 'PASCOAL','NOME DO PAI','PASCOAL');

SELECT * FROM CONTA;


CREATE TABLE JogoConta(
dataJogo DATE,
idJogo VARCHAR(15),
loginConta VARCHAR(15),
tempoDeJogo float,
CONSTRAINT pkJogoConta PRIMARY KEY (dataJogo),
CONSTRAINT fkJogoContaJogos foreign KEY (idJogo)
REFERENCES Jogos (id),
CONSTRAINT fkJogoContaConta foreign KEY (loginConta)
REFERENCES Conta (login)
);


CREATE TABLE JogoComprado(
codigoAtivacao VARCHAR(15),
idJogo VARCHAR(15),
loginConta VARCHAR(15),
preco float,
CONSTRAINT pkJogoComprado PRIMARY KEY (codigoAtivacao),
CONSTRAINT ukJogoComprado unique (idJogo,loginConta),
CONSTRAINT fkJogoCompradoJogos foreign KEY (idJogo)
REFERENCES Jogos (id),
CONSTRAINT fkJogoCompradoConta foreign KEY (loginConta)
REFERENCES Conta (login)
);


CREATE TABLE ItensAdiquiridos(
id VARCHAR(15) NOT NULL,
loginConta VARCHAR(15),
nomeItensAdicionais VARCHAR(80),
idJogoItensAdicionais VARCHAR(15),
preco float,
CONSTRAINT pkItensAdiquiridos PRIMARY KEY (id),
CONSTRAINT ukItensAdiquiridos unique (loginConta,nomeItensAdicionais,idJogoItensAdicionais),
CONSTRAINT fkItensAdiquiridosConta foreign KEY (loginConta)
REFERENCES Conta (login),
CONSTRAINT fkItensAdiquiridosItensAdicionais foreign KEY (nomeItensAdicionais, idJogoItensAdicionais)
REFERENCES ItensAdicionais (nome, idJogo)
);


CREATE TABLE ConsoleDaConta(
numeroDeSerie VARCHAR(15),
nomeConsole VARCHAR(20),
loginConta VARCHAR(15),
CONSTRAINT pkConsoleDaConta PRIMARY KEY (numeroDeSerie),
CONSTRAINT ukConsoleDaConta unique (nomeConsole,loginConta),
CONSTRAINT fkConsoleDaContaConsole foreign KEY (nomeConsole)
REFERENCES Console (nome),
CONSTRAINT fkConsoleDaContaConta foreign KEY (loginConta)
REFERENCES Conta (login)
);


CREATE TABLE consoleJogosComprados(
codigoAtivacaoJogosComprados VARCHAR(15),
numeroDeSerieConsole VARCHAR(15),
CONSTRAINT pkconsoleJogosComprados PRIMARY KEY (codigoAtivacaoJogosComprados,numeroDeSerieConsole),
CONSTRAINT fkconsoleJogosCompradosJogoComprado foreign KEY (codigoAtivacaoJogosComprados)
REFERENCES JogoComprado (codigoAtivacao),
CONSTRAINT fkconsoleJogosCompradosConsoleDaConta foreign KEY (numeroDeSerieConsole)
REFERENCES ConsoleDaConta (numeroDeSerie)
);


CREATE TABLE Usuarios(
cpf VARCHAR(14),
nome VARCHAR(50),
pais VARCHAR(50),
email VARCHAR(50),
dataNascimento DATE,
CONSTRAINT pkUsuarios PRIMARY KEY (cpf)
);

SELECT * FROM USUARIOS;
INSERT INTO USUARIOS (cpf,nome,pais,email,dataNascimento) VALUES ('15648615270','ANA CAROLINA','JAPAO','ANACAROLINA@GMAIL.COM',TO_DATE('2005/05/12','yyyy/mm/dd'));
INSERT INTO USUARIOS (cpf,nome,pais,email,dataNascimento) VALUES ('48275389610','BEATRIZ EUFRASIA','JAPAO','BEATRIZ@GMAIL.COM',TO_DATE('2006/01/18','yyyy/mm/dd'));
INSERT INTO USUARIOS (cpf,nome,pais,email,dataNascimento) VALUES ('84578915310','ANTONIO JOAO','BRASIL','ANTONIO@GMAIL.COM',TO_DATE('2008/02/18','yyyy/mm/dd'));
INSERT INTO USUARIOS (cpf,nome,pais,email,dataNascimento) VALUES ('48521325611','JOSE FILHO','BRASIL','JOSEFILHO@GMAIL.COM',TO_DATE('2007/03/16','yyyy/mm/dd'));
INSERT INTO USUARIOS (cpf,nome,pais,email,dataNascimento) VALUES ('85675489652','DANIEL SILVA','BRASIL','DANIEL@GMAIL.COM',TO_DATE('1986/08/08','yyyy/mm/dd'));
INSERT INTO USUARIOS (cpf,nome,pais,email,dataNascimento) VALUES ('84578652312','SHEILA CARVALHO','US','SHEILA@GMAIL.COM',TO_DATE('1997/09/04','yyyy/mm/dd'));
INSERT INTO USUARIOS (cpf,nome,pais,email,dataNascimento) VALUES ('85478628910','VICENTE RAPOSO','CHINA','VIDENTE@GMAIL.COM',TO_DATE('2000/10/23','yyyy/mm/dd'));
INSERT INTO USUARIOS (cpf,nome,pais,email,dataNascimento) VALUES ('02894652723','LUIZ CARLOS DOS SANTOS','SENEGAL','LUIZ@GMAIL.COM',TO_DATE('2012/11/15','yyyy/mm/dd'));
INSERT INTO USUARIOS (cpf,nome,pais,email,dataNascimento) VALUES ('87546982359','CARLOS JOSE','ARGENTINA','CARLOS@GMAIL.COM',TO_DATE('2002/07/23','yyyy/mm/dd'));
INSERT INTO USUARIOS (cpf,nome,pais,email,dataNascimento) VALUES ('84598523659','WELLINGTON PASCOAL','BELGICA','WELLINGTON@GMAIL.COM',TO_DATE('1998/12/05','yyyy/mm/dd'));



CREATE TABLE ContaPrincipal(
loginConta VARCHAR(15) NOT NULL,
cpfUsuario VARCHAR(14),
CONSTRAINT pkContaPrincipal PRIMARY KEY (loginConta),
CONSTRAINT fkContaPrincipalConta foreign KEY (loginConta)
REFERENCES Conta (login),
CONSTRAINT fkContaPrincipalUsuarios foreign KEY (cpfUsuario)
REFERENCES Usuarios (cpf)
);

INSERT INTO ContaPrincipal (loginConta, cpfUsuario) VALUES ('ANA','15648615270');
INSERT INTO ContaPrincipal (loginConta, cpfUsuario) VALUES ('BEATRIZ','48275389610');
INSERT INTO ContaPrincipal (loginConta, cpfUsuario) VALUES ('ANTONIO','84578915310');
INSERT INTO ContaPrincipal (loginConta, cpfUsuario) VALUES ('JOSE','48521325611');
INSERT INTO ContaPrincipal (loginConta, cpfUsuario) VALUES ('DANIEL','85675489652');
INSERT INTO ContaPrincipal (loginConta, cpfUsuario) VALUES ('SHEILA','84578652312');
INSERT INTO ContaPrincipal (loginConta, cpfUsuario) VALUES ('VICENTE','85478628910');
INSERT INTO ContaPrincipal (loginConta, cpfUsuario) VALUES ('LUIZ','02894652723');
INSERT INTO ContaPrincipal (loginConta, cpfUsuario) VALUES ('CARLOS','87546982359');
INSERT INTO ContaPrincipal (loginConta, cpfUsuario) VALUES ('WELLINGTON','84598523659');

CREATE TABLE SubConta(
loginConta VARCHAR(15) NOT NULL,
loginContaPrincipal VARCHAR(15) NOT NULL,
cpfUsuario VARCHAR(14) NOT NULL,
usoDoCartao INTEGER,
acessoConteudoImproprio INTEGER,
CONSTRAINT pkSubConta PRIMARY KEY (loginConta),
CONSTRAINT fkSubContaConta foreign KEY (loginConta)
REFERENCES Conta (login),
CONSTRAINT fkSubContaContaPrincipal foreign KEY (loginContaPrincipal)
REFERENCES ContaPrincipal (loginConta),
CONSTRAINT fkSubContaUsuarios foreign KEY (cpfUsuario)
REFERENCES Usuarios (cpf)
);

SELECT * FROM SUBCONTA;
INSERT INTO SubConta (loginConta, loginContaPrincipal, cpfUsuario, usoDoCartao, acessoConteudoImproprio) VALUES ('ANA-SUB','ANA','15648615270',1,1);
INSERT INTO SubConta (loginConta, loginContaPrincipal, cpfUsuario, usoDoCartao, acessoConteudoImproprio) VALUES ('BEATRIZ-SUB','BEATRIZ','48275389610',1,1);
INSERT INTO SubConta (loginConta, loginContaPrincipal, cpfUsuario, usoDoCartao, acessoConteudoImproprio) VALUES ('ANTONIO-SUB','ANTONIO','84578915310',1,1);
INSERT INTO SubConta (loginConta, loginContaPrincipal, cpfUsuario, usoDoCartao, acessoConteudoImproprio) VALUES ('JOSE-SUB','JOSE','48521325611',1,1);
INSERT INTO SubConta (loginConta, loginContaPrincipal, cpfUsuario, usoDoCartao, acessoConteudoImproprio) VALUES ('DANIEL-SUB','DANIEL','85675489652',1,1);
INSERT INTO SubConta (loginConta, loginContaPrincipal, cpfUsuario, usoDoCartao, acessoConteudoImproprio) VALUES ('SHEILA-SUB','SHEILA','84578652312',1,1);
INSERT INTO SubConta (loginConta, loginContaPrincipal, cpfUsuario, usoDoCartao, acessoConteudoImproprio) VALUES ('VICENTE-SUB','VICENTE','85478628910',1,1);
INSERT INTO SubConta (loginConta, loginContaPrincipal, cpfUsuario, usoDoCartao, acessoConteudoImproprio) VALUES ('LUIZ-SUB','LUIZ','02894652723',1,1);
INSERT INTO SubConta (loginConta, loginContaPrincipal, cpfUsuario, usoDoCartao, acessoConteudoImproprio) VALUES ('CARLOS-SUB','CARLOS','87546982359',1,1);
INSERT INTO SubConta (loginConta, loginContaPrincipal, cpfUsuario, usoDoCartao, acessoConteudoImproprio) VALUES ('WELLINGTON-SUB','WELLINGTON','84598523659',1,1);


CREATE TABLE CartaoDeCredito(
numero VARCHAR(15),
loginContaPrincipal VARCHAR(15),
dataVencimento DATE,
bandeira VARCHAR(10),
nomeProprietario VARCHAR(20),
CONSTRAINT pkCartaoDeCredito PRIMARY KEY (numero),
CONSTRAINT fkCartaoDeCreditoPrincipal foreign KEY (loginContaPrincipal)
REFERENCES ContaPrincipal (loginConta)
);


CREATE TABLE TrofeusRecebidos(
loginConta VARCHAR(15),
idTrofeu VARCHAR(15),
dataObtencao DATE,
CONSTRAINT pkTrofeusRecebidos PRIMARY KEY (loginConta, idTrofeu),
CONSTRAINT fkTrofeusRecebidosConta foreign KEY (loginConta)
REFERENCES Conta (login),
CONSTRAINT fkTrofeusRecebidosTrofeus foreign KEY (idTrofeu)
REFERENCES Trofeu (id)
);


CREATE TABLE ConsolesDeJogos(
idJogo VARCHAR(15),
nomeConsole VARCHAR(20),
CONSTRAINT pkConsolesDeJogos PRIMARY KEY (idJogo, nomeConsole),
CONSTRAINT fkConsolesDeJogosConta foreign KEY (idJogo)
REFERENCES Jogos (id),
CONSTRAINT fkConsolesDeJogosConsole foreign KEY (nomeConsole)
REFERENCES Console (nome)
);


CREATE TABLE ConsoleDaContaItensAdiquiridos(
numeroDeSerieConsole VARCHAR(15),
idItensAdiquiridos VARCHAR(15),
CONSTRAINT pkConsoleDaContaItensAdiquiridos PRIMARY KEY (numeroDeSerieConsole, idItensAdiquiridos),
CONSTRAINT fkConsoleDaContaItensAdiquiridosConsoleDaConta foreign KEY (numeroDeSerieConsole)
REFERENCES ConsoleDaConta (numeroDeSerie),
CONSTRAINT fkConsoleDaContaItensAdiquiridos foreign KEY (idItensAdiquiridos)
REFERENCES ItensAdiquiridos (id)
);


CREATE TABLE Amizade(
cpfSolicitante VARCHAR(14),
cpfSolicitado VARCHAR(14),
dataAceite DATE,
dataSolicitacao DATE,
dataCancelamento DATE,
CONSTRAINT pkAmizade PRIMARY KEY (cpfSolicitante, cpfSolicitado),
CONSTRAINT fkAmizadeUsuariosSolicitante foreign KEY (cpfSolicitante)
REFERENCES Usuarios (cpf),
CONSTRAINT fkAmizadeUsuariosSolicitado foreign KEY (cpfSolicitado)
REFERENCES Usuarios (cpf)
);
