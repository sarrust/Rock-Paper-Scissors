package Ex6;

public class Main {
    public static void main(String[] args) {
        String[] text = {"Hi" , "I" , "Hello", "Sort", "How" , "Insert", "Break"};
        for(int i = 0; i < text.length; i++) {
            for(int j = 0; j < text.length; j++) {
                if(text[i].length() < text[j].length()) {
                    String word = text[i];
                    text[i] = text[j];
                    text[j] = word;
                }
            }
        }
        for(String t : text) {
            System.out.println(t + " ");
        }
    }
}
