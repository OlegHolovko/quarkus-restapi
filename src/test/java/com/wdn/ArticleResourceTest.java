package com.wdn;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

@QuarkusTest
class ArticleResourceTest {
    @Test
    void getAll() {
        given()
                .when().get("/article")
                .then()
                .statusCode(200);
    }
}
