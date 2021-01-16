package com.test01;

import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class AbstractTest {

	public abstract String dayInfo();

	// singleton(calendar에서 사용);한번만 메모리에 적재되고 메모리에 있는 객체 리턴
	public static AbstractTest getInstance() {

		GregorianCalendar cal = new GregorianCalendar();
		
		int day = cal.get(Calendar.DAY_OF_WEEK);

		switch (day) {

		case 1:
			return new Sunday();
		case 2:
			return new Monday();
		case 3:
			return new Tuesday();
		case 4:
			return new Wendesday();
		case 5:
			return new Thursday();
		case 6:
			return new Friday();
		case 7:
			return new Saturday();

		}

		return null;
	}

}
