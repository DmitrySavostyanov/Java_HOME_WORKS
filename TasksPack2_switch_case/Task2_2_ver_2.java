package HomeWork.TasksPack1.TasksPack2;

import java.util.Scanner;
 /*Задача №1 -версия 2
В переменной day лежит какое-то число из интервала от 1 до 31.
Определите в какую декаду месяца попадает это число (в первую, вторую или третью).
 */

public class Task2_2_ver_2 {

    public static void main(String[] args) {

        System.out.println("Введите число из интервала от 1 до 31: ");
        Scanner sc = new Scanner(System.in);
        byte day = sc.nextByte();

        if (day >= 1 && day <= 10) {
            System.out.print("Число лежит в первой декаде месяца");
        } else if (day >= 11 && day <= 20) {
            System.out.print("Число лежит во второй декаде месяца");
        } else if (day >= 21 && day <= 31) {
            System.out.print("Число лежит в третей декаде месяца");
        } else {
            System.out.println("Число не лежит в интервале от 1 до 31");
        }
    }
}