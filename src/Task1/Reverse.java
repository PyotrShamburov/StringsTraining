package Task1;

public class Reverse {

    public String reverseString(String str){
        StringBuilder string = new StringBuilder();
        for (int i = str.length() - 1; i >= 0 ; i--) {
            string.append(str.charAt(i));
        }
        return string.toString();
    }
}
