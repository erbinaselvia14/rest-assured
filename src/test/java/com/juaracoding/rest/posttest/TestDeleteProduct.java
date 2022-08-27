package com.juaracoding.rest.posttest;

import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class TestDeleteProduct {

	String endpoint = "https://mern-backend-8881.herokuapp.com/products/62e20db3f0e24546b900e04c";

	@Test
	public void testDelete() {
		when()
		.delete(endpoint)
		.then()
		.statusCode(200)
		.log().all();
	}

}
