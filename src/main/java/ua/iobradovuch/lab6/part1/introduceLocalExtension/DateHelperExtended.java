package ua.iobradovuch.lab6.part1.introduceLocalExtension;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateHelperExtended {
    private DateHelper dateHelper;

    public DateHelperExtended(DateHelper dateHelper) {
        this.dateHelper = dateHelper;
    }

    public static Date addDays(Date date, int days) {
        return DateHelper.addDays(date, days);
    }

    public static long getDifferenceInDays(Date date1, Date date2) {
        long diffInMillies = Math.abs(date2.getTime() - date1.getTime());
        return TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
    }
}