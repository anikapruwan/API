package org.tesing.testscripts;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.Validate;
import org.testing.testSteps.HTTPMethod;
import org.testing.utilities.JsonRead;
import org.testing.utilities.PropertiesRead;
import org.testing.utilities.jsonParsingwithJsonPath;
import org.testing.utilities.replace;
import org.testing.utilities.rndom;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC5_PutRequest 
{
	@Test
	public void testcase5() throws IOException
	{
	Properties probject = PropertiesRead.ReadPropertyFile("../APIFW/URI.properties");
    String bodydata =	JsonRead.readJsonData("../APIFW/src/test/java/org/testing/resources/PutPayload.json");
 //   bodydata =   replace.replace_variable(bodydata, "id", rndom.randm().toString());
	HTTPMethod http = new HTTPMethod(probject);
	Response r = http.PutRequest(bodydata, "QA_URI_APIStudents", TC1_PostRequest.id);
	System.out.println(r.statusCode());
	Validate.statusCodeValidate(200, r);
	System.out.println(r.asString());
	System.out.println("Designation " + jsonParsingwithJsonPath.jsnPathparse("designation", r));
	Validate.datavalidate("manager", r, "designation");
	}

}
