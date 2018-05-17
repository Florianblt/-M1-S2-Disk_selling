package com.dev.selldisk.repository;

import com.dev.selldisk.model.Format;
import com.dev.selldisk.model.Liste;

public interface ListeRepositoryCustom {
    Boolean addArticle(Format format, int idClient);

    Liste getPanier(int idClient);
}
