package Arrays_Three_Test;

/*Разделить элементы массива на максимальный
Все элементы массива поделить на значение наибольшего элемента этого массива.
*/
public class DividingMaxValueElements {
    public static void main(String[] args) {
        double maxElementsNum = 0;
        double num[] = new double[10];

        for (int i = 0; i < 10; i++)
            num[i] = Math.random() * 100;

        for (int i = 0; i < num.length; i++) {
            //System.out.println((int)num[i]);
            if (num[i] > maxElementsNum) {
                maxElementsNum = num[i];
            }
            num[i] = (num[i] / maxElementsNum);
            double scale = Math.pow(10, 3);
            double result = Math.ceil(num[i] * scale) / scale;

            System.out.println("элем. массива/maxElementNum  = "  +  result);
        }
        System.out.println("--------------------------------------");
        double scale = Math.pow(10, 3);
        double result = Math.ceil(maxElementsNum * scale) / scale;
        System.out.println("макс. элемент массива  = " + (result));

    }
}
