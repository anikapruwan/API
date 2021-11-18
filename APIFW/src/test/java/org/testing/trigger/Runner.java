package org.testing.trigger;

import java.io.IOException;

import org.tesing.testscripts.TC1_PostRequest;
import org.tesing.testscripts.TC2_GetRequest;
import org.tesing.testscripts.TC3_GetAll;
import org.tesing.testscripts.TC4_GetAll_FetchID;
import org.tesing.testscripts.TC5_PutRequest;
import org.tesing.testscripts.TC6_DeleteRequest;

public class Runner
{
	public static void main(String[] args) throws IOException {
		
		TC1_PostRequest tc1 = new TC1_PostRequest();
		tc1.firstTC();
		
		TC2_GetRequest tc2 =new TC2_GetRequest();
		tc2.testcase2();
		
	/*	TC3_GetAll tc3 = new TC3_GetAll();
		tc3.testcase3();
		
		TC4_GetAll_FetchID tc4 = new TC4_GetAll_FetchID();
		tc4.testcase4(); */
		
		TC5_PutRequest tc5 = new TC5_PutRequest();
		tc5.testcase5();
		
		TC6_DeleteRequest tc6 = new TC6_DeleteRequest();
		tc6.DeleteRequest();

	}

}
