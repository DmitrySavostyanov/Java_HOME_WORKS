package HomeWork.TasksPack3;

import java.util.Scanner;

/* В банке в зависимости от суммы вклада начисляемый процент по вкладу может отличаться.
Напишите консольную программу, в которую пользователь вводит сумму вклада.
Если сумма вклада до 100, то начисляется 5%. Если сумма вклада от 100 до 200, то начисляется 7%.
Если сумма вклада больше 200, то начисляется 10%.
В конце программа должна выводить сумму вклада с начисленными процентами.
 */

/*
1. В данном варианте задачи нет ограничения по дипапазону. Те под расчеты попадают все значения в рамках интервала типа double
. Те в главную ветку main мы придем с результатом.
выполняется метод вывода в консоль который показывает что сумма вклада осталась без изменеий.

2. Если какое либо из условий в ветках условной конструкции выполнено, то в главной ветке main мы видим реультат
выполнения кода ответвления условия в виде начисления опредеооного процента на сумму вклада.
 */
public class Task3_4_v2 {

    public static void main(String[] args) {
        System.out.println("Введите сумму вклада: ");
        Scanner sc = new Scanner(System.in);
        double depositAmount = sc.nextDouble();
        if (depositAmount > 0 && depositAmount < 100) {
            depositAmount += depositAmount * 0.05;
        } else if (depositAmount >= 100 && depositAmount <= 200) {
            depositAmount += depositAmount * 0.07;
        } else {
            depositAmount += depositAmount * 0.1;
        }

        System.out.println("Сумма по вкладе после начисления процентов: " + depositAmount);
    }
}

