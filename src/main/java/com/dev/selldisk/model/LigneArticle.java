package com.dev.selldisk.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="lignearticle")
public class LigneArticle implements Serializable {

    @EmbeddedId
    private LigneArticlePKey id;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL,targetEntity = Article.class)
    @MapsId("idArticle")
    private Article article;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL, targetEntity = Liste.class)
    @MapsId("idListe")
    private Liste liste;

    @Column(name="quantite")
    private int quantite;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass())
            return false;

        LigneArticle that = (LigneArticle) o;
        return Objects.equals(article, that.article) &&
                Objects.equals(liste, that.liste);
    }

    public LigneArticlePKey getId() {
        return id;
    }

    public void setId(LigneArticlePKey id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(article, liste);
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Liste getListe() {
        return liste;
    }

    public void setListe(Liste idListe) {
        this.liste = idListe;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}
