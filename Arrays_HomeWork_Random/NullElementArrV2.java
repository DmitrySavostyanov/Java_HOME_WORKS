package Arrays_Two_Test_Random;

public class NullElementArrV2 {
    public static void main(String[] args) {
        int sumNullElement = 0;
        int num[] = new int[10];
        //Заполнение массива
        for (int i = 1; i < 10; i++)
            num[i] = (int) (Math.random() * 100); // 0 - 1 ---> 0 - 100
        //Вывод массива
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0) {
                System.out.println("Индекс с нулеым значением = " + i + ";");
                sumNullElement++;

            }
        }
        System.out.println("Количество индексов c нулевым значением: "+ sumNullElement + " индекс.");
    }
}
