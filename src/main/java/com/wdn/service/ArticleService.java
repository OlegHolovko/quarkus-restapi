package com.wdn.service;

import com.wdn.mapper.ArticleMapper;
import com.wdn.repository.ArticleRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class ArticleService {

    private final ArticleRepository articleRepository;
    private final ArticleMapper articleMapper;


    public ArticleService(ArticleRepository articleRepository, ArticleMapper articleMapper) {
        this.articleRepository = articleRepository;
        this.articleMapper = articleMapper;
    }
}
