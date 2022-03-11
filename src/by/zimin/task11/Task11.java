package by.zimin.task11;

public class Task11 {


    public static void main(String[] args) {

        System.out.println(countWordsOnlyWithSymbolsLatinAlphabet("Versions Ja5va Java5 Java 7 Java7, Java 12"));

    }

    /**
     * 11. Найти количество слов
     * Предложение состоит из нескольких слов, разделенных пробелами. Например: "One
     * two three раз два три one1 two2 123 ". Найти количество слов, содержащих только
     * символы латинского алфавита.
     */

    public static int countWordsOnlyWithSymbolsLatinAlphabet(String txt) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) != ' ') {
                sb.append(txt.charAt(i));

            } else {
                if (!sb.isEmpty() && sb.toString().matches("[a-zA-z]+")) {

                    count++;
                    sb.delete(0, sb.length());
                }
                sb.delete(0, sb.length());

            }
        }

        return count;
    }

}
