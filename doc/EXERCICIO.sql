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


CREATE TABLE Conta(
login VARCHAR(15) NOT NULL,
senha VARCHAR(10),
apelido VARCHAR(15),
cpfUsuario VARCHAR(14),
perguntaDeSeguranca VARCHAR(150),
respostaDeSeguranca VARCHAR(150),
CONSTRAINT pkConta PRIMARY KEY (login),
CONSTRAINT fkContaUsuarios foreign KEY (cpfUsuario)
REFERENCES Usuarios (cpf)
);


CREATE TABLE Usuarios(
cpf VARCHAR(14),
nome VARCHAR(50),
pais VARCHAR(50),
email VARCHAR(50),
dataNascimento DATE,
CONSTRAINT pkUsuarios PRIMARY KEY (cpf)
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

select login, cpfUsuario, nome, idTrofeu from 
TrofeusRecebidos inner join conta on loginconta = login
inner join usuarios on (cpfUsuario = cpf)
where login in (

SELECT loginConta FROM TrofeusRecebidos
WHERE idTrofeu IN (select idTrofeu from TrofeusRecebidos where loginConta = 'ANA'
)AND loginConta <> 'ANA'
GROUP BY loginConta
HAVING COUNT(*) IN (select COUNT(*) from TrofeusRecebidos where loginConta = 'ANA')

) and cpfUsuario = cpf;

select COUNT(*) from TrofeusRecebidos where loginConta = 'ANA';


select idTrofeu from TrofeusRecebidos where loginConta = 'ANA';
select COUNT(*) from TrofeusRecebidos where loginConta = 'ANA';
