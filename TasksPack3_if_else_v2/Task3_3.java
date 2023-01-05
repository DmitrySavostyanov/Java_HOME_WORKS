package HomeWork.TasksPack3;

import java.util.Scanner;

/*Напишите консольную программу, в которой пользователь вводит с клавиатуры число.
Если число одновременно меньше 9 и больше 2,
то программа выводит "Число больше 2 и меньше 9". Иначе программа выводит
сообщение "Неизвестное число".*/
public class Task3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = sc.nextInt();
        if (num > 2 && num < 9) {
            System.out.printf("Число больше 2 и меньше 9");
        } else {
            System.out.printf("неизвестное число");

        }

    }
}
