package Arrays_Test;

public class Test3 {

    public static void main(String[] args) {
        int num[] = {33, 2, 3};
        int arrIndexSum = 0;
        int arrSum = 0;
        int avgArrSum;
        for (int i = 0; i < num.length;i++) {
            arrIndexSum += i; // arrIndexSum = arrIndexSum + i;
            arrSum  = arrSum + num[i];// концепция суммы

            System.out.println("значение в индексе: " + num[i]);

        }
        avgArrSum = arrSum/arrIndexSum;

        System.out.println("^-------^-------^");
        System.out.println("Сумма номеров индексов в массиве: " + arrIndexSum); // 0 + 1 + 2 = 3
        System.out.println("^-------^-------^");
        System.out.println("Сумма всех значений в массиве: " + arrSum); // 33 + 2 + 3 = 38
        System.out.println("^-------^-------^");
        System.out.println("Сумма всех значений в массиве: " + arrSum); // 33 + 2 + 3 = 38
        System.out.println("^-------^-------^");
        System.out.print("Ср.значение значений массива: " + avgArrSum); //12
    }
}
