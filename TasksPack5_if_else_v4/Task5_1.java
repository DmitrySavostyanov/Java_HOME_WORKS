package HomeWork.TaskPack5;

public class Task5_1 {
    public static void main(String[] args) {

        int num1 = 40;
        int num2 = 1;
      /* Для лучшего понимания и наглядности применяем метод println в рамках каждого блока
         За скобками условной конструкции выводим результат без привязки к конкретной ветки. Те просто num = .

      */
        if (num1 == 10) {
            num2 = num2 + 50;
            System.out.println("if Branch (num2) = " + num2);

        } else if (num1 == 20) {
            num2 = num2 + 100;
            System.out.println("else-if Branch (num2) = " + num2);

        } else {
            num2 = num2 * 0;
            System.out.println("else Branch (num2) = " + num2);

        }
        System.out.println("Continue main Branch");
        System.out.println("num2 = " + num2); // ответ в зависимости от выполненго блока.
    }
}
