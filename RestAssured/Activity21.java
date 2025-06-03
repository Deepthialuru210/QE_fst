import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
//Set Base URL with path parameter
public class Activity21{
String ROOT_URI = "http://ip-api.com/json/{ipAddress}";

@Test
public void getIPInformation() {
    Response response = 
        given().contentType(ContentType.JSON) // Set headers
        .when()
        .pathParam("ipAddress", "107.218.134.107") // Set path parameter
        .get(ROOT_URI); // Send GET request

    // Print response
    System.out.println(response.getBody().asPrettyString());
}

//Set Base URL
//No need to add questions mark in the URL.
//queryParam() will automatically add it while parsing.
 String NEW_URI = "http://ip-api.com/json";

@Test
public void getIPInformation2() {
 Response response = 
     given().contentType(ContentType.JSON) // Set headers
     // Add query parameter
     .when().queryParam("fields", "query,country,city,timezone")
     .get(NEW_URI + "/125.219.5.94"); // Send GET request
 
 // Print response
 System.out.println(response.getBody().asPrettyString());
}


//Set Base URL

@Test
public void AddNewPet() {
 // Write the request body
 baseURI = "https://petstore.swagger.io/v2/pet";
 String reqBody = "{\"id\": 77232, \"name\": \"deepthi\", \"status\": \"alive\"}";

 Response response = 
     given().contentType(ContentType.JSON) // Set headers
     .body(reqBody).when().post(baseURI); // Send POST request

 // Print response of POST request
 String body = response.getBody().asPrettyString();
 System.out.println(body);
}
}