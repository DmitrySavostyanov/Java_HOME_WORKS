package Arrays_Three_Test;

/*
Найти два максимальных элемента массива
В массиве чисел найти два максимальных элемента.
 */
public class TwoMaxElements {
    public static void main(String[] args) {
        int numMax1 = 0;
        int numMax2 = 0;
        int num[] = new int[10];
        //Pандомное заполнение массива;
        for (int i = 1; i < 10; i++)
            num[i] = (int) (Math.random() * 10);
        for (int i = 0; i < num.length; i++) {
           // num[i]++;
            System.out.println("index  = " + i + "; element = " + num[i] + ";");
            //Сперва выведем 1 мах элемент.
            if (num[i] > numMax1) {
                 numMax1 = num[i];
            }
            //потом 2 макс элемент.
            if(num[i] < numMax1 && num[i] > numMax2){
                numMax2 = num[i];

            }
        }
        System.out.println("Макс.1 = " + numMax1 + "; Макс.2 = " + numMax2);
    }

}

