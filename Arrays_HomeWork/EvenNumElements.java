package Arrays_Two_Test;

public class EvenNumElements {
    public static void main(String[] args) {
        int sumEvenElement = 0;
        int num[] = {1, 2, 0, 4, 5, 6, 0, 8, 9, 10};//1 (знач. = 2) , 2, 3, 5, 6, 7, 9
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.println("индекс = " + i + " (чётное значение = " + num[i] + ");");
                sumEvenElement++;

            }
        }
        System.out.println("количество индексов c чётным значением элемента: "+ sumEvenElement + " шт.");
    }

 }

