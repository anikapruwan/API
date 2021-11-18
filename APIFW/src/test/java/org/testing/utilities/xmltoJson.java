package org.testing.utilities;

import org.json.JSONObject;
import org.json.XML;

public class xmltoJson 
{

	public String convertxmltojson(String x)
	{
		JSONObject js = XML.toJSONObject(x);
		return js.toString();
	}
}
