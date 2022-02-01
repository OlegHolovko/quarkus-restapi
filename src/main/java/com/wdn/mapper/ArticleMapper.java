package com.wdn.mapper;

import com.wdn.domain.Article;
import com.wdn.model.ArticleEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface ArticleMapper {

    ArticleEntity toEntity(Article domain);

    Article toDomain(ArticleEntity entity);
}
