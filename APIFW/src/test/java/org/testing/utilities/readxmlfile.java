package org.testing.utilities;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;

public class readxmlfile 
{
	public static String readxml(String path) throws IOException
	{
		File f = new File(path);
		FileReader fr = new FileReader(f);
		BufferedReader b = new BufferedReader(fr);
		String s;
		String append=null;
		while((s=b.readLine())!=null)
		{
			append=append+s;
		}
		return append;
		
	}

}
