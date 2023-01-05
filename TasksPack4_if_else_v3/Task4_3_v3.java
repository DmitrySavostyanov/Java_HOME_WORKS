package HomeWork.TasksPack4;

import java.util.Scanner;

public class Task4_3_v3 {

    public static void main(String[] args) {

        int d = 0;
        System.out.printf("Введите целое число: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 10) {
            System.out.println("Branch1: " + a);
        } else if (a >= 0 && a > 10) {
            System.out.println("Branch2: " + a);
        } else if (a <= 0) {
            System.out.println("Branch2: " + a);
        }
        System.out.println("mainBranch: " + d);
    }
}
