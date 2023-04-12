package Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a;
        int b,c;
        boolean exit = true;
        while(exit) {
            System.out.println("Таблицу умножения какого числа вы хотите увидеть?\nА если хотите всю таблицу введите \"full\"");
            a = scanner.nextLine();
            b = 1;
            if(a.equals("exit")) {
                exit = false;
            } else if (a.equals("full")) {
                for (int i = 1; i < 10; i++) {
                    for(int j = 1; j < 10; j++) {
                        c = i * j;
                        System.out.println(i + " * " + j + " = " + c);
                    }
                    System.out.println("====================");
                }
            } else {
                int a1 = Integer.parseInt(a);
                if(a1 > 0 && a1 < 10) {
                    System.out.println("Таблица умножения цифры: " + a1);
                    for (int i = 1; i < 10; i++) {
                        c = a1 * b;
                        System.out.println(a1 + " * " + b + " = " + c);
                        b++;
                    }
                } else {
                    System.out.println("Некорректный ввод. Повторите попытку!");
                }
                System.out.println("Для выхода введите \"exit\", а чтобы продолжить введите любое число");
            }

        }
    }
}
