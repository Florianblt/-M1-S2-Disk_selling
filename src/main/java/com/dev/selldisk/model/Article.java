package com.dev.selldisk.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

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

    @Column(name="jaquette")
    private String jaquette;

    @ManyToOne(cascade = CascadeType.ALL,targetEntity = Artiste.class)
    @JoinColumn(name="idArtiste")
    private long idArtiste;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Format> formats;

    @OneToMany(cascade = CascadeType.ALL)
    private List<LigneArticle> ligneArticles;

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

    public String getJaquette() {
        return jaquette;
    }

    public void setJaquette(String jaquette) {
        this.jaquette = jaquette;
    }

    public long getIdArtiste() {
        return idArtiste;
    }

    public void setIdArtiste(long idArtiste) {
        this.idArtiste = idArtiste;
    }

    public List<Format> getFormats() {
        return formats;
    }

    public void setFormats(List<Format> formats) {
        this.formats = formats;
    }

    public List<LigneArticle> getLigneArticles() {
        return ligneArticles;
    }

    public void setLigneArticles(List<LigneArticle> ligneArticles) {
        this.ligneArticles = ligneArticles;
    }
}