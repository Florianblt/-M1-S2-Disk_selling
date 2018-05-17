package com.dev.selldisk.services;

import com.dev.selldisk.model.Format;
import com.dev.selldisk.model.Liste;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.List;

public interface IListeService {
    List<Liste> getAllListes();
    Liste getListeById(long listeId);
    boolean addListe(Liste liste);
    void updateListe(Liste liste);
    void deleteListe(int listeId);
    Boolean addArticle(Format format, int idClient);
    Liste getPanier(int idClient);
}
