package HomeWork.TasksPack1.TasksPack2;

/*Задача №1
В переменной day лежит какое-то число из интервала от 1 до 31.
Определите в какую декаду месяца попадает это число (в первую, вторую или третью).
 */
//https://www.center-pss.ru/st/table/table-dekad.htm
import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {
        System.out.println("Введите число из интревала от 1 до 31: ");
        Scanner sc = new Scanner(System.in);
        byte day = sc.nextByte();

        switch (day) {
            case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
                System.out.print("Число лежит в первой декаде месяца");
                break;
            case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20:
                System.out.print("Число лежит во второй декаде месяца");
                break;
            case 21: case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29: case 30: case 31:
                System.out.print("Число лежит в третьей декаде месяца");
                break;
            default:
                System.out.println("Число не лежит в интервале от 1 до 31");

        }

    }

}



