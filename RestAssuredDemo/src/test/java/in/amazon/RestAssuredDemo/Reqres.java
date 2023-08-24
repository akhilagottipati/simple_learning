package in.amazon.RestAssuredDemo;

import java.util.HashMap;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Reqres extends TestBase {
	
	int id;
	Response response;
	JsonPath jsonPath;
	HashMap<String,String> map=new HashMap <String,String>();

	@Test(priority=0)
	public void getServerResponse() {
	RestAssured
	.when()
	.get("https://reqres.in/api/users?page=2 ")
	.then()
	.assertThat()
	.statusCode(200);
	logger.info("server Response generated");
	}
	@Test(priority=1)
	public void createResource() {
	map.put("name","Akhila");
	map.put("job", "doctor");
	RestAssured.baseURI="https://reqres.in/";
	RestAssured.basePath="/api/users ";
	logger.info("Payload  Created");


	response=RestAssured
	.given()
	.contentType("application/json")
	.body(map)
	.when()
	.post()
	.then()
	.statusCode(201)
	.extract().response();
	jsonPath=response.jsonPath();
	String id=jsonPath.get("id");
	//System.out.println(id);
	logger.info("Resource Created");


	}
	@Test(priority=2)
	public void updateResource() {
	map.put("name","Akhila");
	map.put("job", "Singer");
	RestAssured.baseURI="https://reqres.in/";
	RestAssured.basePath="/api/users/"+id;
	logger.info("payload Updated");
	RestAssured
	.given()

	.contentType("application/json")
	.body(map)
	.when()
	.put()
	.then()
	.statusCode(200);
	logger.info("Resource updated");

	}
	@Test(priority=3)
	public void deleteResource() {
	RestAssured.baseURI="https://reqres.in/";
	RestAssured.basePath="/api/users/"+id;
	RestAssured
	.when()
	.delete()
	.then()
	.statusCode(204);
	logger.info("Resource Deleted");
	}}
