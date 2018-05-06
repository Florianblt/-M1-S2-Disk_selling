package com.dev.selldisk.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="format")
public class Format implements Serializable {

    @Id
    @Column(name="idformat")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long idFormat;

    @ManyToOne(cascade = CascadeType.ALL,targetEntity = Article.class)
    private long idArticle;

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

    public long getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(long idArticle) {
        this.idArticle = idArticle;
    }

    public String getLibelleFormat() {
        return libelleFormat;
    }

    public void setLibelleFormat(String libelleFormat) {
        this.libelleFormat = libelleFormat;
    }
}
