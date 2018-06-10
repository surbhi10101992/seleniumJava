package com.test.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utility {

	public static String randomNumber() {
		String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		return timeStamp;
	}

}
