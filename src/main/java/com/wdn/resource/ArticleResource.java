package com.wdn.resource;

import com.wdn.service.ArticleService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ArticleResource {
    private final ArticleService articleService;

    public ArticleResource(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/index")
    public String index() {
        return "Articles page";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/articles")
    public Response getAll() {
        return Response.ok(articleService.getAll()).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/articles/{articleId}")
    public Response get(@PathParam("articleId") Integer articleId) {

        return Response.ok(articleService.get(articleId)).build();
    }
}
