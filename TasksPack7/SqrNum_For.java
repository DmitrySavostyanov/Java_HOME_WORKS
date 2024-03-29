package TasksPack7;

import java.util.Scanner;

/*
Придумал, с клавиатуры поступает число. Пока не будет найден его квадрат, искать это число.
        Пример: 121
        1^2=2
        2^2=4
        …
        11^2=121
        Нужное число: 11

        Квадрат числа — результат умножения числа на себя;

Изучая входные данные находим все закономерности
1. Закономерность №1  -  левый ряд - числа от 1 до введенного

 */
public class SqrNum_For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = sc.nextInt();
        System.out.println(num);
        int result = 0;//число которое ищет программа
        int sqrNum = 0;//количество квадратов
        for (int i = 1; i <= num; i++) {
            if (i * i > num) {
                break;
            }
            result = i * i;
            sqrNum++;
            System.out.println(i + "^2 = " + result);
        }
        System.out.println(sqrNum + "^2" +  " (квадрат числа) = " + result + " (результат)");
        System.out.println("количество квадратов  = " + sqrNum); // вывод количества квадратов
    }

}
