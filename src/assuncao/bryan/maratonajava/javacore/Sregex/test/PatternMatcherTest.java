package assuncao.bryan.maratonajava.javacore.Sregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest {
    public static void main(String[] args) {

        String regex = "ab";

        String text = "abaaba";
        String text2 = "abababa";

        Pattern pattern = Pattern.compile(regex);


        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
        System.out.println(matcher.start()+ " " + matcher.group());
        }

        System.out.println("--");

        Matcher matcher2 = pattern.matcher(text2);
        while (matcher2.find()){
        System.out.println(matcher2.start()+ " " + matcher2.group());
        }
    }
}

