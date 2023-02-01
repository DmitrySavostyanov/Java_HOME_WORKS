package Arrays_Test;

public class Test1 {
    public static void main(String[] args){
//Всего индексов - 0,1,2,3,4,5,6,7,8,9
// Выделяем четные индексы  - 0,2,4,6,8
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < num.length; i = i + 2) {

            System.out.println(num[i]);
        }
        System.out.println("^-------^-------^");
        System.out.print("Значение вложенное в индекс №2: " + num[2]);
    }
}
