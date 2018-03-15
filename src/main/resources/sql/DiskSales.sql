DROP TABLE IF EXISTS Article CASCADE;
DROP TABLE IF EXISTS Liste CASCADE;
DROP TABLE IF EXISTS Client CASCADE;

CREATE TABLE Client
(
    idClient serial NOT NULL,
    nom varchar(100) NOT NULL,
    mail varchar(100) NOT NULL,
    password varchar(100) NOT NULL,
    PRIMARY KEY (idClient)
);

CREATE TABLE Liste
(
    idListe serial NOT NULL,
    date Date NOT NULL,
    etat int NOT NULL,
    total numeric(8,2) NOT NULL,
    idClient int NOT NULL,
    PRIMARY KEY (idListe),
    FOREIGN KEY (idClient) REFERENCES Client(idClient)
);

CREATE TABLE Article
(
    idArticle serial NOT NULL,
    titre varchar(100) NOT NULL,
    description varchar(255) NOT NULL,
    type varchar(100) NOT NULL,
    prix numeric(8,2) NOT NULL,
    PRIMARY KEY (idArticle)
);

INSERT INTO Article VALUES (DEFAULT,'Article de test','Description de test','Disque',20);