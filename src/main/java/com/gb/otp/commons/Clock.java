package com.gb.otp.commons;

import java.time.Instant;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import static com.gb.otp.constants.AppConstant.INTERVAL;

public class Clock {
    private final int interval;
    Calendar calendar;
    public Clock(int interval) {
        this.interval = interval;
    }

    public Clock() {
        this.interval = INTERVAL;
    }

    /**
     * the clock here and the clock from client should be in sync so use UTC from both ends.
     * Could use Zoned date time too based on the client's zone store the details.
     * @return long
     */
    public long getCurrentInterval() {
        calendar = GregorianCalendar.getInstance(TimeZone.getTimeZone("UTC"));
        long currentTimeInMills = calendar.getTimeInMillis() / 1000;
        return currentTimeInMills / interval;
    }

}
