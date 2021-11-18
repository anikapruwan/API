package org.testing.utilities;

import java.util.regex.Pattern;

public class replace 
{
	public static String replace_variable(String jsondata, String variablename, String variablevalue)
	{
	return	jsondata.replaceAll(Pattern.quote("{{"+variablename+"}}"), variablevalue);	
	}
	

}
