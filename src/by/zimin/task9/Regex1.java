package by.zimin.task9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {

    public static void main(String[] args) {


        /**
         * 9. Регулярное выражение для нахождения Java X
         * Дана строка “Versions: Java 5, Java 6, Java 7, Java 8, Java 12.” Найти все подстроки
         * "Java X" и распечатать их.
         */

        String str = "Versions: Java 5, Java 6, Java 7, Java 8, Java 12.";
        Pattern pattern = Pattern.compile("(Java) \\d{1,}");

        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(str.substring(matcher.start(), matcher.end()));
        }


    }
}
