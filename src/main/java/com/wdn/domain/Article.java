package com.wdn.domain;

import lombok.Data;
import javax.validation.constraints.NotEmpty;

@Data
public class Article {
    private Integer id;

    @NotEmpty
    private String name;
}
