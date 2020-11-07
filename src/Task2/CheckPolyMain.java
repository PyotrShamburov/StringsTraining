package Task2;

import java.util.Scanner;

public class CheckPolyMain {
    public static void main(String[] args) {
        CheckPolindrom checkPolindrom = new CheckPolindrom();
        Scanner in = new Scanner(System.in);
        String [] words = new String[5];

        for (int i = 0; i < words.length; i++) {
            words[i] = in.nextLine();
        }
        for (int i = 0; i < words.length; i++) {
            if (checkPolindrom.checkPolyndrom(words[i])) {
                System.out.println("Word: "+words[i]+" - polyndrom!" );
            } else {
                System.out.println("Word: "+words[i]+" - doesn't polyndrom!" );
            }
        }
    }
}
