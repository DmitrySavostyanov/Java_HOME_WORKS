package Functions_V1;

import java.util.Scanner;

public class Calculator_V1 {

    public static int inputNum1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число a: ");
         int num1 = sc.nextInt();
        return num1;
    }
    public static int inputNum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число b: ");
        int num2 = sc.nextInt();
        return num2;
    }
    public static int inputSymbol(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите символ: *, /, -, + : ");
        char symbol = sc.next().charAt(0);
        return symbol;
    }

    public static void sum(int a, int b) {
        System.out.println(a + b);
    }
    public static void diff(int a, int b) {
        System.out.println(a - b);
    }
    public static void proizv(int a, int b) {
        System.out.println(a * b);
    }
    public static void div(int a, int b) {
        System.out.println(a / b);
    }

    public static void main(String[] args) {
        switch (inputSymbol()) {
            case '+': sum((inputNum1()), inputNum2());
                break;
            case '-': diff(inputNum1(),inputNum2());
                break;
            case '*': proizv(inputNum1(),inputNum2());
                break;
            case '/': div(inputNum1(),inputNum2());
                break;
        }

        
        /* sum((inputNum1()), inputNum2());
        diff(inputNum1(),inputNum2());
        proizv(inputNum1(),inputNum2());
        div(inputNum1(),inputNum2());

         */

    }

}

