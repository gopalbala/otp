package com.gb.otp.commons;

public enum Hash {
    HmacSHA1("HmacSHA1"),
    HmacSHA256("HmacSHA256");

    private String hash;

    Hash(String hash) {
        this.hash = hash;
    }

    public String getHash() {
        return this.hash;
    }
}
