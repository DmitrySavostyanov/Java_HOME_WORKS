package HomeWork.TasksPack1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите длины сторон треугольника: a,b,c (см):");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a<b+c&&b<c+a&&c<a+b) {
            System.out.println("треугольник существует");
        }else{
            System.out.println("треугольник не существует");

        }
    }

}
