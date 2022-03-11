package by.zimin.task12;

public class FindPalindrome {

    public static void main(String[] args) {


        System.out.println(lookForIntPalindromeInTheTxt("Если есть хвосты по дз,\n" +
                "     * начните с 1 не сданного задания. 123 324 111 4554 "));
    }


    /**
     * 12. Найти палиндром
     * Предложение состоит из нескольких слов, например: "Если есть хвосты по дз,
     * начните с 1 не сданного задания. 123 324 111 4554". Среди слов, состоящих только
     * из цифр, найти слово палиндром.
     *
     * @param str
     * @return
     */

    public static String lookForIntPalindromeInTheTxt(String str) {
        StringBuilder palindrome = new StringBuilder();
        String temp = "";
        String temp2 = "";
        char[] str1 = str.toCharArray();
        for (int i = 0; i < str1.length; i++) {

            if (Character.isDigit(str1[i])) {
                temp+=str1[i];
            } else {
                if (temp.length() >= 2) {

                    for (int y=temp.length()-1;y>=0;y--){
                        temp2+=temp.charAt(y);
                    }
                    if (temp.equals(temp2)) {
                        palindrome.append(temp + "\n");
                        temp="";
                        temp2="";

                    }else {
                        temp="";
                        temp2="";
                    }
                } else {
                    temp="";
                    temp2="";
                }
            }
        }


        return palindrome.toString();
    }
}
