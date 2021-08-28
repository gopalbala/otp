package com.gb.otp.commons;

import java.time.Instant;

import static com.gb.otp.constants.AppConstant.INTERVAL;

public class Clock {
    private final int interval;

    public Clock(int interval) {
        this.interval = interval;
    }

    public Clock() {
        this.interval = INTERVAL;
    }

    public long getCurrentInterval() {
        long currentTimeInMills = Instant.now().toEpochMilli() / 1000;
        return currentTimeInMills / interval;
    }

}
