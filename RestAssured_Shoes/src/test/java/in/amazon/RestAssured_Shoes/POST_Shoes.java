package in.amazon.RestAssured_Shoes;



import org.testng.annotations.Test;

import io.restassured.RestAssured;



public class POST_Shoes {
	@Test
	public void getServerResponse() {
		RestAssured
		   .when()
		         .post("http://localhost:9010/add-shoe?id=101&image=image_url&name=SampleShoe&category=Running&sizes=9&price=1000")
		   .then()
		         .assertThat()
		         .statusCode(200)
		         .log().all();
	}
	
}
	
