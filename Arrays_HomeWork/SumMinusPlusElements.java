package Arrays_Two_Test;

/*Найти суммы отрицательных и положительных элементов.
Сложить 2 суммы(С учетом того что по итогу сумма отрицательных должна быть положительным числом)
 */
public class SumMinusPlusElements {
    public static void main(String[] args) {
        int sumMinusNum = 0;
        int sumPlusNum = 0;
        int totalSum = 0;
        int num[] = {1, -1000, 777, 0, 4, -500};
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 0) {
                sumPlusNum = sumPlusNum + num[i];
            }
            if (num[i] < 0) {
                sumMinusNum = sumMinusNum + num[i];
            }
            totalSum = sumPlusNum + sumMinusNum;
        }
        System.out.println("Сумма положительных элементов = " + sumPlusNum);
        System.out.println("Сумма отрицательных элементов = " + sumMinusNum);
        System.out.println("Сумма положит. и отрицат. элементов = " + Math.abs(totalSum));
        // В Java Math.abs() возвращает абсолютное значение аргумента (модуль числа).
    }
}
