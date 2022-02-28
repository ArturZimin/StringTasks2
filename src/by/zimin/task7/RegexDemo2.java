package by.zimin.task7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {


    public static void main(String[] args) {

        /**
         *  /**
         *      * 7. Простейшее регулярное выражение
         *      * Изменить регулярное выражение в примере для нахождения
         *      * строк cab , ccab , cccab .
         *      * import java.util.regex.Matcher;
         *      * import java.util.regex.Pattern;
         *      * public class RegexDemo2 {
         *      * public static void main(String[] args) {
         *      * Pattern pattern = Pattern.compile("a*b");
         *      * Matcher matcher = pattern.matcher("aaab");
         *      * boolean b = matcher.matches();
         *      * System.out.println(b);
         *      * }
         *      * }
         *      */

        String a = "  cab  ,ccab  ,cccab";
        Pattern pattern = Pattern.compile(".*c+a{1}b{1}.*");//любой символ ,ноль или более раз,с -один или более раз,а - одие раз,b- один раз,любой символ,ноль или больше раз
        Matcher matcher = pattern.matcher(a);
        boolean b = matcher.matches();
        System.out.println(b);

    }
}
