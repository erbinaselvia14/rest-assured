package com.juaracoding.rest.posttest;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TestPutProduct {
	

	String endpoint = "https://mern-backend-8881.herokuapp.com/products";
	
	@Test
	public void testPost() {
		JSONObject request= new JSONObject();
		request.put("name", "Erbina");
		request.put("price", 9000);
		System.out.println(request.toJSONString());
		
		given()
		.header("Content-Type","application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.put(endpoint)
		.then()
		.statusCode(200)
		.log().all();
	}

}
