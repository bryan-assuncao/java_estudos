package assuncao.bryan.maratonajava.javacore.S_Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // ? Zero ou uma
        // * Zero ou mais
        // + Uma ou mais
        // {x, y} de x até y (por exemplo: de 0 a 3 ocorrências)
        // () -> Agrupar
        // | -> o(v/c)o -> Vai dar match nas ocorrências ovo | oco
        // $ -> Final da linha

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String text = "bryan.assuncao@gmail.com, maju.trindade@hotmail.com, #@!zoro@mail.com, teste@outlook.com.br";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }

    }
}






