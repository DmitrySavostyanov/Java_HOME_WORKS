package Arrays_Two_Test;
/*
Чтобы было интереснее гененрируй массив случайных чисел

Найти максимальный элемент в массиве отрицательных
 */
public class MaxNumElement {
    public static void main(String[] args) {
        int maxNumElement = -1000;
        int num[] = {-1,-44,-1000,-3,-9,-666,999,0};
        for (int i = 0; i < num.length; i++) {
            if(num[i] > maxNumElement){
                maxNumElement = num[i];
            }
        }
        System.out.println("макс. знач. элемента массива = " + maxNumElement);
    }

}
