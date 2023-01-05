package HomeWork.TasksPack4;

public class Task4_3 {
    public static void main(String[] args) {
            int a = 10;
            int b = 50;
            int sum;
            if (a == 10) {
                System.out.println("Branch1 (a) = " + a);
                if (b == 100) {
                    System.out.println("Branch2 (b) = " + b);
                }
                sum = a + b;
                System.out.println("Branch (sum) = " + sum);
            }
            System.out.println("mainBranch: блок if не работает!");
        }
    }

/* 1. В рамках данной задачи если хотя бы одно из 2-х условий блока if работает, то в переменую sum идет
сумма значений а и b и блок функционирует!!!
   2. Если лог. выражение для блока if 1 и 2  в круглых скобках = false, то блок if не работает.

 */
