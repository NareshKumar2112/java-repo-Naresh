package Day1;

import java.util.Scanner;

public class PatternPrinting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        char key = scanner.next().charAt(0);

        //diamond space pattern
        for (int i = 1; i <= num - 1; i++) {
            if (i == 1) {
                for (int j = 1; j < num * 2; j++) {
                    System.out.print(key);
                }
            } else {
                for (int j = 0; j < num - i + 1; j++) {
                    System.out.print(key);
                }
                for (int j = 0; j < ((i - 1) * 2) - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < num - i + 1; j++) {
                    System.out.print(key);
                }
            }
            System.out.println();
        }
        for (int i = num; i >= 1; i--) {
            if (i == 1) {
                for (int j = 1; j < num * 2; j++) {
                    System.out.print(key);
                }
            } else {
                for (int j = 0; j < num - i + 1; j++) {
                    System.out.print(key);
                }
                for (int j = 0; j < ((i - 1) * 2) - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < num - i + 1; j++) {
                    System.out.print(key);
                }
            }
            System.out.println();
        }

        // A pattern
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            System.out.print(key);
            if (num % 2 == 0&&i == num / 2) {
                for (int j = 1; j < num; j++) {
                    if(j%2==1){
                        System.out.print(" ");
                    } else {
                        System.out.print(key);
                    }
                }
            } else if (num % 2 == 1&&i == num / 2 ) {
                for (int j = 1; j < num-1; j++) {
                    if(j%2==1){
                        System.out.print(" ");
                    } else {
                        System.out.print(key);
                    }
                }
            } else {
                for (int j = 0; j < i * 2; j++) {
                    System.out.print(" ");
                }
            }
            if (i != 0) {
                System.out.print(key);
            }
            System.out.println();
        }
        scanner.close();
    }
}
