package restAssuredPackage;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.runner.Request;
import org.testng.annotations.Test;

public class BasicAuthImp {

    @Test
    public void basicAuth(){

        RestAssured.baseURI = "https://postman-echo.com";
        RequestSpecification request = RestAssured.given().auth().basic("postman", "password");
        RequestSpecification request1 = RestAssured.given().auth().digest("postman", "password");
        Response  response = request1.get("/basic-auth");
        Response  response1 = request.get("/basic-auth");
        String body = response.getBody().asString();
        System.out.println("Data from the GET API- "+body);
        String body1 = response1.getBody().asString();
        System.out.println("Data from the GET API- "+body1);




    }
}
