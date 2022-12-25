package HomeWork.TasksPack1;

import java.util.Scanner;

/* Принадлежит ли точка кругу с центром в начале координат
С клавиатуры задаются координаты точки, а также радиус круга,
центр которого находится в начале координат. Определить, принадлежит
ли данная точка кругу.
*/
public class Task3 {


    public static void main(String[] args) {
        System.out.println("Введите кординаты точки (a,b): ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Введите радиус окружности: r");
        int r = sc.nextInt();
        int hypotenuse = (int) Math.sqrt((a * a) + (b * b));
        if (hypotenuse <= r) {
            System.out.println("Точка принадлежит кругу");
        } else {
            System.out.println("Точка не принадлежит кругу");
        }

    }

}
