package in.amazon.RestAssured_Shoes;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GET_Shoes {
	@Test
	public void getServerResponse() {
		RestAssured
		   .when()
		         .get("http://localhost:9010/get-shoes")
		   .then()
		         .assertThat()
		         .statusCode(200)
		         .log().all();
	}


}
