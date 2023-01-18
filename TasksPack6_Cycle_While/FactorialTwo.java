package TasksPack6;

public class FactorialTwo {

    public static void main(String[] args) {

        int resultFact = 1; // от единицы!!!!
        int num = 5; //  число  от котрого надо получить факториал
        for (int i = 1; i <= num; i++) {
            resultFact = resultFact * i;
        }
        System.out.println(resultFact);


        /*
        int factorial = 2;
        int numFact = 3;
        for (int i = 1; i <= numFact; i++){

            numFact = numFact * i;
            String str1 = Integer.toString(numFact);
            String str2 = Integer.toString(i);

            System.out.println(str1 + "!= " + str2);

*/
    }
}

