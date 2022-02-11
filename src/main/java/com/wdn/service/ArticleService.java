package com.wdn.service;

import com.wdn.exception.EmptyResultDataAcceptException;
import com.wdn.mapper.ArticleMapper;
import com.wdn.domain.Article;
import com.wdn.model.ArticleEntity;
import com.wdn.repository.ArticleRepository;
import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class ArticleService {

    private final ArticleRepository articleRepository;
    private final ArticleMapper articleMapper;


    public ArticleService(ArticleRepository articleRepository, ArticleMapper articleMapper) {
        this.articleRepository = articleRepository;
        this.articleMapper = articleMapper;
    }

    public List<Article> getAll(){
        return articleRepository.findAll()
                .stream()
                .map(articleMapper::toDomain)
                .collect(Collectors.toList());
    }

    public ArticleEntity get(Integer articleId) throws EmptyResultDataAcceptException {
        return articleRepository.findByIdOptional(articleId).orElseThrow(EmptyResultDataAcceptException::new);
    }
}
