package test1;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.*;

import java.util.HashMap;
import java.util.Map;

public class RestAssured {
    @Test
    public void rest_basic() {
        //Get operation
        io.restassured.RestAssured.baseURI = "http://localhost:3000/";
        RequestSpecification request = io.restassured.RestAssured.given();
        Response response = request.get("/employees/2");
        System.out.println(response.getBody().asString());
        Assert.assertEquals(response.getStatusCode(), 200);

        //Post Operation
        Map<String, String> map = new HashMap<>();
        map.put("Mahesh","5600");
        Response response1 = request.contentType(ContentType.JSON).body(map)
                .accept(ContentType.JSON).post("/employees/create");

        Assert.assertEquals(response1.getStatusCode(), 200);




    }
}
