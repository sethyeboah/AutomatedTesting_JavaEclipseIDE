package restAssured_RestAPITesting;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class ResReqWebsite_APITesting {
	
	@Test
	void getSingleUser() {
		given()
		
		.when()
			.get("https://reqres.in/api/users/2")
		
		.then()
			.statusCode(200)
			.body("page", equalTo(2))
			.log().all();
	}
}
