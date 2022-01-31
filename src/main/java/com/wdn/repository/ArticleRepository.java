package com.wdn.repository;

import com.wdn.model.ArticleEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ArticleRepository implements PanacheRepositoryBase<ArticleEntity, Integer> {
}

