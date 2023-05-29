package com.griffinhill.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

    static DateFormat dateFormat;
    LocalDateTime now;
    static Date date;

    public static String getCurrentDateAndTime(String format) {
        dateFormat = new SimpleDateFormat(format);
        date = new Date();
        String currentDateAndTime = dateFormat.format(date);
        return currentDateAndTime;
    }

    public static String getTomorrowDate() {
        return LocalDate.parse(getCurrentDateAndTime("yyyy-MM-dd")).plusDays(1).toString();
    }

    public String getCurrentDateAndTimePlusMinutes(String format, int minutes) throws ParseException {
        String currentDateAndTime = getCurrentDateAndTime(format);
        SimpleDateFormat df = new SimpleDateFormat(format);
        Date d = df.parse(currentDateAndTime);
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.MINUTE, minutes);
        String newTime = df.format(cal.getTime());
        System.out.print(newTime);
        return newTime;
    }
}
