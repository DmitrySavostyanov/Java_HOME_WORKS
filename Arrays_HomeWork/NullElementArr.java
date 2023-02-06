package Arrays_Two_Test;

/*
Чтобы было интереснее гененрируй массив случайных чисел
Найти количество нулевых элементов в массиве (нулевые = те что равно 0)
 */
public class NullElementArr {
    public static void main(String[] args) {
        int sumNullElement = 0;
        int num[] = {1, 2, 0, 4, 5, 6, 0, 8, 9, 10};
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0) {
                System.out.println("Индекс с нулеым значением = " + i + ";");
                sumNullElement++;

            }
        }
        System.out.println("Количество индексов c нулевым значением: "+ sumNullElement + " индекса.");
    }

}




