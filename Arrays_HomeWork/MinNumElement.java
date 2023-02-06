package Arrays_Two_Test;
//Найти минимальный элемент в массиве отрицательных
public class MinNumElement {
    public static void main(String[] args) {
        int minNumElement = 1000;
        int num[] = {-1, -44, -3, 9, -888, 0, -666, 1000};
        for (int i = 0; i < num.length; i++) {
            if(num[i] < minNumElement){
                minNumElement = num[i];
            }
        }
        System.out.println("мин. знач. элемента массива = " + minNumElement);
    }

}
