package org.testing.utilities;

import io.restassured.response.*;

public class jsonParsingwithJsonPath 
{
	public static String jsnPathparse(String path, Response res)
	{
		String value = res.jsonPath().get(path).toString();
		return value;
		
	}

}
