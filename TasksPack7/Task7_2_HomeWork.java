package TasksPack7;

// 14145353 -> найти сумму четных позиций, произведение нечетных и пременожить эти 2 результата между собой.
public class Task7_2_HomeWork {

    public static void main(String[] args) {

        int a = 14145353;
        int a1 = a / 10000000; //1
        int a2 = a % 10000000 / 1000000; //4
        int a3 = a % 1000000 / 100000; //1
        int a4 = a % 100000 / 10000; //4
        int a5 = a % 10000 / 1000; //5
        int a6 = a % 1000 / 100; //3
        int a7 = a % 100 / 10; //5
        int a8 = a % 10; //3

        int sumRes1 = 0;
        int sumRes2 = 0;
        int sumRes = 0;
        for (int i = 1; i < 2; i++) {

            sumRes1 = sumRes1 + a2 + a4 + a6 + a8;
            sumRes2 = sumRes2 + (a1 * a3 * a5 * a7); // 1 * 1 * 5 * 5 = 25
            sumRes = sumRes1 * sumRes2;
            a1++;
        }
        System.out.println("Сумма четных позиций чисел = " + sumRes1);
        System.out.println("Произведение нечетных позиций чисел = " + sumRes2);
        System.out.println("Произведение сумм четных и нечетных позиций чисел = " + sumRes);
    }
}
