package org.testing.utilities;

import org.json.JSONObject;
import org.json.XML;

public class jsontoxml 
{
	public String convertjsontoxml(String j)
	{
		JSONObject x = new JSONObject(j);
		String xml = XML.toString(x);
		return xml;
	}

}
