package com.dev.selldisk.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="format")
public class Format implements Serializable {

    @Id
    @Column(name="idformat")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long idFormat;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL,targetEntity = Article.class)
    @JoinColumn(name = "idarticle")
    private Article article;

    @Column(name="libelleformat")
    private String libelleFormat;

    @Column(name="prix")
    private float prix;

    public long getIdFormat() {
        return idFormat;
    }

    public void setIdFormat(long idFormat) {
        this.idFormat = idFormat;
    }

    public String getLibelleFormat() {
        return libelleFormat;
    }

    public void setLibelleFormat(String libelleFormat) {
        this.libelleFormat = libelleFormat;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
}
