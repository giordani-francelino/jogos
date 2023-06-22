drop table empresa;

CREATE TABLE Empresa(
nome VARCHAR(80) NOT NULL,
website VARCHAR(80),
nomeDoPresidente VARCHAR(80),
dataDaFundacao TIMESTAMP,
cidade VARCHAR(80),
estado VARCHAR(80),
pais VARCHAR(80),
nomeDoFundador VARCHAR(80),
CONSTRAINT pkEmpresa PRIMARY KEY (nome)
);

select * from empresa;
delete  from empresa;
select * from jogos;
delete  from jogos;


drop table Jogos;

CREATE TABLE Jogos(
id VARCHAR(15) NOT NULL,
nome VARCHAR(80),
nomeDesenvolvedor VARCHAR(80),
nomeDistribuidor VARCHAR(80),
sinopse VARCHAR(560),
classificacaoEtaria VARCHAR(2),
edicao VARCHAR(2),
dataDeLancamento TIMESTAMP,
CONSTRAINT pkJogos PRIMARY KEY (id),
CONSTRAINT fkJogosEmpresaDesenvolvedor foreign KEY (nomeDesenvolvedor)
REFERENCES Empresa (nome),
CONSTRAINT fkJogosEmpresaDistribuidor foreign KEY (nomeDistribuidor)
REFERENCES Empresa (nome)
);

drop TABLE GeneroDoJogo;

CREATE TABLE GeneroDoJogo(
genero VARCHAR(80),
idJogo VARCHAR(15),
CONSTRAINT pkGeneroDoJogo PRIMARY KEY (genero),
CONSTRAINT fkGeneroDoJogoJogos foreign KEY (idJogo)
REFERENCES Jogos (id)
);

drop TABLE LinguagensDoJogo;

CREATE TABLE LinguagensDoJogo(
Linguagens VARCHAR(80),
idJogo VARCHAR(15),
CONSTRAINT pkLinguagensDoJogo PRIMARY KEY (Linguagens),
CONSTRAINT fkLinguagensDoJogoJogos foreign KEY (idJogo)
REFERENCES Jogos (id)
);

drop TABLE IdiomasLegendas;

CREATE TABLE IdiomasLegendas(
IdiomasLegenda VARCHAR(80),
idJogo VARCHAR(15),
CONSTRAINT pkIdiomasLegendas PRIMARY KEY (IdiomasLegenda),
CONSTRAINT fkIdiomasLegendasJogos foreign KEY (idJogo)
REFERENCES Jogos (id)
);

drop TABLE Trofeu;

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


drop TABLE ItensAdicionais;

CREATE TABLE ItensAdicionais(
nome VARCHAR(80),
idJogo VARCHAR(15),
precoUnitario FLOAT, 
informacao VARCHAR(80),
CONSTRAINT pkItensAdicionais PRIMARY KEY (nome, idJogo),
CONSTRAINT fkItensAdicionaisJogos foreign KEY (idJogo)
REFERENCES Jogos (id)
);

drop TABLE Console;

CREATE TABLE Console(
nome VARCHAR(20),
versao VARCHAR(20),
tipo VARCHAR(20),
CONSTRAINT pkConsole PRIMARY KEY (nome)
);

drop TABLE Conta;

CREATE TABLE Conta(
login VARCHAR(15) NOT NULL,
senha VARCHAR(10),
apelido VARCHAR(15),
perguntaDeSeguranca VARCHAR(150),
respostaDeSeguranca VARCHAR(150),
CONSTRAINT pkConta PRIMARY KEY (login)
);

drop TABLE JogoConta;

CREATE TABLE JogoConta(
dataJogo TIMESTAMP,
idJogo VARCHAR(15),
loginConta VARCHAR(15),
tempoDeJogo float,
CONSTRAINT pkJogoConta PRIMARY KEY (dataJogo),
CONSTRAINT fkJogoContaJogos foreign KEY (idJogo)
REFERENCES Jogos (id),
CONSTRAINT fkJogoContaConta foreign KEY (loginConta)
REFERENCES Conta (login)
);

drop TABLE JogoComprado;

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

drop TABLE ItensAdiquiridos;

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

drop TABLE ConsoleDaConta;

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

drop TABLE consoleJogosComprados;

