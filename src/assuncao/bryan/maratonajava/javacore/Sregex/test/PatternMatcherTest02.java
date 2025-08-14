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
        String text = "9jk8g7";

        Pattern pattern = Pattern.compile(regex);
        Pattern pattern2 = Pattern.compile(regex2);

        Matcher matcher = pattern.matcher(text);
        Matcher matcher2 = pattern2.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }

        System.out.println("---");

        while (matcher2.find()) {
            System.out.println(matcher2.start() + " " + matcher2.group());
        }
    }
}






