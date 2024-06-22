package i18n;

import sun.util.resources.LocaleData;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateFormatDemo {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        Locale vi = new Locale("vi");
        Locale ja = new Locale("ja");

        String s1 = formatDateByLocale(localDate, vi);
        System.out.println("s1 = " + s1);
        String s2 = formatDateByLocale(localDate, ja);
        System.out.println("s2 = " + s2);
        String s3 = formatDateByLocale(localDate, Locale.US);
        System.out.println("s3 = " + s3);

        String s4 = formatDateByPattern(localDate, "EEEE, yyyy-MM-dd");
        System.out.println("s4 = " + s4);
    }

    public static String formatDateByLocale(LocalDate date, Locale locale) {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(locale);
        return formatter.format(date);
    }

    public static String formatDateByPattern(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return formatter.format(date);
    }
}
