package by.zimin;

import java.util.Formatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTasksNew {

    public static void main(String[] args) {

//
//        System.out.println(composeStringWithStringBuilder(12, 23));
//        System.out.println(replaceSymbol());
//        System.out.println(replaceSymbolWithReplace());
//        System.out.println(replaceEverySecondOccurrence());
//        System.out.println(findTwoIntermediateSignsString("String"));
//        System.out.println(findTwoIntermediateSignsString("code"));
//        System.out.println(findTwoIntermediateSignsString("practice"));
//        System.out.println(useClassFormatter("Ivanov", 8, "Biology"));
//        System.out.println(divideNumbersAndFormat(1000, 3));

        System.out.println(replaceEverySecondOccurrence());
    }

    /**
     * 2. Составляем строку с помощью класса StringBuilder
     * 1. Дано два числа, например 3 и 56, необходимо составить следующие строки:
     * 3 + 56 = 59
     * 3 – 56 = -53
     * 3 * 56 = 168.
     * Используем метод StringBuilder.append().
     */

    public static String composeStringWithStringBuilder(int a, int b) {
        StringBuilder sb = new StringBuilder();
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        sb.append(a + " + " + b + " = " + c);
        sb.append("\n");
        sb.append(a + " - " + b + " = " + d);
        sb.append("\n");
        sb.append(a + " * " + b + " = " + e);
        sb.append("\n");
        sb.append(a + " / " + b + " = " + f);

        return sb.toString();
    }

    /**
     * 2. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),
     * StringBuilder.deleteCharAt().
     */
    public static String replaceSymbol() {
        StringBuilder sb = new StringBuilder();
        sb.append(composeStringWithStringBuilder(12, 12));
        int ind;
        while (sb.indexOf("=") != -1) {
            ind = sb.indexOf("=");
            sb.delete(ind, ind + 1);
            sb.insert(ind, " equals ");
        }

        return sb.toString();

    }

    /**
     * 3. Замените символ “=” на слово “равно”. Используйте методы
     * StringBuilder.replace().
     */

    public static String replaceSymbolWithReplace() {
        StringBuilder sb = new StringBuilder();
        sb.append(composeStringWithStringBuilder(18, 19));
        return sb.toString().replaceAll("=", "равно");
    }

    public static String replaceEverySecondOccurrence() {
        StringBuilder sb = new StringBuilder();
        sb.append("Object-oriented programming is a programming language model organized " +
                "around objects rather than actions and data rather than logic. Object-oriented" +
                " programming blabla. Object-oriented programming bla.");

        Pattern pattern = Pattern.compile(".?(Object)-(oriented) ?(\\n?)(programming).");
        Matcher matcher = pattern.matcher(sb.toString());
        boolean flag = false;
        while (matcher.find()) {

            if (flag) {
               // sb.toString().replace("Object-oriented programming", "OOP");
                sb.replace(matcher.start(),matcher.end(),"OOP");
            }
                flag = true;

        }
        return sb.toString();
    }

    /**
     * 4. Найти два средних знака строки
     * Даны строки разной длины (длина - четное число), необходимо вернуть ее два
     * средних знака. Например, если дана строка "string" результат будет "ri", для строки
     * "code" результат "od", для "Practice" результат "ct".
     */

    public static String findTwoIntermediateSignsString(String str) {
        StringBuilder sb = new StringBuilder();
        int lengthStr = str.length() - 1;
        int divide = lengthStr / 2;
        sb.append(str.charAt(divide));
        sb.append(str.charAt(divide + 1));
        return sb.toString();
    }

    /**
     * 5. Список студентов
     * Создать строку, используя форматирование: Студент [Фамилия] получил [оценка] по
     * [предмету]. Форматирование и вывод строки на консоль написать в отдельном
     * методе, который принимает фамилию, оценку и название предмета в качестве
     * параметров. Выделить под фамилию 15 символов, под оценку 3 символа, под
     * предмет – 10.
     * Пример вывода:
     * Студент Иванов получил 5 по Математике
     * Студент Петрова получил 4 по Физике
     * Студент Сидорова получил 3 по Программированию
     */

    public static String useClassFormatter(String lastname, int grade, String nameSubject) {
        Formatter f = new Formatter();
        f.format("The student %-15s got %-3d in the subject of %-10s\n", lastname, grade, nameSubject);//15 symbols,3 symbols,10 symbols
        f.format("The student %15s got %3d in the subject of %10s", lastname, grade, nameSubject);//15 symbols,3 symbols,10 symbols
        return f.toString();//if was -15,-3,-10 выровнялось бы по левой стороне
    }

    public static String divideNumbersAndFormat(double d1, double d2) {
        Formatter f = new Formatter();
        double divide = 0;
        if (d2 > 0) {
            divide = d1 / d2;
        } else {
            System.out.println("It is forbidden to divide by zero!");
        }
        f.format("Divide %f na %f = % .4f", d1, d2, divide);
        System.out.printf("Divide %f na %f = % .4f\n", d1, d2, divide);// the same
        System.out.printf("Divide %f na %f = % .4f\n", d1, d2, divide);
        return f.toString();

    }


}
