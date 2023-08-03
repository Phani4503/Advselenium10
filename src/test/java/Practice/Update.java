package Practice;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Update {
	public static void main(String[] args) {
		//Create the requride date - put patch post
		JSONObject jobj= new JSONObject();
		jobj.put("name","pk");
		jobj.put("job","testing");
		
		//send the request 	
		RequestSpecification req = RestAssured.given();
		req.body(jobj);
		req.contentType(ContentType.JSON);
		
		Response resp = req.put("https://reqres.in/api/users/2");
		
		
		//Validate the response
		resp.then().log().all();
	}

}
