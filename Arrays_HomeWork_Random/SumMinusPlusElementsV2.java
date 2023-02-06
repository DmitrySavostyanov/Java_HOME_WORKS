package Arrays_Two_Test_Random;

public class SumMinusPlusElementsV2 {
    public static void main(String[] args) {
        int sumMinusNum = 0;
        int sumPlusNum = 0;
        int totalSum = 0;
        int num[] = new int[10];
        //Заполнение массива
        for (int i = 1; i < 10; i++)
            num[i] = ((int) (Math.random() * 10) - 5);
/* Декомпозиция метода
num[i] = ((int) (Math.random() * 10) - 5);
 0 - 1 ---> [(0 * 10 = 0) - (1 * 10 = 10)] - 5 = [Java выбирает числа в диапазоне от -5 до 5]
 */
        //Вывод массива
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

