package org.testing.testSteps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class HTTPMethod 
{
	Properties pr;
	public HTTPMethod(Properties pr)
	{
	this.pr=pr;
	}
	
	public Response PostRequest(String bodyData, String urikey)
	{
		Response r =
				given()
				.contentType(ContentType.JSON)
				.body(bodyData)
				.when()
				.post(pr.getProperty(urikey));
		return r;
		
		
		
	}

public Response GetRequest(String uriKey, String idValue)
{
	String base = pr.getProperty(uriKey);
	String uri = base+"/"+idValue;
	Response res = given()
	.contentType(ContentType.JSON)
	.when().get(uri);
	return res;
	
}
public Response GetAll(String uriKey)
{
	Response res = given()
	.contentType(ContentType.JSON)
	.when().get(pr.getProperty(uriKey));
	return res;
	
}

public Response PutRequest(String bodyData,String urikey, String idValue)
{
	String uri = pr.getProperty(urikey)+"/"+idValue;
	Response res = given().contentType(ContentType.JSON)
	.body(bodyData)
	.when()
	.put(uri);
	return res;

}

public Response DeleteRequest(String uriKey, String idValue)
{
	String uri = pr.getProperty(uriKey)+"/"+idValue;
	Response res = given().contentType(ContentType.JSON)
	.when().delete(uri);

	return res;
	
	
}


}
