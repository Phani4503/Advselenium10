package Practice;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteUser {
public static void main(String[] args) {
	//Create the required data -put post patch
	
	//send the requst 
	Response res  = RestAssured.delete("https://reqres.in/api/users/2");
	
	//validate the respones 
	res.then().log().all();
}
}
