package com.dev.selldisk.services.Impl;

import com.dev.selldisk.model.Format;
import com.dev.selldisk.model.Liste;
import com.dev.selldisk.repository.ListeRepository;
import com.dev.selldisk.services.IListeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListeServiceImpl implements IListeService {

    @Autowired
    private ListeRepository listeRepository;

    @Override
    public List<Liste> getAllListes() {
        List<Liste> listes = new ArrayList<>();
        listeRepository.findAll().forEach( liste -> {
            listes.add(liste);
        });
        return listes;
    }

    @Override
    public Liste getListeById(long listeId) {
        return listeRepository.findById(listeId).get();
    }

    @Override
    public boolean addListe(Liste liste) {
        listeRepository.save(liste);
        return true;
    }

    @Override
    public void updateListe(Liste liste) {
        listeRepository.save(liste);
    }

    @Override
    public void deleteListe(int listeId) {
        listeRepository.delete(getListeById(listeId));
    }

    @Override
    public Boolean addArticle(Format format, int idClient) {
        return null;
    }

    @Override
    public Liste getPanier(int idClient) {
        return listeRepository.getPanier(1);
    }
}
