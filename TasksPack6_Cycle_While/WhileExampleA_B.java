package TasksPack6;

public class WhileExampleA_B {
    public static void main(String[] args) {

        int a = 1;
        int b = 5; //определяет кол-во итераций
        int resSum = 0;
        int count = 0;
        while (a <= b) {
            if (count >= b) {
                break;
            }
            count = count + 1;
            //resSum  = resSum + count;
            resSum  = resSum + count;
            System.out.println("Итерация №: " + count);
        }

        System.out.println("Сумма чисел от A до B = " + resSum);
    }
}

// 1 + 2 + 3 = 6