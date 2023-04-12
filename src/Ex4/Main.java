package Ex4;

import java.awt.*;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] mas = new int[10];
        Set<Integer> uniqueNumbers = new HashSet<>();

        for(int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(10);
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < mas.length; i++) {
            boolean isUnique = false;
            for(int j = 0; j < mas.length; j++) {
                if(i != j && mas[i] == mas[j]) {
                    isUnique = true;
                    break;
                }
            }
            if(!isUnique) {
                uniqueNumbers.add(mas[i]);
            }
        }


        System.out.println("Уникальные числа: ");
        for(int i : uniqueNumbers) {
            System.out.print(i + " ");
        }
    }
}
