package Hangman;
import java.util.Scanner;
import java.util.*;

public class Hangman {

    public static void main(String[] args) {
        System.out.println("HANGMAN\n" + "The game will be available soon.");

        Random random = new Random();
        List<String> words = new ArrayList<>();
        words.add("windows");
        words.add("linux");
        words.add("android");
        words.add("ios");
        words.add("macOS");
        words.add("Nvidia");
        words.add("AMD");
        String hiddenword = words.get(random.nextInt(words.size()));
        Scanner in = new Scanner(System.in);
        System.out.println("Guess the word: ");
        Scanner scanner = new Scanner(System.in);

        String user_input = scanner.nextLine();

        if (hiddenword.equals(user_input)) {
            System.out.println("You survived!");

        } else {
            System.out.println("You lost!:(");
        }
    }


}