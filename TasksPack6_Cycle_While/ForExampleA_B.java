package TasksPack6;

//Сумма чисел от А до В
public class ForExampleA_B {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int res = 0;
        for (int i = a; i <= b; i++) {
            res = res + i;
        }
        System.out.println(res);
    }
}

// 3 + 4