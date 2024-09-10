package class1;

import java.util.Scanner;

public class ex53 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = reader.nextLine();

        System.out.println("Enter the length of the first part: ");
        int length = reader.nextInt();

        System.out.println("Result: " + word.substring(0, length));

    }
}
