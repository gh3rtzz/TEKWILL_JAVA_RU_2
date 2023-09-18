package lecture_nr_6.polymorphism;

public class ArrayPrinter {

    public static void main(String[] args) {
        ArrayPrinter ap = new ArrayPrinter();

        int[] intArray = new int[] {1, 2, 3};
        String[] stringArray = new String[] {"test", "anotherTest", "123"};

        ap.printArray(intArray);
        ap.printArray(stringArray);
    }

    public void printArray(int[] intArray){
        for(int i = 0; i != intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    public void printArray(String[] stringArray){
        for(int i = 0; i != stringArray.length; i++){
            System.out.println(stringArray[i]);
        }
    }
}
