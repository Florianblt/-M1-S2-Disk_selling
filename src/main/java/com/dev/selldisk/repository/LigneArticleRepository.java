package com.dev.selldisk.repository;

import com.dev.selldisk.model.LigneArticle;
import com.dev.selldisk.model.LigneArticlePKey;
import org.springframework.data.repository.CrudRepository;

public interface LigneArticleRepository extends CrudRepository<LigneArticle, LigneArticlePKey> {
}
