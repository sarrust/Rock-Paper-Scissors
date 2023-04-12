package Ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int count = 0;
        System.out.println("Все простые числа до " + a + ": ");
        for(int i = 2; i < a; i++) {
            for(int j = 1; j < a; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if(count == 2) {
                System.out.print(i + " ");
            }
            count = 0;
        }
    }
}
