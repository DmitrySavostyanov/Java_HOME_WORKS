package Arrays_Two_Test_Random;

public class EvenNumElementsV2 {
    public static void main(String[] args) {
        int sumEvenElement = 0;
        int num[] = new int[10];
        //Заполнение массива
        for (int i = 1; i < 10; i++)
            num[i] = (int) (Math.random() * 100); // 0 - 1 ---> 0 - 100
        //Вывод массива
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.println("индекс = " + i + " (чётное значение = " + num[i] + ");");
                sumEvenElement++;

            }
        }
        System.out.println("количество индексов c чётным значением элемента: "+ sumEvenElement + " шт.");
    }
}
