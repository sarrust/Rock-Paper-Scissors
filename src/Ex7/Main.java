package Ex7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstText = in.nextLine();
        String secondText = in.nextLine();
        String[] fT = firstText.split(" ");
        String[] sT = secondText.split(" ");
        String text1 = null;
        String text2 = null;

        for(int i = 0; i < fT.length; i++) {
            int max1 = fT[0].length();
            if(fT[i].length() > max1) {
                max1 = fT[i].length();
                text1 = fT[i];
            }
        }

        for(int i = 0; i < sT.length; i++) {
            int max2 = sT[0].length();
            if(sT[i].length() > max2) {
                max2 = sT[i].length();
                text2 = sT[i];
            }
        }

        if(text1.length() > text2.length()) {
            System.out.println("Самая большая общая подстрока: " + text1);
        } else {
            System.out.println("Самая большая общая подстрока: " + text2);
        }
    }
}
