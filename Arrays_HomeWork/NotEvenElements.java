package Arrays_Two_Test;

public class NotEvenElements {
    public static void main(String[] args) {
        int sumNotEvenElement = 0;
        int num[] = {1, 2, 0, 4, 5, 6, 0, 8, 9, 10};//1 (знач. = 2) , 2, 3, 5, 6, 7, 9
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                System.out.println("индекс = " + i + " (нечётное значение = " + num[i] + ");");
                sumNotEvenElement++;

            }
        }
        System.out.println("количество индексов c нечётным значением элемента: "+ sumNotEvenElement + " шт.");
    }
}
