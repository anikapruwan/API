package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonRead 
{

	public static String readJsonData(String jsonfile) throws FileNotFoundException
	{
		File f= new File(jsonfile);
		FileReader fr = new FileReader(f);
		JSONTokener jt = new JSONTokener(fr);
		JSONObject jb = new JSONObject(jt);
		return jb.toString();
		
	}
	
}
