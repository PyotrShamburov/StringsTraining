package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your words: ");
        Reverse reverse = new Reverse();
        Scanner in = new Scanner(System.in);
        String [] words = new String[10];

        for (int i = 0; i < words.length; i++) {
            words[i] = in.nextLine();
            reverse.reverseString(words[i]);
        }
        System.out.println("Task1.Reverse words: ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(reverse.reverseString(words[i]));
        }


















    }
}
