package lesson31;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;
import static lesson31.Specification.*;

public class TestSortedYearsPojo {

    private final String BASE_URL = "https://reqres.in/";

    @Test
    public void testRegistrationUnSuccess() {
        configureSpec(requestSpecification(BASE_URL), responseSpecification(200));
        List<YearsData> yearsDataList = given()
                .when()
                .get("api/unknown")
                .then().log().all()
                .extract().body().jsonPath().getList("data", YearsData.class);
        List<Integer> yearActual = yearsDataList.stream().map(YearsData::getYear).collect(Collectors.toList());
        List<Integer> expectedActual = yearActual.stream().sorted().collect(Collectors.toList());
        Assert.assertEquals(expectedActual, yearActual);
    }
}