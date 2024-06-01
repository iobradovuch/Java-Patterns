package ua.iobradovuch.lab6.part1.introduceLocalExtension;

import java.util.Calendar;
import java.util.Date;

public class DateHelper {
    // This class provides helper functions related to dates.
    public static Date addDays(Date date, int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, days);
        return calendar.getTime();
    }
}