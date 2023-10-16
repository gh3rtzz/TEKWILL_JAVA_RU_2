package lecture_nr_13;

public class ThrowsAndThrow {

    public static void main(String[] args) throws Exception {
//        throwSomething();

        int day = 3;
        printDayOfTheWeek(day);
    }

    public static void throwSomething(){
        throw new ArithmeticException("This is a test throw of an Exception");
    }

    public static void printDayOfTheWeek(int day) throws Exception{
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> throw new Exception("Invalid day");
        }
    }

}
