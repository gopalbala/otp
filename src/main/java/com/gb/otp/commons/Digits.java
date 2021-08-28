package com.gb.otp.commons;

public enum Digits {
    SIX(1000000), SEVEN(10000000), EIGHT(100000000);
    private int digits;

    Digits(int digits) {
        this.digits = digits;
    }

    public int getDigits() {
        return digits;
    }
}
