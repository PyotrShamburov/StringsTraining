package Task2;

public class CheckPolindrom {
    public boolean checkPolyndrom(String str){
        StringBuilder string = new StringBuilder();
        for (int i = str.length() - 1; i >= 0 ; i--) {
            string.append(str.charAt(i));
        }
        return string.toString().equals(str);
    }
}
