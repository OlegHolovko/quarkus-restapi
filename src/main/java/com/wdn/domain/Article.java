package com.wdn.domain;

import javax.validation.constraints.NotEmpty;

public class Article {
    private Integer id;

    @NotEmpty
    private String name;
}
