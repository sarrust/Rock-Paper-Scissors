package Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        StringBuilder reversed = new StringBuilder();
        reversed.append(text);
        reversed.reverse();
        if(text.contentEquals(reversed)) {
            System.out.println("Это слово является полиндромом!\n" +
                    "Оригинал: " + text +
                    "\nОбратное чтение: " + reversed);
        } else {
            System.out.println("Это слово не является полиндромом!");
        }

    }
}
