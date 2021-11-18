package org.tesing.testscripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethod;
import org.testing.utilities.JsonRead;
import org.testing.utilities.PropertiesRead;
import org.testing.utilities.jsonParsingwithJsonPath;
import org.testing.utilities.replace;
import org.testing.utilities.rndom;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC1_PostRequest 
{
	static String id;
	@Test
	public void firstTC() throws IOException
	{
		Properties probject = PropertiesRead.ReadPropertyFile("../APIFW/URI.properties");
	    String bodydata =	JsonRead.readJsonData("../APIFW/src/test/java/org/testing/resources/RequestPayload.json");
	    bodydata =   replace.replace_variable(bodydata, "id", rndom.randm().toString());
		HTTPMethod http = new HTTPMethod(probject);
		Response r = http.PostRequest(bodydata, "QA_URI_APIStudents");
		System.out.println(r.statusCode());
		System.out.println(r.asString());
		id = jsonParsingwithJsonPath.jsnPathparse("id", r);
	}

}
