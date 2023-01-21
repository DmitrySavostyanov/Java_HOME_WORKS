package TasksPack7;

import java.util.Scanner;

public class Task7_2_HomeWorkV2 {

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sumRes = 0;
        while (num > 0) {
            int num1 = num % 10; //Последняя цифра любого числа. Сохраняем остаток от деления на 10
            num = num / 10; //Сохраняем целую часть от деления на 10
            sumRes = sumRes + num1;
        }
        System.out.println("Сумма цифр числа = " + sumRes);

    }
}

