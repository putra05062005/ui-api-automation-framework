package api;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.*;

public class ApiSteps {

    private Response response;

    @Given("user requests GET list users")
    public void user_requests_get_list_users() {

        response = given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .when()
                .get("/users");
    }

    @Then("API response status should be {int}")
    public void api_response_status_should_be(Integer statusCode) {

        assertEquals(statusCode.intValue(), response.getStatusCode());
    }

    @Then("response should contain user data")
    public void response_should_contain_user_data() {

        assertFalse(response.jsonPath().getList("$").isEmpty());
    }
}