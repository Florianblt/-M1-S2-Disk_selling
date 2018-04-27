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

    @OneToMany(cascade = CascadeType.ALL)
    private List<Format> formats;

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

    public List<Format> getFormats() {
        return formats;
    }

    public void setFormats(List<Format> formats) {
        this.formats = formats;
    }
}