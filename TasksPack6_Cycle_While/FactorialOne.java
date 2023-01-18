package TasksPack6;

public class FactorialOne {
    public static void main(String[] args) {

        int resultFact = 1; // от единицы!!!!
        int num = 0; //  число  от котрого надо получить факториал
        for (int i = 1; i <= num; i++) {
            resultFact = resultFact * i;
        }
        System.out.println(resultFact);

        }
    }

// Факториал числа n — это значение произведения (умножения) всех натуральных чисел от 1 до n, которое обозначается как n!
// Есть значение
// количество повторений
//5!   == 1 *2 *3 * 4 * 5
// Как это произошло   ---
//1 ит:  1
//2 ит: 1*2 = 2
//3 ит: 2*3 = 6
//4 ит: 6*4 = 24
//5 ит: 24 * 5 = 120
