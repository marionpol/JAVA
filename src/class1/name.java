package class1;

import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0) {
                break;
            }

            sum = sum + read;

            System.out.printf("Sum now: " + sum);
        }
        System.out.printf("Sum in the end: " + sum );
    }
}
