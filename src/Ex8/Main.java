package Ex8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> words = new ArrayList<>();
        String symbol = in.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader("1.txt"))) {
            String line;
            while((line = br.readLine()) != null) {
                words.add(line);

            }
        } catch (IOException e) {
            System.out.println("Ошибка при прочтении файла: " + e.getMessage());
            System.exit(1);
        }

        for(String text : words) {
            if (text.charAt(0) == symbol.charAt(0)) {
                System.out.println(text);
            }
        }


    }
}
