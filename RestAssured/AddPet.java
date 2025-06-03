import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class AddPet {

    Long petId; // Use long instead of int

    @Test
    public void AddPet() {
        baseURI = "https://petstore.swagger.io/v2";

        String reqBody = "{\"id\": 77232, \"name\": \"deepthi\", \"status\": \"alive\"}";

        Response response = given()
            .contentType(ContentType.JSON)
            .body(reqBody)
            .when()
            .post("/pet");

        System.out.println("AddPet Response =>\n" + response.getBody().asPrettyString());

        // Extract pet ID as long
        petId = ((Number) response.then().extract().path("id")).longValue();
       

        response.then().statusCode(200);
        response.then().body("name", equalTo("deepthi"));
        response.then().body("status", equalTo("alive"));
    }

    @Test(dependsOnMethods = "AddPet")
    public void UpdatePetStatus() {
        baseURI = "https://petstore.swagger.io/v2";

        // Use petId with %d in format (long works fine here)
        String updatedBody = String.format("{\"id\": %d, \"name\": \"deepthi\", \"status\": \"sold\"}", petId);

        Response response = given()
            .contentType(ContentType.JSON)
            .body(updatedBody)
            .when()
            .put("/pet");

        System.out.println("UpdatePetStatus Response:\n" + response.getBody().asPrettyString());

        response.then().statusCode(200);
        response.then().body("status", equalTo("sold"));
    }

    @Test(dependsOnMethods = "UpdatePetStatus")
    public void GetPetById() {
        String URI = "https://petstore.swagger.io/v2/pet/{petId}";

        System.out.println("Pet ID: " + petId);

        Response getResponse = given()
                .contentType(ContentType.JSON)
                .when()
                .pathParam("petId", petId)
                .get(URI); // Fixed variable name

        System.out.println("GetPetById Response:\n" + getResponse.prettyPrint());

        String petStatus = getResponse.then().extract().path("status");
        System.out.println("Pet Status: " + petStatus);
    }

    @Test(dependsOnMethods = "GetPetById")
    public void DeletePet() {
        baseURI = "https://petstore.swagger.io/v2";

        Response deleteResponse = given()
            .contentType(ContentType.JSON)
            .when()
            .delete("/pet/" + petId);

        System.out.println("DeletePet Response:\n" + deleteResponse.getBody().prettyPrint());

        // Verify status code 200 and message confirming deletion (as per Petstore API docs)
        deleteResponse.then().statusCode(200);
        deleteResponse.then().body("message", equalTo(petId.toString()));
    }

}
