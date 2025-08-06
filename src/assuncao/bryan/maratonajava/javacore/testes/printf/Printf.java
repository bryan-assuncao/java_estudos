package assuncao.bryan.maratonajava.javacore.testes.printf;

public class Printf {
    public static void main(String[] args) {
        String name = "Maria";
        int age = 30;
        double price = 1.99;

        // %s -> String
        // %n -> Quebra de linha
        // %d -> Int
        // %2.f -> Double
        //-15 -> número de caracteres que deve ter

        System.out.printf("Name: %s %nAge: %d %nPrice: $ %.2f%n", name, age, price);

        System.out.println("---------------------------------------------------------");

        System.out.printf("Name: %-15s Age: %-15d Price: $ %.2f%n", name, age, price);

        System.out.println("---------------------------------------------------------");

        System.out.printf("Name: %15s %nAge: %13d %nPrice:  %12.2f", name, age, price);

    }
}



