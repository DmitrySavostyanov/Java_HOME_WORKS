package HomeWork.TasksPack4;
/* Найти среднее число из трех
Среди трех чисел найти среднее. Если среди чисел есть равные, вывести сообщение "Ошибка" */

import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {

        System.out.println("Введите три целых числа!");

        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int num1 = sc.nextInt();
        System.out.printf("Введите второе число: ");
        int num2 = sc.nextInt();
        System.out.printf("Введите третье число: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num3 < num1) {// те num1 это верхняя граница, а num3 это нижняя. num2 - ср. знач.
            System.out.printf("Ср.знач: " + num2); // 3,2,1: 3 > 2; 1 < 3 - истина - ср. зн. = 2
        } else if (num1 < num2 && num2 > num3) {
            System.out.printf("Ср.знач: " + num3); // 2,4,3: 2 < 4; 4 > 3 - истина - ср. зн. = 3
        } else if (num1 > num2 && num2 < num3) {
            System.out.printf("Ср. знач: " + num1);// 2,1,3: 2 > 1; 1 < 3 - истина - ср. зн. = 1
        }else {
            System.out.printf("Ошибка!!!");
        }

    }

}
