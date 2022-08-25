package com.juaracoding.rest.posttest;

import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class TestDeleteProduct {

	String endpoint = "https://mern-backend-8881.herokuapp.com/products";

	@Test
	public void testDelete() {
		when()
		.delete(endpoint)
		.then()
		.statusCode(204)
		.log().all();
	}

}
