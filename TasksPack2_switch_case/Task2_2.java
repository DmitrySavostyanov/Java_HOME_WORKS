package HomeWork.TasksPack1.TasksPack2;

import java.util.Scanner;

/* В переменной month лежит какое-то число из интервала от 1 до 12.
Определите в какую пору года попадает этот месяц (зима, лето, весна, осень).
 */
public class Task2_2 {

    public static void main(String[] args) {
        System.out.println("Введите номер месяца от 1 до 12: ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch (month){
            case 1: case 2: case 12:
                System.out.println("This is Winter!");
                break;
            case 3: case 4: case 5:
                System.out.println("This is Spring!");
                break;
            case 6: case 7: case 8:
                System.out.println("This is Summer!");
                break;
            case 9: case 10: case 11:
                System.out.println("This is Autumn!");
                break;
            default:
                System.out.println("The value is outside the range from 1 to 12");
        }
    }
}
