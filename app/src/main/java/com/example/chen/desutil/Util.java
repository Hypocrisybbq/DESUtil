package com.example.chen.desutil;

public class Util {
    static {
        System.loadLibrary("util");
    }

    public static native String DESEncrypt(Object context, String info, String key);
}
