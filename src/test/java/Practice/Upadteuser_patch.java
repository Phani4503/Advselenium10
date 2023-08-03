package Practice;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class Upadteuser_patch {
public static void main(String[] args) {
	//Create the Requride Data -Post,Put,Patch
    JSONObject jobj= new JSONObject();
    jobj.put("name","nothing");
    jobj.put("job","dv");
    
	
	
	//send the request 
    RequestSpecification req = RestAssured.given();
    req.
	
	
	//validate the respone 
	req.th
	
	
	
}
}
