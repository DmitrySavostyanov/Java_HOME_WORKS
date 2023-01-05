package HomeWork.TasksPack4;

public class Task4_3_v1 {
    public static void main(String[] args) {
        int a = 1;
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
        else {
            System.out.println("ErrorBranch: проверте значения переменных  а и b!!!");
        }
        System.out.println("mainBranch: блок if не работает, в ветку main пришли с отрицательным результатом из блока else!");
    }
}

/* 1. В рамках данной задачи если хотя бы одно из 2-х условий блока if работает, то в переменую sum идет
сумма значений а и b и блок функционирует!!!
   2. Если лог. выражение для блока if 1 и 2  в круглых скобках = false, то блок if не работает. В ветку main мы приходим с результатом из
   блока else

 */