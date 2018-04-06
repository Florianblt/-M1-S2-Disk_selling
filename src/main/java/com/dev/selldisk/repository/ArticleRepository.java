package com.dev.selldisk.repository;

import com.dev.selldisk.model.Article;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ArticleRepository extends CrudRepository<Article, Long> {
    List<Article> findByTitre(String titre);
}