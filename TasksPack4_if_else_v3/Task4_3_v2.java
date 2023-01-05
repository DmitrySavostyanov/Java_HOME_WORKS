package HomeWork.TasksPack4;

import java.util.Scanner;

public class Task4_3_v2 {

    public static void main(String[] args) {

        int d = 0;
        System.out.printf("Введите целое число: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 10) {
            System.out.println("Branch1: " + a);
        } else if (a > 10 && a < 20) {
            System.out.printf("Branch2: " + a);
        } else {
            System.out.println("Branch3: " + a);

        }
        System.out.println("mainBranch: " + d);
    }
 }

