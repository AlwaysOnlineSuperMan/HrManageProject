package com.hr.util;

public class GenerateCode {
public static String getGenerateHumanNo(){
		
		Long no = System.currentTimeMillis();
		return no.toString();
	}
}
