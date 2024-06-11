package restAssuredAPI;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Parameters {
    @Test
    public void para(){
        //
        RestAssured.
                given().pathParam("MyPath","employees")
                .when().get("http://localhost:3000/{MyPath}").
                then().log().all().statusCode(200);
    }
    @Test
    public void cookies(){
        //
        RestAssured.
                given()
                .when().get("https://google.com/").
                then()
                .cookie("AEC","Ackid1SqrlmycM9U4gexUl01AEzWvWREgTUCK7v4PFvGv01dXu5CgUGXp74")
                .log().all();
    }
}
