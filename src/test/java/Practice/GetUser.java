package Practice;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetUser {
	public static void main(String[] args) {
		//step 1:Create the required data -put post delete patch
		
		//step 2:send the resquest 
		Response res = RestAssured.get("https://reqres.in/api/users/2");
		
		//Validate the response 
		res.then().log().all();
	}

}
