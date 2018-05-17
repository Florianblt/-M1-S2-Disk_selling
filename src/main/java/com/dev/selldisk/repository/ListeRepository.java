package com.dev.selldisk.repository;

import com.dev.selldisk.model.Article;
import com.dev.selldisk.model.Format;
import com.dev.selldisk.model.Liste;
import org.springframework.data.repository.CrudRepository;

public interface ListeRepository extends CrudRepository<Liste, Long >, ListeRepositoryCustom {

}
