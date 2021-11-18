package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonParsingwithOrgJson 
{
	public static void jsonParse(String ResponseData, String KeyName)
	{
		JSONArray data = new JSONArray(ResponseData);
		int length = data.length();
		for(int i=0; i<length; i++ )
		{
			JSONObject obj = data.getJSONObject(i);
			System.out.println("id value is"+ obj.get(KeyName));
		}
		
	}

}
