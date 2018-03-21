package com.commerce.resources;

import java.util.Locale;

public enum Current {
    ;
    private static Locale en = Locale.ENGLISH;
    private static Locale ru = new Locale("ru", "RU");
    private static Locale ukr = new Locale("uk", "UA");
    public static Locale getLocale() {
        return ukr;
    }
}
