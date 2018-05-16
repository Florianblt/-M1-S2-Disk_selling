package com.dev.selldisk.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="artiste")
public class Artiste implements Serializable{

    @Id
    @Column(name="idartiste")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idArtiste;

    @Column(name="nomartiste")
    private String nomArtiste;

    @JsonIgnore
    @OneToMany(mappedBy = "artiste", cascade = CascadeType.ALL)
    private List<Article> articles;

    public long getIdArtiste() {
        return idArtiste;
    }

    public void setIdArtiste(long idArtiste) {
        this.idArtiste = idArtiste;
    }

    public String getNomArtiste() {
        return nomArtiste;
    }

    public void setNomArtiste(String nomArticle) {
        this.nomArtiste = nomArticle;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

}
