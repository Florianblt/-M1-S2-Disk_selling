package com.dev.selldisk.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="article")
public class Article implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="idarticle")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long idArticle;

    @Column(name="titre")
    private String titre;

    @Column(name="description")
    private String description;

    @Column(name="prix")
    private float prix;

    public long getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(long idArticle) {
        this.idArticle = idArticle;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
}