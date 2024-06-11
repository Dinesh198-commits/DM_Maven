package programmingThink;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class BDDRestAssured {
    @Test
    public void test1(){

        RestAssured.
                 given()
                .baseUri("http://localhost:3000/")
                .when().get("employees/11")
                .then().log().all()
                .statusCode(200)
                .body("name", Matchers.equalTo("Rob"));
        Map<String,Object> MapObj = new HashMap<String,Object>();
        MapObj.put("name", "Rakesh");
        MapObj.put("salary", "7000");
        RestAssured.given().baseUri("http://localhost:3000/")
                .contentType(ContentType.JSON).accept(ContentType.JSON).body(MapObj)
                .when().post("employees/create")
                .then().log().all()
                .statusCode(201)
                .body("name",Matchers.equalTo("Rakesh"));

        RestAssured.given().auth().basic("Dinesh","12345");












    }
}
