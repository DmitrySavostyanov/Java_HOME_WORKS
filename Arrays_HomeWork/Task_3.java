package Arrays_Two_Test;

public class Task_3 {
    public static void main(String[] args) {
        int quantityIndex = 0;
        int sumElements = 0;
        int num[] = {-1, -44, -3, 9, 0};
        for (int i = 0; i < num.length; i++) {
            System.out.println("индекс = " + i + "; элемент = " + num[i]);
            quantityIndex = i + 1;
            sumElements = sumElements + num[i];
        }
        System.out.println("_____________________________");
        System.out.println("количество индексов в массиве =  "+ quantityIndex + " шт.");//0,1,2,3,4 --- > 5 шт.
        System.out.println("сумма элементов массива = "+ sumElements);
    }

}
