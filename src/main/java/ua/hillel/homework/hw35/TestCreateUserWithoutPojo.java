package ua.hillel.homework.hw35;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static ua.hillel.homework.hw35.Specification.*;

public class TestCreateUserWithoutPojo {

    private final String BASE_URL = "https://reqres.in/";

    @Test
    public void testCreateUsers() {
        configureSpec(requestSpecification(BASE_URL), responseSpecification(201));

        Map<String, String> user = new HashMap<>();
        user.put("name", "morpheus");
        user.put("job", "leader");

        Response response = given()
                .body(user)
                .when()
                .post("/api/users")
                .then().log().all()
                .extract().response();

        JsonPath jsonPath = response.jsonPath();
        String name = "morpheus";
        String job = "leader";
        Assert.assertEquals(name, "morpheus");
        Assert.assertEquals(job, "leader");
    }
}