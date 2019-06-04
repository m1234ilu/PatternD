package com.design.factory.service;

import java.text.FieldPosition;
import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;

import org.junit.Test;

public class I18nTest {
	@Test
	public void testMessageFormat2(){
		String str = "Date: {0}, Salary: {1}";
		
		Locale locale = Locale.CHINA;
		Date date = new Date();
		double sal = 12345.12;
		
		StringBuffer result = new StringBuffer();
		FieldPosition fieldPosition = new FieldPosition(0);
		
		MessageFormat messageFormat = new MessageFormat(str, locale);
		messageFormat.format(date, result, fieldPosition);
		
		System.out.println(result); 
	}
}
