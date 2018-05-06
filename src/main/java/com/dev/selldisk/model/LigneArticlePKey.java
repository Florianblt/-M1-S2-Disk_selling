package com.dev.selldisk.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class LigneArticlePKey implements Serializable {

    @Column(name = "idArticle")
    private long idArticle;
    @Column(name = "idListe")
    private long idListe;

    private LigneArticlePKey() {};

    public LigneArticlePKey( Long idArticle, Long idListe) {
        this.idArticle = idArticle;
        this.idListe = idListe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass())
            return false;

        LigneArticlePKey that = (LigneArticlePKey) o;
        return Objects.equals(idArticle, that.idArticle) &&
                Objects.equals(idListe, that.idListe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idArticle, idListe);
    }

    public long getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(long idArticle) {
        this.idArticle = idArticle;
    }

    public long getIdListe() {
        return idListe;
    }

    public void setIdListe(long idListe) {
        this.idListe = idListe;
    }
}
