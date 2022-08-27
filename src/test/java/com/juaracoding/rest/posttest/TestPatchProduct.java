package com.juaracoding.rest.posttest;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TestPatchProduct {

	String endpoint = "https://mern-backend-8881.herokuapp.com/products/62e20a17f0e24546b900e037";
	
	@Test
	public void testPatch() {
		JSONObject request= new JSONObject();
		request.put("name", "Mesin Cuci");
		request.put("category", "Elektronik");
		request.put("price", "100");
		System.out.println(request.toJSONString());
		
		given()
		.header("content-type","application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.patch(endpoint)
		.then()
		.statusCode(200)
		.log().all();
	}
}
