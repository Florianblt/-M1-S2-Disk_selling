package com.dev.selldisk.repository.Impl;

import com.dev.selldisk.model.Client;
import com.dev.selldisk.model.Format;
import com.dev.selldisk.model.Liste;
import com.dev.selldisk.repository.ListeRepositoryCustom;
import org.hibernate.query.Query;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class ListeRepositoryCustomImpl implements ListeRepositoryCustom {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Boolean addArticle(Format format, int idClient) {
        return null;
    }

    @Override
    public Liste getPanier(int idClient) {
        CriteriaBuilder builder = em.getCriteriaBuilder();

        CriteriaQuery<Object[]> criteriaQuery = builder.createQuery(Object[].class);
        Root<Liste> listeRoot = criteriaQuery.from(Liste.class);
        Root<Client> clientRoot = criteriaQuery.from(Client.class);
        criteriaQuery.multiselect(listeRoot, clientRoot);
        criteriaQuery.where(builder.equal(clientRoot.get("id"), listeRoot.get("client")));
        criteriaQuery.where(builder.equal(listeRoot.get("etat"), 1));

        List<Liste> listes = em.createQuery("select e from liste l join client c on l.idClient = c.id where l.etat = :etat and c.id = :idClient").setParameter("idClient", idClient).setParameter("etat", 1).getResultList();
        for ( Liste liste : listes) {
            System.out.println("id:"+liste.getIdListe());
        }


        return listes.get(0);
    }
}
