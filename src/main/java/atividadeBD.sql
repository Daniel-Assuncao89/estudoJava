CREATE DATABASE atividade;
use atividade;

CREATE TABLE publisher(
idPublisher INTEGER PRIMARY KEY AUTO_INCREMENT,
publisherName VARCHAR(45) NOT NULL,
publisherLocal VARCHAR(45) NOT NULL,
publisherFoundation DATE NOT NULL
);

CREATE TABLE jogo(
idJogo INTEGER PRIMARY KEY AUTO_INCREMENT,
genero VARCHAR(45) NOT NULL,
titulo VARCHAR(30) NOT NULL,
jogoLancamento DATE NOT NULL,
idPublisher INTEGER NOT NULL,
FOREIGN KEY(idPublisher) REFERENCES publisher(idPublisher)
);

CREATE TABLE plataforma(
idPlataforma INTEGER PRIMARY KEY AUTO_INCREMENT,
plataformaNome VARCHAR(45) NOT NULL,
plataformaLancamento DATE NOT NULL,
idJogo INTEGER NOT NULL,
FOREIGN KEY(idJogo) REFERENCES jogo(idJogo)
);

CREATE TABLE desenvolvedores(
idDesenvolvedores INTEGER PRIMARY KEY AUTO_INCREMENT,
desenvolvedoresNome VARCHAR(45) NOT NULL,
desenvolvedoresSetor VARCHAR(45) NOT NULL,
desenvolvedoresSalario DECIMAL(10,2) NOT NULL,
idPublisher INTEGER NOT NULL,
FOREIGN KEY(idPublisher) REFERENCES publisher(idPublisher)
);

CREATE TABLE publisher_plataforma(
idPublisher INTEGER NOT NULL,
idPlataforma INTEGER NOT NULL,
FOREIGN KEY(idPublisher) REFERENCES publisher(idPublisher),
FOREIGN KEY(idPlataforma) REFERENCES plataforma(idPlataforma)
);

INSERT INTO publisher VALUES(NULL, "Santa Monica Studio", "EUA-California", "1999-02-15");
INSERT INTO publisher VALUES(NULL, "Konami", "JP-Osaka", "1969-05-29");
INSERT INTO publisher VALUES(NULL, "Naughty Dog", "EUA-California", "1984-6-10");

SELECT * FROM plataforma;

INSERT INTO jogo VALUES(NULL, "Ação" ,"God of War", "2018-07-20", 1);
INSERT INTO jogo VALUES(NULL, "Ação" ,"God of War Ragnarok", "2022-11-09", 1);
INSERT INTO jogo VALUES(NULL, "Ação" ,"The last of us: Part I", "2013-06-11", 3);
INSERT INTO jogo VALUES(NULL, "Ação" ,"The last of us: Part II", "2020-06-19", 3);
INSERT INTO jogo VALUES(NULL, "Ação" ,"Uncharted", "2007-10-11", 3);
INSERT INTO jogo VALUES(NULL, "Ação" ,"Metal Gear Solid", "1998-10-11", 2);
INSERT INTO jogo VALUES(NULL, "Ação" ,"Silent Hill", "1999-11-10", 2);
INSERT INTO jogo VALUES(NULL, "Ação" ,"Silent Hill 2", "2001-10-10", 2);

INSERT INTO plataforma VALUES(NULL, "PS1", "1995-09-25", 6);
INSERT INTO plataforma VALUES(NULL, "PS1", "1995-09-25", 7);
INSERT INTO plataforma VALUES(NULL, "PS2", "2000-03-04", 8);
INSERT INTO plataforma VALUES(NULL, "PS2", "2000-03-04", 5);
INSERT INTO plataforma VALUES(NULL, "PS3", "2006-11-11", 5);
INSERT INTO plataforma VALUES(NULL, "PS3", "2006-11-11", 3);
INSERT INTO plataforma VALUES(NULL, "PS4", "2013-11-11", 3);
INSERT INTO plataforma VALUES(NULL, "PS4", "2013-11-11", 1);
INSERT INTO plataforma VALUES(NULL, "PS4", "2013-11-11", 4);
INSERT INTO plataforma VALUES(NULL, "PS5", "2020-11-11", 2);

SELECT * 
	FROM jogo
	INNER JOIN publisher
    ON jogo.idPublisher = publisher.idPublisher;

SELECT * 
	FROM jogo
	INNER JOIN publisher
    ON jogo.idPublisher = publisher.idPublisher
    WHERE YEAR(jogoLancamento) = 2020;

INSERT INTO desenvolvedores VALUES(NULL, "Augusto", "Dev", 5500.50, 1);
INSERT INTO desenvolvedores VALUES(NULL, "Cesar", "Dev", 5500.50, 2);
INSERT INTO desenvolvedores VALUES(NULL, "Lua", "Dev", 5500.50, 3);
INSERT INTO desenvolvedores VALUES(NULL, "Thomas", "Design", 5500.50, 1);
INSERT INTO desenvolvedores VALUES(NULL, "Geraldo", "Design", 5500.50, 2);
INSERT INTO desenvolvedores VALUES(NULL, "Fernanda", "Design", 5500.50, 3);
INSERT INTO desenvolvedores VALUES(NULL, "Fernanda", "Design", 5500.50, 3);

SELECT * FROM desenvolvedores;

SELECT desenvolvedoresNome, desenvolvedoresSalario, idPublisher
	FROM desenvolvedores
    INNER JOIN publisher
    ON desenvolvedores.idPublisher = publisher.idPublisher;
    
UPDATE desenvolvedores
SET idPublisher = 1
WHERE desenvolvedoresNome = "Geraldo";

DELETE FROM desenvolvedores WHERE desenvolvedoresNome = "Fernanda";
