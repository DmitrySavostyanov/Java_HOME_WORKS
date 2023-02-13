package Arrays_Three_Test;

/*Найти разность между максимальным и минимальным элементами массива
В одномерном массиве найти минимальный и максимальный элементы. Вычислить их разность.
Например, дан массив [3, 5, 9, 4, 2, 6]. Максимальным числом является 9, минимальным является 2. Разность составляет 9-2=7.
 */
public class MaxMinElements {
    public static void main(String[] args) {
        int numMax = 0;
        int numMin = 0;
        int sum;
        int num[] = new int[10];
        for (int i = 1; i < 10; i++)
            num[i] = (int) ((Math.random() * 20) - 10);// от -10 до 10

        for (int i = 0; i < num.length; i++) {
            if (num[i] > numMax) {
                numMax = num[i];
            }
            if (num[i] < numMin) {
                numMin = num[i];
            }
            System.out.println("индекс = " + i + "; элемент = " + num[i]);
        }
        sum = numMax + numMin;
        System.out.println("-------------------------------------------");
        System.out.println("NumMax = " + numMax + " NumMin = " + numMin);
        System.out.println("-------------------------------------------");
        System.out.println("NumMax + NumMin = " + sum);
    }

}
