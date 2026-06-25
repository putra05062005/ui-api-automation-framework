package api;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;

public class ApiSteps {

    private Response response;

    // ===========================
    // GET LIST USERS
    // ===========================

    @Given("user requests GET list users")
    public void user_requests_get_list_users() {

        response = given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .when()
                .get("/users");
    }

    @Then("response should contain user data")
    public void response_should_contain_user_data() {

        assertFalse(response.jsonPath().getList("$").isEmpty());
    }

    // ===========================
    // GET USER BY ID
    // ===========================

    @Given("user requests GET user with id {int}")
    public void user_requests_get_user_with_id(Integer id) {

        response = given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .when()
                .get("/users/" + id);
    }

    @Then("response should contain user id {int}")
    public void response_should_contain_user_id(Integer id) {

        assertEquals(id.intValue(), response.jsonPath().getInt("id"));
        assertNotNull(response.jsonPath().getString("name"));
        assertNotNull(response.jsonPath().getString("email"));
    }

    // ===========================
    // CREATE USER
    // ===========================

    @Given("user creates a new user")
    public void user_creates_a_new_user() {

        String requestBody = """
                {
                  "name": "Pahala",
                  "username": "pahala",
                  "email": "pahala@test.com"
                }
                """;

        response = given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("/users");
    }

    @Then("response should contain created user")
    public void response_should_contain_created_user() {

        assertEquals("Pahala", response.jsonPath().getString("name"));
        assertEquals("pahala", response.jsonPath().getString("username"));
        assertEquals("pahala@test.com", response.jsonPath().getString("email"));
    }

    // ===========================
    // UPDATE USER
    // ===========================

    @Given("user updates user with id {int}")
    public void user_updates_user_with_id(Integer id) {

        String requestBody = """
                {
                  "name": "Pahala Updated",
                  "username": "pahala_updated",
                  "email": "updated@test.com"
                }
                """;

        response = given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .put("/users/" + id);
    }

    @Then("response should contain updated user")
    public void response_should_contain_updated_user() {

        assertEquals("Pahala Updated", response.jsonPath().getString("name"));
        assertEquals("pahala_updated", response.jsonPath().getString("username"));
        assertEquals("updated@test.com", response.jsonPath().getString("email"));
    }

    // ===========================
    // DELETE USER
    // ===========================

    @Given("user deletes user with id {int}")
    public void user_deletes_user_with_id(Integer id) {

        response = given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .when()
                .delete("/users/" + id);
    }

    // ===========================
    // COMMON VALIDATION
    // ===========================

    @Then("API response status should be {int}")
    public void api_response_status_should_be(Integer statusCode) {

        assertEquals(statusCode.intValue(), response.getStatusCode());
    }
}