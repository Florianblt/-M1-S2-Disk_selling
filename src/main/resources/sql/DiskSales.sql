INSERT INTO Artiste(idArtiste, nomArtiste) VALUES (1, ' Michael Jackson');
INSERT INTO Artiste(idArtiste, nomArtiste) VALUES (2, 'Johnny Hallyday');
INSERT INTO Article(idArticle, titre, description, jaquette, idArtiste) VALUES (
  1,
  'Thriller',
  'Thriller est le chef-d''oeuvre qui propulse Michael Jackson au rang de star internationale.',
  'https://static.designmynight.com/uploads/2015/08/MJhalloween-thriller-share2-optimised.jpg',
  1
);
INSERT INTO Article(idArticle, titre, description, jaquette, idArtiste) VALUES (
  2,
  'Ca ne finira jamais',
  'Johnny Hallyday revient avec un album de rock moderne et grandpublic.',
  'http://img.abrakaba.com/00266BD7-0/Johnny-Hallyday-Ca-Ne-Finira-Jamais-Inclus-DVD-.jpg',
  2
);
INSERT INTO Article(idArticle, titre, description, jaquette, idArtiste) VALUES (
  3,
  'Jamais seul',
  'Jamais Seul marque le retour de celui sur qui on a tout écrit depuis qu''il a failli laisser ses santiags à l''hôpital.',
  'http://www.illogicall-music.fr/media/catalog/product/cache/1/thumbnail/960x/187bbb8c4e0618ccaeb19cae2b79a6cd/_/c/_cd_bowie_disques_bowie_boutique_bowie_bowie_store_2_hgjg_4_21.jpg',
  2
);

INSERT INTO Client(idClient, nom, mail, password) values (1,'Pierre','test','test');
INSERT INTO Format(idFormat, libelleFormat, prix, idArticle) VALUES (1, 'Disque', 20, 1);
INSERT INTO Format(idFormat, libelleFormat, prix, idArticle) VALUES (2, 'CD', 15, 1);
INSERT INTO Format(idFormat, libelleFormat, prix, idArticle) VALUES (3, 'MP3', 10, 1);
INSERT INTO Format(idFormat, libelleFormat, prix, idArticle) VALUES (4, 'Disque', 20, 2);
INSERT INTO Format(idFormat, libelleFormat, prix, idArticle) VALUES (5, 'CD', 15, 2);
INSERT INTO Format(idFormat, libelleFormat, prix, idArticle) VALUES (6, 'MP3', 10, 2);
INSERT INTO Format(idFormat, libelleFormat, prix, idArticle) VALUES (7, 'Disque', 20, 3);
INSERT INTO Format(idFormat, libelleFormat, prix, idArticle) VALUES (8, 'CD', 15, 3);
INSERT INTO Format(idFormat, libelleFormat, prix, idArticle) VALUES (9, 'MP3', 10, 3);

INSERT INTO Client(idClient, nom, mail, password) VALUES (1,'test', 'test', 'test');
