package Arrays_Three_Test;

/*
Заменить элементы массива на противоположные
Дан массив, содержащий положительные и отрицательные числа. Заменить все элементы массива на противоположные по знаку.
Например, задан массив [1, -5, 0, 3, -4]. После преобразования должно получиться [-1, 5, 0, -3, 4].
 */
public class ReplacingElements {
    public static void main(String[] args) {
        int arr[] = {-5, -4, 6, 0, 9, -88};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * (-1);
            System.out.println("элемент = " + arr[i]);
        }
    }
}
