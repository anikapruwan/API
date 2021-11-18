package org.tesing.testscripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethod;
import org.testing.utilities.PropertiesRead;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC6_DeleteRequest
{
	@Test
	public void DeleteRequest() throws IOException
	{
		Properties probject = PropertiesRead.ReadPropertyFile("../APIFW/URI.properties");
		HTTPMethod http = new HTTPMethod(probject);
		Response res = http.DeleteRequest("QA_URI_APIStudents", TC1_PostRequest.id);
	    System.out.println(res.statusCode());
	    System.out.println(res.asString());
	}

}
