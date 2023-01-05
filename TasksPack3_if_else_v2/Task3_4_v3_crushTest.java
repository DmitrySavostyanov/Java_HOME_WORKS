package HomeWork.TasksPack3;

import java.util.Scanner;

public class Task3_4_v3_crushTest {

    public static void main(String[] args) {
        System.out.println("Введите сумму вклада: ");
        Scanner sc = new Scanner(System.in);
        double depositAmount = sc.nextDouble();
        if (depositAmount > 6 && depositAmount < 100) {
            depositAmount += depositAmount * 0.05;
        }
        if (depositAmount >= 100 && depositAmount <= 200) {
            depositAmount += depositAmount * 0.07;
        } else {
            depositAmount += depositAmount * 0.1;
        }

        System.out.println("Сумма по вкладе после начисления процентов: " + depositAmount);
    }
}

// В чем разница с решением  3.5, где  перед if для интервала 101 до 199 есть else?
//
// Ответ:
// 1) Разница в том, что в данном решении программа игнорирует разделение
// на интервалы: 6 до 100 и 100 до 200 и выполняет условие из ветки с начисленеим + 7% в интервале от 6 до 200,
// 2) соответственно  для суммы счета более 200 работает ветка else.
// Что- то не так....
//
// Если более двух условий, то надо применять if, else if .... else if, else или
//if, else if .... else if

// Вопрос - когода целесообразно применить без else, те  if, else if .... else if?