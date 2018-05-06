package com.dev.selldisk.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="liste")
public class Liste{

    @Id
    @Column(name="idliste")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idListe;

    @Column(name="date")
    private Date date;

    @Column(name="etat")
    private int etat;

    @Column(name="total")
    private float total;

    @ManyToOne(cascade = CascadeType.ALL,targetEntity = Client.class)
    private long idClient;

    @OneToMany(mappedBy = "idListe", cascade = CascadeType.ALL)
    private List<LigneArticle> ligneArticles;

    public long getIdListe() {
        return idListe;
    }

    public void setIdListe(long idListe) {
        this.idListe = idListe;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public long getIdClient() {
        return idClient;
    }

    public void setIdClient(long idClient) {
        this.idClient = idClient;
    }

    public List<LigneArticle> getLigneArticles() {
        return ligneArticles;
    }

    public void setLigneArticles(List<LigneArticle> ligneArticles) {
        this.ligneArticles = ligneArticles;
    }
}
