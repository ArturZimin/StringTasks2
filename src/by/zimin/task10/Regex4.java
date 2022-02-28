package by.zimin.task10;

public class Regex4 {
    public static void main(String[] args) {


        System.out.println(findWortWithMinimumDifferentSymbols("fffff ab f 1234 jkjk"));



    }

    /**
     * 10. Слово с минимальным числом символов
     * Найти слово, в котором число различных символов минимально. Слово может
     * содержать буквы и цифры. Если таких слов несколько, найти первое из них.
     * Например, в строке "fffff fffgf 11111 ab f 1234 jkjk" найденное слово должно быть "fffff".
     */

    public static String findWortWithMinimumDifferentSymbols(String str){
        StringBuilder sb=new StringBuilder();
        String min="";
        int count=0;
        int identical=0;
        boolean flag=false;
        for (int i =0;i<str.length();i++){
            if (str.charAt(i)!=' '){
                flag=true;
                sb.append(str.charAt(i));

            }else{

                    for (int y=0;y<sb.length();y++){
                        for (int o=y+1;o<sb.length();o++){
                            if (sb.charAt(y)==sb.charAt(o)){
                                identical++;
                            }
                        }

                    }


                if (identical>count){
                    count=identical;
                    min=sb.toString();
                }
                sb.delete(0,sb.length()-1);
            }
        }

        return min;
    }
}
