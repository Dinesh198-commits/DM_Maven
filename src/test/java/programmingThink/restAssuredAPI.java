package programmingThink;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class restAssuredAPI {
    @Test
    public void test1(){

        RestAssured.baseURI = "http://localhost:3000/";
        RequestSpecification request = RestAssured.given();
        //basic get operation
        Response response = request.get("employees");
        //get request specific
        Response response1 = request.get("employees/2");
        System.out.println(response1.getBody().asString());
        int ResponseCode = response1.getStatusCode();
        Assert.assertEquals(ResponseCode,200);
        Response response2 = request.param("id",6).get("employees");
        System.out.println(response2.getBody().asString());
        //Basic Create operation
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("id","Raj");
        map.put("Salary","536");

        Response response4 = request.contentType(ContentType.JSON).accept(ContentType.JSON).body(map).post("employees/create");
        System.out.println(response4.getBody().asString());





    }
}
