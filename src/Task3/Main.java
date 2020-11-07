package Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your words: ");
        Scanner in = new Scanner(System.in);
        SymbolCheck symbolCheck = new SymbolCheck();
        String[] array = new String[5];
        for (int i = 0; i < array.length; i++) {
            System.out.print(i+1+" :");
            array[i] = in.nextLine();
        }
        System.out.println("Enter your symbol for check: ");
        char symbol = in.next().charAt(0);
        for (int i = 0; i < array.length; i++) {
            System.out.println("In word "+array[i]+" symbol "+symbol+" was "+symbolCheck.checkSymbol(array[i],symbol ));


        }


    }
}
