package by.zimin.task8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex3 {

    public static void main(String[] args) {


        /**
         * 8. Регулярное выражение, описывающее ссылку
         * Изменить регулярное выражение в примере – пусть reference1.org тоже
         * считается ссылкой.
         * import java.util.regex.Matcher;
         * import java.util.regex.Pattern;
         * public class RegexDemo3 {
         * public static void main(String[] args) {
         * System.out.println(test("google.com"));
         * System.out.println(test("reference1.ua"));
         * System.out.println(test("reference1.org"));
         * }
         * public static boolean test(String testString) {
         * Pattern pattern = Pattern.compile(".+\\.(com|ua|ru)");
         * Matcher matcher = pattern.matcher(testString);
         * return matcher.matches();
         */

        String link = "reference1.org";

        Pattern pattern = Pattern.compile(".+\\.(org)");
        Matcher matcher = pattern.matcher(link);
        boolean b = matcher.matches();
        System.out.println(b);

    }
}
