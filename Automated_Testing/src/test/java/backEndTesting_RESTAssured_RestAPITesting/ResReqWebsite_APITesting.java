package backEndTesting_RESTAssured_RestAPITesting;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class ResReqWebsite_APITesting {
	
	@Test
	public static void getSingleUser() {
		given()
		
		.when()
			.get("https://reqres.in/api/users/2")
		
		.then()
			.statusCode(200)
			.body("data.id", equalTo(2))
			.log().all();
	}
}
