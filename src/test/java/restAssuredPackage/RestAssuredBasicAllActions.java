package restAssuredPackage;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class RestAssuredBasicAllActions {

    @Test

    public void allRequests(){

        RestAssured.baseURI = "http://localhost:3000/";
        RequestSpecification request = RestAssured.given();

        //Get operation basic
        Response response = request.get( "employees/3");
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());

        Map<String,String> map = new HashMap<String, String>();
        map.put("Ratanlal","5600");
        //Get bdd
        RestAssured.
               given().baseUri("http://localhost:3000/").
               when().get("employees/2").
               then().log().ifError().
               statusCode(200).
               body("name",Matchers.equalTo("David"));

        //Create new resource

        Response response2 = request.contentType(ContentType.JSON).accept(ContentType.JSON).body(map).post("employees/create");
        int Status_Code = response2.statusCode();
        Assert.assertEquals(Status_Code,201);

        //Get bdd
        RestAssured.
                given().baseUri("http://localhost:3000/").
                when().contentType(ContentType.JSON).accept(ContentType.JSON).body(map).get("employees/create").
                then().log().ifError().
                statusCode(201).
                body("name",Matchers.equalTo("Ratanlal"));











    }
}
