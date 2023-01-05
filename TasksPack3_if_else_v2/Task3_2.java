package HomeWork.TasksPack3;

/*Напишите консольную программу, в которой пользователь с клавиатуры вводит два числа.
А программа сранивает два введенных числа и выводит на консоль результат сравнения
(два числа равны, первое число больше второго или первое число меньше второго).*/

import java.util.Scanner;

public class Task3_2 {
    public static void main(String[] args) {
        System.out.println("Введите два числа: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " > " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " < " + num2);
        } else {
            System.out.println(num1 + "==" + num2);

        }

    }

}







