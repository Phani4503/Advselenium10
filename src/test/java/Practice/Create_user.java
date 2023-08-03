package Practice;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Create_user {
public static void main(String[] args) {
	
	//Create the Requride Data -Post,Put,Patch
	JSONObject jobj= new JSONObject();
	jobj.put("name","phani");
	jobj.put("job","testing");
	
	
	//Send the Request
	RequestSpecification req = RestAssured.given();//When you want body
	req.body(jobj);
	req.contentType(ContentType.JSON);
	Response resp = req.post("https://reqres.in/api/users");
	
	
	//valid Data 
	resp.then().log().all();//print the respone in json formet in console
}
}
