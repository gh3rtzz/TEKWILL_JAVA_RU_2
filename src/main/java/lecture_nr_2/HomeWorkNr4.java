package lecture_nr_2;

public class HomeWorkNr4 {

    public static void main(String[] args) {
        int number = 3;

        int result = multiplyByItself(number);

        System.out.println(result);
        multiply(number);

        bark();

        System.out.println(sumTwoNumbers(3, 5));
        System.out.println(sumTwoNumbers(multiplyByItself(number), 7));
    }

    //input: 2 int return: sum

    public static int sumTwoNumbers(int x1, int x2){
        return x1+x2;
    }

    public static int multiplyByItself(int x){
        return x * x;
    }

    public static void multiply(int x){
        if(x == 5)
            return;
        System.out.println(x * x);
    }

    public static void bark(){
        System.out.println("Dog is barking!");
    }
}
