package com.dev.selldisk.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

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

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL,targetEntity = Client.class)
    @JoinColumn(name = "idclient")
    private Client client;

    @OneToMany(mappedBy = "liste", cascade = CascadeType.ALL)
    private List<LigneArticle> ligneArticles;

    public long getIdListe() {
        return idListe;
    }

    public void setIdListe(long idListe) {
        this.idListe = idListe;
    }

    public void setClient(Client client) {
        this.client = client;
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

    public Client getClient() {
        return client;
    }

    public void setclient(Client client) {
        this.client = client;
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
        if (o == null || getClass() != o.getClass()) return false;
        Liste liste = (Liste) o;
        return Objects.equals(idListe, liste.idListe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idListe);
    }
}
