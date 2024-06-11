package restAssuredAPI;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;

public class RequestBody {
    @Test
    public void getRequestBody(){

        RestAssured.
                given().baseUri("http://localhost:3000/").
                when().get("employees/2").
                then().log().all().
                statusCode(200).
                body("name",Matchers.equalTo("David"));}
     @Test
    public void createRequestBody(){
        HashMap data = new HashMap();
        data.put("name","Rajat");
        data.put("salary","2000");
        RestAssured.
                given().baseUri("http://localhost:3000/").
                when().contentType(ContentType.JSON).accept(ContentType.JSON).body(data).post("employees/create")
                .then().log().all().
                statusCode(200).
                body("name",Matchers.equalTo("Rajat"));}

    @Test
    public void createRequestJson(){
        JSONObject data = new JSONObject();
        data.put("name","RajKumar");
        data.put("salary","20000");
        RestAssured.
                given().baseUri("http://localhost:3000/").
                when().contentType(ContentType.JSON).accept(ContentType.JSON).body(data).post("employees/create")
                .then().log().all().
                statusCode(201).
                body("name",Matchers.equalTo("Rajat"));
    }

    @Test
    public void createPOJORequest(){

        POJORequest pr = new POJORequest();
        pr.setName("Raj");
        pr.setSalary("4000");
        System.out.println(pr.getName() +" and " +pr.getSalary() );
        RestAssured.
                given().baseUri("http://localhost:3000/").
                when().contentType(ContentType.JSON).accept(ContentType.JSON).body(pr.toString()).post("employees/create")
                .then().log().all().
                statusCode(201).
                body("name",Matchers.equalTo("Raj"));
    }
}