CREATE TABLE consoleJogosComprados(
codigoAtivacaoJogosComprados VARCHAR(15),
numeroDeSerieConsole VARCHAR(15),
CONSTRAINT pkconsoleJogosComprados PRIMARY KEY (codigoAtivacaoJogosComprados,numeroDeSerieConsole),
CONSTRAINT fkconsoleJogosCompradosJogoComprado foreign KEY (codigoAtivacaoJogosComprados)
REFERENCES JogoComprado (codigoAtivacao),
CONSTRAINT fkconsoleJogosCompradosConsoleDaConta foreign KEY (numeroDeSerieConsole)
REFERENCES ConsoleDaConta (numeroDeSerie)
);

drop TABLE Usuarios;

CREATE TABLE Usuarios(
cpf VARCHAR(14),
nome VARCHAR(50),
pais VARCHAR(50),
email VARCHAR(50),
dataNascimento TIMESTAMP,
CONSTRAINT pkUsuarios PRIMARY KEY (cpf)
);

drop TABLE ContaPrincipal;

CREATE TABLE ContaPrincipal(
loginConta VARCHAR(15) NOT NULL,
cpfUsuario VARCHAR(14),
CONSTRAINT pkContaPrincipal PRIMARY KEY (loginConta),
CONSTRAINT fkContaPrincipalConta foreign KEY (loginConta)
REFERENCES Conta (login),
CONSTRAINT fkContaPrincipalUsuarios foreign KEY (cpfUsuario)
REFERENCES Usuarios (cpf)
);

drop TABLE SubConta;

CREATE TABLE SubConta(
loginConta VARCHAR(15) NOT NULL,
loginContaPrincipal VARCHAR(15),
cpfUsuario VARCHAR(14),
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

drop TABLE CartaoDeCredito;

CREATE TABLE CartaoDeCredito(
numero VARCHAR(15),
loginContaPrincipal VARCHAR(15),
dataVencimento TIMESTAMP,
bandeira VARCHAR(10),
nomeProprietario VARCHAR(20),
CONSTRAINT pkCartaoDeCredito PRIMARY KEY (numero),
CONSTRAINT fkCartaoDeCreditoPrincipal foreign KEY (loginContaPrincipal)
REFERENCES ContaPrincipal (loginConta)
);

drop TABLE TrofeusRecebidos;

CREATE TABLE TrofeusRecebidos(
loginConta VARCHAR(15),
idTrofeu VARCHAR(15),
dataObtencao TIMESTAMP,
CONSTRAINT pkTrofeusRecebidos PRIMARY KEY (loginConta, idTrofeu),
CONSTRAINT fkTrofeusRecebidosConta foreign KEY (loginConta)
REFERENCES Conta (login),
CONSTRAINT fkTrofeusRecebidosTrofeus foreign KEY (idTrofeu)
REFERENCES Trofeu (id)
);

drop TABLE ConsolesDeJogos;

CREATE TABLE ConsolesDeJogos(
idJogo VARCHAR(15),
nomeConsole VARCHAR(20),
CONSTRAINT pkConsolesDeJogos PRIMARY KEY (idJogo, nomeConsole),
CONSTRAINT fkConsolesDeJogosConta foreign KEY (idJogo)
REFERENCES Jogos (id),
CONSTRAINT fkConsolesDeJogosConsole foreign KEY (nomeConsole)
REFERENCES Console (nome)
);

drop TABLE ConsoleDaContaItensAdiquiridos;

CREATE TABLE ConsoleDaContaItensAdiquiridos(
numeroDeSerieConsole VARCHAR(15),
idItensAdiquiridos VARCHAR(15),
CONSTRAINT pkConsoleDaContaItensAdiquiridos PRIMARY KEY (numeroDeSerieConsole, idItensAdiquiridos),
CONSTRAINT fkConsoleDaContaItensAdiquiridosConsoleDaConta foreign KEY (numeroDeSerieConsole)
REFERENCES ConsoleDaConta (numeroDeSerie),
CONSTRAINT fkConsoleDaContaItensAdiquiridos foreign KEY (idItensAdiquiridos)
REFERENCES ItensAdiquiridos (id)
);

drop TABLE Amizade;

CREATE TABLE Amizade(
cpfSolicitante VARCHAR(14),
cpfSolicitado VARCHAR(14),
dataAceite TIMESTAMP,
dataSolicitacao TIMESTAMP,
dataCancelamento TIMESTAMP,
CONSTRAINT pkAmizade PRIMARY KEY (cpfSolicitante, cpfSolicitado),
CONSTRAINT fkAmizadeUsuariosSolicitante foreign KEY (cpfSolicitante)
REFERENCES Usuarios (cpf),
CONSTRAINT fkAmizadeUsuariosSolicitado foreign KEY (cpfSolicitado)
REFERENCES Usuarios (cpf)
);
