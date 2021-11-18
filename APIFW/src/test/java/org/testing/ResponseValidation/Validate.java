package org.testing.ResponseValidation;

import org.testing.utilities.jsonParsingwithJsonPath;

import io.restassured.response.Response;

public class Validate 
{
	public static void statusCodeValidate(int expectedcode, Response res)
	{
		if(expectedcode==res.getStatusCode())
		{
			System.out.println("Status code is correct");
		}
		else
		{
			System.out.println("Status code not matched " + res.getStatusCode() );
		}
	}
	
	public static void datavalidate(String validate, Response res, String path)
	{
		String actualData = jsonParsingwithJsonPath.jsnPathparse(path, res);
		
		if(actualData.equals(validate))
		{
			System.out.println("data matched");
		}
		else
		{
			System.out.println("data not matched");
		}
	}
	

}
