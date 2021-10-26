package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.equalTo;

class MobileBankApiTestV1 {
    @Test
    void shouldPostToPostman() {
        // Given - When - Then

        given()
                .baseUri("https://postman-echo.com")
                .body("Some request")

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("request"))
        ;
    }

    @Test
    void shouldPostToPostmanRu() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Привет!")

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("Привет"))
        ;
    }
}