package Arrays_Two_Test_Random;

public class MaxNumElementV2 {

    public static void main(String[] args) {
        int maxNumElement = 0;
        int num[] = new int[10];
        //Заполнение массива
        for (int i = 1; i < 10; i++)
            num[i] = (int) ((Math.random() * 2000) - 1000); // 0 - 1 ---> - 1000  до 1000
        //Вывод массива
        for (int i = 0; i < num.length; i++) {
            if(num[i] > maxNumElement){
                maxNumElement = num[i];
            }
        }
        System.out.println("макс. знач. элемента массива = " + maxNumElement);
    }
}

/*
num[i] = (int)((Math.random() * 2000) - 1000)  -----> (0 * 2000) - 1000  до (1 * 2000) - 1000 ---->  -1000 до 1000



 */