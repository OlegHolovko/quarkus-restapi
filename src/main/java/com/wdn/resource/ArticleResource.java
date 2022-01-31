package com.wdn.resource;

import com.wdn.repository.ArticleRepository;
import com.wdn.service.ArticleService;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;


@Path("/api/article")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ArticleResource {
    private final ArticleService articleService;

    public ArticleResource(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String index() {
        return "Articles page";
    }
}
