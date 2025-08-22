package assuncao.bryan.maratonajava.javacore.A_Classes.test;

import java.util.Scanner;

public class InputKeyboardDataTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please type your first name: ");
        String name = input.nextLine();

        System.out.print("Type your age: ");
        int age = input.nextInt();

        System.out.print("Type your weight: ");
        double weight = input.nextDouble();

        System.out.print("Type M or F for your gender");
        char gender = Character.toUpperCase(input.next().charAt(0));

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println(gender == 'M' ? "Gender: Man" : "Gender: Woman");

    }
}


