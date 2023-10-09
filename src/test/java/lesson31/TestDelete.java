package lesson31;


import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static lesson31.Specification.*;

public class TestDelete {

    private final String BASE_URL = "https://reqres.in/";

    @Test
    public void testDelete() {
        configureSpec(requestSpecification(BASE_URL), responseSpecification(200));
        given()
                .when()
                .delete("api/users/2")
                .then().log().all();

    }
}

