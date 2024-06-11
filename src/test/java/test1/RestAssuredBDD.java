package test1;

import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class RestAssuredBDD {
    @Test
    public void restBDD(){

        RestAssured.
                given().baseUri("http://localhost:3000/")
                .when().get("/employees/2")
                .then().log().all()
                .statusCode(201)
                .body("name", Matchers.equalTo("Ram"))
                .contentType("application/json")
                .extract().response();




    }
}
