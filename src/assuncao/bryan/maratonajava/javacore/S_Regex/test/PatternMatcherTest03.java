package assuncao.bryan.maratonajava.javacore.S_Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {

        String regex = "0[xX][0-9a-fA-F]";
        String text = "12 0x 0x 0xFFABC 0X109 0x1";

        Pattern pattern = Pattern.compile(regex);


        Matcher matcher = pattern.matcher(text);


        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }

    }
}






