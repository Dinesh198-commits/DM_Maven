package restAssuredPackage;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class RestAssuredBasicAllActionsAPI {
    static String token="";

    @Test

    public void allRequests(){

        //Get bdd
        RestAssured.
                given().baseUri("http://localhost:3000/").
                when().get("employees/2").
                then().log().all().
                statusCode(200).
                body("name",Matchers.equalTo("David"))
                .contentType("application/json")
                .extract().response();

        JSONObject JS = new JSONObject();
        JS.put("name","Dinesh");
        JS.put("age","2000");

        RestAssured.
                given().baseUri("http://localhost:3000/").
                when().contentType(ContentType.JSON).accept(ContentType.JSON).body(JS).post("employees/create").
                then().log().all().
                statusCode(201).
                //body("name",Matchers.equalTo("Dinesh"))
                contentType("application/json")
                .extract().response();














    }
}
