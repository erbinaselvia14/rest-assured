package com.juaracoding.rest.assured;

import static org.hamcrest.CoreMatchers.*;
import static org.testng.Assert.assertEquals;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestGetProduct {
	
	String endpoint = "https://mern-backend-8881.herokuapp.com/products?page=1";
	
	@Test
	public void testStatusCode() {
		Response response = RestAssured.get(endpoint);
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());
		
		int actual = response.getStatusCode();
		assertEquals(actual, 200);
	}
	
	@Test
	public void testCategory() {
		given()
		.get(endpoint)
		.then()
		.statusCode(200)
		.body("category", hasItems("Test 5"))
		.log().all();
	}
}
