package HomeWork.TasksPack3;

import java.util.Scanner;

/*Найти максимальное число из трех
Определить какое из трех введенных пользователем чисел максимальное и вывести его на экран.*/

/* Декомпозиция логики:
1. Ввели три числа:
num1 = 2;
num2 = 3;
num3 = 5;

(if) ---> Если 2 < 3  и 3 < 5  == истина, то ответ num3
2 < 3 - истина;
3 < 5 - истина;
Ответ --- истина и отрабатывает ветка if    --- > ответ: макс из трех чисел == num3.

Для себя проверим остальные ветки!!!

(If-else)---> Если 2 < 3  и 3 > 5  == истина, то ответ num2
2 < 3 - истина;
3 < 5 - ложь;
Ответ --- ложь и  ветка if else не выполняется

(If-else)---> Если 2 < 3  и 3 > 5  == истина, то ответ num2
2 > 3 - ложь;
5 < 2 - ложь;
Ответ --- ложь и ветка if else не выполняется.

1. Ввели три числа:
num1 = 5;
num2 = 2;
num3 = 3;

(if) ---> Если 5 < 2  и 2 < 3  == истина, то ответ num3
5 < 2 - ложь;
2 < 3 - истина;
Ответ --- ложь ветка if не работает.
(If-else) для num1 ---> Если 5 > 2  и 3 > 5  == истина, то ответ num1
5 > 2 - истина;
3 < 5 - истина;
Ответ --- истина и ветка if else с  условием для num1 выполняется. Ответ: maxNum == num1


*/
public class Task3_1 {
    public static void main(String[] args) {
        System.out.println("Введите три целых числа: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 < num2 && num2 < num3) {
            System.out.println("maxNum = " + num3);
        } else if (num1 < num2 && num2 > num3) {
            System.out.printf("maxNum = " + num2);
        } else if (num1 > num2 && num3 < num1) {
            System.out.printf("maxNum = " + num1);
        }
    }
}


