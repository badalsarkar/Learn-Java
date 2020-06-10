package com.test.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	public static String formatDate(Date date) {
		String pattern = "EEE, MMM d, yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		System.out.println(new Date());
		String formattedDate = simpleDateFormat.format(date);
		System.out.println(date);
		return formattedDate;
	}

}
