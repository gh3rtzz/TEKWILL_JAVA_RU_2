package lecture_nr_2;

public class HomeworkNr2 {

    public static void main(String[] args) {
        // Переменная с названием x которая сможет содержать в себе цифру 2
        int x = 3;
        int p = 2;
        // Переменная с названием y которая сможет содержать в себе символ Y
        char y = 'Y';
        char z = '1';
        char l = '2';
        // Переменная с названием i которая сможет содержать в себе 2.17
        float i = 2.17F;
        // Переменная с названием k которая сможет содержать в себе true
        boolean k = false;

        //Почему можно положить char в int
//        x = p;

        int sum = x + p; //6
        int subtraction = x - p; //0
        int product = x * p; //9
        int division = x / p; //0
        int modus = x % p; //2 делим столбиком)

        float divison2 = (float) x / p;

        p = p + 2;
        p += 2;

        System.out.println(sum);
        System.out.println(subtraction);
        System.out.println(product);
        System.out.println(division);
        System.out.println(modus);

        System.out.println(divison2);

        int p1 = 3;
        int p2 = 5;
        int p3 = 7;

        // Переменная sum2 которая будет содержать в себе p1 + p2 * p3

        int sum2 = p1 + p2 * p3;

        int sum3 = (p1 + p2) * p3;

        System.out.println(sum2);
        System.out.println(sum3);

        char example1 = 10000;

        System.out.println(example1);
    }
}
