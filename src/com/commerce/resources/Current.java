package com.commerce.resources;

import java.util.Locale;

public enum Current {
    ;
    private static final Locale en = Locale.ENGLISH;
    private static final Locale def = Locale.getDefault();
    private static final Locale optional = Locale.CHINA;
    private static final Locale ru = new Locale("ru", "RU");
    private static final Locale ukr = new Locale("uk", "UA");
    public static final Locale getLocale() {
        return ukr;
    }
}
