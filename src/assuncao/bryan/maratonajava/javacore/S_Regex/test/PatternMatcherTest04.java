package assuncao.bryan.maratonajava.javacore.Sregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // ? Zero ou uma
        // * Zero ou mais
        // + Uma ou mais
        // {x, y} de x até y (por exemplo: de 0 a 3 ocorrências)
        // ()
        // | -> o(v/c)o -> vai dar match nas ocorrências ovo | oco
        // $ ->

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String text = "12 0x 0x 0xFFABC 0X10G 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }

    }
}






