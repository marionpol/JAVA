package words;

import java.util.Scanner;

public class TextUserInterface {
    public Scanner reader;
    public Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }
    public void start() {
        System.out.println("Statements:" +
                "add - add a word to the dictionary" +
                "translate - asks for a word and prints the translation" +
                "quite - quits the text ui");
        while (true) {
            System.out.print("Enter a command: ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                System.out.println("Quitting...");
                break;
            } else if (command.equals("add")) {
                System.out.print("Enter the word: ");
                String word = reader.nextLine();
                System.out.print("Enter the translation: ");
                String translation = reader.nextLine();
                dictionary.add(word, translation);
                System.out.println("Added: " + word + " = " + translation);
            } else if (command.equals("translate")) {
                System.out.print("Enter a word: ");
                String word = reader.nextLine();
                String translation = dictionary.translate(word);
                if (translation != null) {
                    System.out.println("Translation: " + translation);
                } else {
                    System.out.println("Word not found.");
                }
            } else {
                System.out.println("Unknown statement");
            }
        }
    }
}
