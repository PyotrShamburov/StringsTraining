package Task3;

public class SymbolCheck {

    public int checkSymbol(String str, char symbol) {
        int counter = 0;
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if ( array[i] == symbol){
                counter++;
            }
        }
       return counter;
    }
}

