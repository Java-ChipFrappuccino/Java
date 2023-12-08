package minigame;

import java.io.IOException;
import java.util.Scanner;

public class Pop {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String[] pop = new String[24];
        int myChoice;
        boolean onOff = true;

        for (int i = 0; i < pop.length; i++) {
            pop[i] = "⦿";
        }
        for (int i = 0; i < pop.length; i++) {
            System.out.print(pop[i]);
            if (i == 5) {
                System.out.println();
            }
            if (i == 11) {
                System.out.println();
            }
            if (i == 17) {
                System.out.println();
            }
        }

        System.out.println("\n\n아무키나 눌러주세요 >_ ...");

        while (onOff) {
            int count = 0;
            int random = (int) (Math.random() * 24);
            System.in.read();
            do {
                pop[random] = "❍";
                if (pop[random] == "❍") {
                    pop[random] = "❍";
                }

            } while (!(pop[random] == "❍"));

//            if (pop[random] == "❍") {
//                pop[random] = "❍";
//            }

            for (int i = 0; i < pop.length; i++) {
                if (pop[i] == "❍") {
                    count++;
                }
                if (count == 24) {
                    onOff = false;
                    break;
                }
            }

            for (int i = 0; i < pop.length; i++) {
                System.out.print(pop[i]);
                if (i == 5 || i == 11 || i == 17) {
                    System.out.println();
                }
            }
            System.out.println();
        }
        System.out.println("\n종료");
    }
}
