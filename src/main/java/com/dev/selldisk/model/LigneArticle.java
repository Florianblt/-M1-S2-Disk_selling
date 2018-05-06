package com.dev.selldisk.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="lignearticle")
@IdClass(LigneArticlePKey.class)
public class LigneArticle implements Serializable {

    @Id
    @ManyToOne(cascade = CascadeType.ALL,targetEntity = Article.class)
    private long idArticle;

    @Id
    @ManyToOne(cascade = CascadeType.ALL, targetEntity = Liste.class)
    private long idListe;

    @Column(name="quantite")
    private int quantite;
}