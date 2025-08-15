package assuncao.bryan.maratonajava.javacore.Sregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = Todos os números
        // \D = Tudo que não for números
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caractéres menos os espaços em branco
        // \w = Todas as letras, números e _
        // \W = Tudo que não for o incluso \w (simbolos)

        String regex = "\\d";
        String regex2 = "\\D";
        String regex3 = "\\W";
        String text = "9*jk#8g7!";

        Pattern pattern = Pattern.compile(regex);
        Pattern pattern2 = Pattern.compile(regex2);
        Pattern pattern3 = Pattern.compile(regex3);

        Matcher matcher = pattern.matcher(text);
        Matcher matcher2 = pattern2.matcher(text);
        Matcher matcher3 = pattern3.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }

        System.out.println("---");

        while (matcher2.find()) {
            System.out.println(matcher2.start() + " " + matcher2.group());
        }

        System.out.println("---");

        while (matcher3.find()){
            System.out.println(matcher3.start() + " " + matcher3.group());
        }
    }
}






