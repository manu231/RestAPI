package testRegistration;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Registration {
      
	@SuppressWarnings("deprecation")
	@Test
	  public void registrationSuccessful() {
		  
		  RestAssured.baseURI  = "http://bookstore.toolsqa.com";
		  RequestSpecification  request = RestAssured.given();
		  
	      //request.header("Content-Type","application/json");	  
		  JSONObject requestParams = new JSONObject();
		  
		/*
		 * requestParams.put("UserName", "TOOLSQA-Test"); requestParams.put("Password",
		 * "Test@@123");
		 * 
		 * request.body(requestParams.toJSONString());
		 * 
		 * Response response = request.post("/Account/v1/User");
		 * 
		 * int statuscode = response.getStatusCode(); Assert.assertEquals(201,
		 * statuscode);
		 */  
		  
		  requestParams.put("UserName", "TOOLSQA-Test");
	        requestParams.put("Password", "Test@@123");
	 
	        request.body(requestParams.toJSONString());
	        Response response = request.post("/Account/v1/User");
	 
	        Assert.assertEquals(response.getStatusCode(), 201);

		  
		  
		  
	  }
}
