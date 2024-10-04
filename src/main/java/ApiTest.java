import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class ApiTest {

    public static void main(String[] args) {
        // Base URI
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        // Send a GET request and verify the response
        given()
                .header("Content-Type", "application/json") // Optional: If the API requires headers
                .when()
                .get("/posts/1") // Specify the endpoint
                .then()
                .statusCode(200) // Verify HTTP status code 200 (OK)
                // Check if the 'title' field is not null
                .log().all(); // Log the response for debugging
    }
}
