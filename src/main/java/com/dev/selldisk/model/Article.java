package com.dev.selldisk.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
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

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL,targetEntity = Artiste.class)
    @JoinColumn(name = "idartiste")
    private Artiste artiste;

    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL)
    private List<Format> formats;

    @JsonIgnore
    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL)
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

    public Artiste getArtiste() {
        return artiste;
    }

    public void setIdArtiste(Artiste artiste) {
        this.artiste = artiste;
    }

    public List<Format> getFormats() {
        return formats;
    }

    public void setFormats(List<Format> formats) {
        this.formats = formats;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setArtiste(Artiste artiste) {
        this.artiste = artiste;
    }

    public List<LigneArticle> getLigneArticles() {
        return ligneArticles;
    }

    public void setLigneArticles(List<LigneArticle> ligneArticles) {
        this.ligneArticles = ligneArticles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Article article = (Article) o;
        return Objects.equals(idArticle, article.idArticle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idArticle);
    }
}