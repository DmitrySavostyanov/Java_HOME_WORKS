package Functions_V1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        /*
        1. Пишем: вводим числа  - a и b
        2. вводим  оператор +, -, * , /;
        3. Пишем функцию которая производит арифметические действия с числами
        4. Вывод реултата в консоль.
         */
        int sum = 0;
        int diff = 0;
        int div = 0;
        int proizv = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число a: ");
        int a = scanner.nextInt();
        System.out.println("Введите целое число b: ");
        int b = scanner.nextInt();
            System.out.println("Введите символ: *, /, -, + : ");
            char symbol = scanner.next().charAt(0);
            switch (symbol) {
                case '+':
                    sum = a + b;
                    System.out.println("a + b = " + sum);
                    break;
                case '-':
                    diff = a - b;
                    System.out.println("a - b = " + diff);
                    break;
                case '*':
                    proizv = a * b;
                    System.out.println("a * b = " + proizv);
                    break;
                case '/':
                    div = a / b;
                    System.out.println("a / b = " + div);
                    break;
            }

        }

    }


