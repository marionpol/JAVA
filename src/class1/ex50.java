package class1;

import java.util.Scanner;

public class ex50 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = reader.nextLine();

        for (int i = 0; i < name.length(); i++)
        {
            int number = i + 1;
            char character = name.charAt(i);
            System.out.println(number + "." + " character: " + character);
        }
    }
}
