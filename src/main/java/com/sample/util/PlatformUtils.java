package com.sample.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.ZoneOffset;
import java.util.Locale;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PlatformUtils {
    public static final Locale RU_LOCALE = new Locale("ru", "RU");
    public static final Charset CHARSET_UTF_8 = StandardCharsets.UTF_8;
    public static final Charset CHARSET_WINDOWS_1251 = Charset.forName("cp1251");
    public static final String FILE_SEPARATOR = System.lineSeparator();
    public static final ZoneOffset ZONE = ZoneOffset.UTC;
}
