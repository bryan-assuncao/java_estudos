package assuncao.bryan.maratonajava.javacore.RresourceBundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
    public static void main(String[] args) {

        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));

        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good_morning"));

        System.out.println("--------------");

        ResourceBundle bundle2 = ResourceBundle.getBundle("messages", new Locale("fr", "FR"));

        System.out.println(bundle2.getString("hello"));
        System.out.println(bundle2.getString("good_morning"));

        System.out.println("--------------");

        ResourceBundle bundle3 = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundle3.getString("hello"));
        System.out.println(bundle3.getString("good_morning"));
    }
}



