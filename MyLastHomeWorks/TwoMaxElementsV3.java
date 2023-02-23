package Arrays_Three_Test;

/* Алгоритм:
за первый проход цикла находим первое максимальное число
запонминаем его индекс, не значение а именно индекс
вторым проходом так же ищем максимальное, но в условие еще добавляем проверку
что индекс элемента не должен быть равен индексу что нашли,

 попробуй вникнуть и это закодить
*/
public class TwoMaxElementsV3 {
    public static void main(String[] args) {
        int numMax1 = 0;
        int numMax2 = 0;
        int indMax1 = 0;
        int indMax2 = 0;
        int num[] = new int[10];

        //Pандомное заполнение массива;
        for (int i = 0; i < num.length; i++)
            num[i] = (int) (Math.random() * 10);

        //int num[] = {2, 100, 34, 6, 9094, 5, 7, 44, 1001};

        for (int i = 0; i < num.length; i++) {
            System.out.println("index  = " + i + "; element = " + num[i] + ";");

            if (num[i] > num[indMax1]) {
                indMax1 = i;
                numMax1 = num[indMax1];

            }

            if (num[i] < num[indMax1] && num[i] > num[indMax2] && indMax2 != indMax1) {
                indMax2 = i;
                numMax2 = num[indMax2];

            }
        }
        System.out.println("Макс.1 = " + numMax1 + "; Макс.2 = " + numMax2 + "; индекс Мах1 = " + indMax1 + "; индекс Мах2 = " + indMax2);
    }

}
