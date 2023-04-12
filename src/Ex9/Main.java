package Ex9;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] robotText = {"Камень", "Ножницы", "Бумага"};

        System.out.println("Это игра Камень-Ножницы-Бумага!\nВыбирайте одно или для выхода нажмите \"Выход\": ");
        while(true) {
            String text = in.nextLine();
            if(text.equals("Выход")) {
                System.out.println("Спасибо за игру! Всего доброго!");
                break;
            }
            int index = new Random().nextInt(robotText.length);
            if(!text.equals("Камень") && !text.equals("Ножницы") && !text.equals("Бумага")) {
                System.out.println("Некорректный ввод! Повторите попытку: ");
            } else {
                if ((text.equals("Бумага") && robotText[index].equals("Камень")) ||
                        (text.equals("Камень") && robotText[index].equals("Ножницы")) ||
                        (text.equals("Ножницы") && robotText[index].equals("Бумага"))) {
                    System.out.println("Компьютер: \n" + robotText[index]);
                    System.out.println("Вы победили");
                }
                if (text.equals(robotText[index])) {
                    System.out.println("Компьютер: \n" + robotText[index]);
                    System.out.println("Ничья");
                }
                if ((text.equals("Камень") && robotText[index].equals("Бумага")) ||
                        (text.equals("Ножницы") && robotText[index].equals("Камень")) ||
                        (text.equals("Бумага") && robotText[index].equals("Ножницы"))) {
                    System.out.println("Компьютер: \n" + robotText[index]);
                    System.out.println("Компьютер победил");
                }
            }
        }
    }
}
