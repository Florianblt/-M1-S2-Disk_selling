DROP TABLE IF EXISTS LigneArticle CASCADE;
DROP TABLE IF EXISTS Format CASCADE;
DROP TABLE IF EXISTS Article CASCADE;
DROP TABLE IF EXISTS Liste CASCADE;
DROP TABLE IF EXISTS Client CASCADE;

CREATE TABLE Client
(
  idClient int NOT NULL,
  nom varchar(100) NOT NULL,
  mail varchar(100) NOT NULL,
  password varchar(100) NOT NULL,
  PRIMARY KEY (idClient)
);

CREATE TABLE Liste
(
  idListe int NOT NULL,
  date Date NOT NULL,
  etat int NOT NULL,
  total numeric(8,2) NOT NULL,
  idClient int NOT NULL,
  PRIMARY KEY (idListe),
  FOREIGN KEY (idClient) REFERENCES Client(idClient)
);

CREATE TABLE Artiste
(
  idArtiste serial NOT NULL,
  nomArtiste varchar(100) NOT NULL,
  PRIMARY KEY (idArtiste)
);

CREATE TABLE Article
(
  idArticle serial NOT NULL,
  titre varchar(100) NOT NULL,
  description varchar(255) NOT NULL,
  jaquette varchar(255) NOT NULL,
  idArtiste int NOT NULL REFERENCES Artiste,
  PRIMARY KEY (idArticle)
);

CREATE Table Format
(
  idFormat serial NOT NULL,
  idArticle int NOT NULL REFERENCES Article,
  libelleFormat varchar(100) NOT NULL,
  prix numeric(8,2) NOT NULL,
  PRIMARY KEY(idFormat)
);

CREATE Table LigneArticle
(
  idArticle int references Article,
  idListe int references Liste,
  quantite int NOT NULL,
  primary key (idArticle, idListe)
);

INSERT INTO Artiste VALUES (1, ' Michael Jackson');
INSERT INTO Artiste VALUES (2, 'Johnny Hallyday');
INSERT INTO Article VALUES (

  1,
  'Thriller',
  'Thriller est le chef-d''oeuvre qui propulse Michael Jackson au rang de star internationale.',
  'https://static.designmynight.com/uploads/2015/08/MJhalloween-thriller-share2-optimised.jpg',
  1
);
INSERT INTO Article VALUES (
  2,
  'Ca ne finira jamais',
  'Johnny Hallyday revient avec un album de rock moderne et grandpublic.',
  'http://img.abrakaba.com/00266BD7-0/Johnny-Hallyday-Ca-Ne-Finira-Jamais-Inclus-DVD-.jpg',
  2
);
INSERT INTO Article VALUES (
  3,
  'Jamais seul',
  'Jamais Seul marque le retour de celui sur qui on a tout écrit depuis qu''il a failli laisser ses santiags à l''hôpital.',
  'http://www.illogicall-music.fr/media/catalog/product/cache/1/thumbnail/960x/187bbb8c4e0618ccaeb19cae2b79a6cd/_/c/_cd_bowie_disques_bowie_boutique_bowie_bowie_store_2_hgjg_4_21.jpg',
  2
);

INSERT INTO Format VALUES (1, 1, 'Disque', 20);
INSERT INTO Format VALUES (2, 1, 'CD', 15);
INSERT INTO Format VALUES (3, 1, 'MP3', 10);
INSERT INTO Format VALUES (4, 2, 'Disque', 20);
INSERT INTO Format VALUES (5, 2, 'CD', 15);
INSERT INTO Format VALUES (6, 2, 'MP3', 10);
INSERT INTO Format VALUES (7, 3, 'Disque', 20);
INSERT INTO Format VALUES (8, 3, 'CD', 15);
INSERT INTO Format VALUES (9, 3, 'MP3', 10);
