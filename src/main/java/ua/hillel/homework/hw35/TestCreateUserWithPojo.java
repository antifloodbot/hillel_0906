package ua.hillel.homework.hw35;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static ua.hillel.homework.hw35.Specification.*;

public class TestCreateUserWithPojo {

    private final String BASE_URL = "https://reqres.in/";
    private ConfigLoader configLoader;
    private String expectedName;
    private String expectedJob;

    @BeforeTest
    public void setUpConfig() {
        configLoader = new ConfigLoader("src/main/java/ua/hillel/homework/hw35/testData.properties");
        expectedName = configLoader.getProperty("user.name");
        expectedJob = configLoader.getProperty("user.job");
    }

    @Test
    public void testCreateUsersPojo() {
        configureSpec(requestSpecification(BASE_URL), responseSpecification(201));

        UserRequest userRequest = new UserRequest(expectedName, expectedJob);
        UserResponse userResponse = given()
                .body(userRequest)
                .when()
                .post("/api/users")
                .then().log().all()
                .extract().as(UserResponse.class);

        Assert.assertEquals(userResponse.getName(), expectedName, "Name is not the same");
        Assert.assertEquals(userResponse.getJob(), expectedJob, "Job is not the same");
        Assert.assertNotNull(userResponse.getId());
        Assert.assertNotNull(userResponse.getCreatedAt());

    }
}