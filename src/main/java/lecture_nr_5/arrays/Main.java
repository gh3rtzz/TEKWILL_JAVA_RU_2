package lecture_nr_5.arrays;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[4];

        names[0] = "Carl";
        names[1] = "Maxim";
        names[2] = "Dima";
        names[3] = "Artiom";

        for(int index = 0; index != names.length; index++){
            System.out.println(names[index]);
        }

        int[] numbers = new int[10];

        for(int index = 0; index < numbers.length; index++){
            numbers[index] = index;
        }

        //Print only even numbers from the array

        System.out.println("Printing only even numbers:");
        for(int index = 0; index != numbers.length; index++){
            if(numbers[index] % 2 == 0)
                System.out.println(numbers[index]);
        }

        //Print the sum of all elements in the array

        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }

        System.out.println("The sum of all elements in the array is: " + sum);

        int[][] biArray = new int[2][2];

        biArray[0][0] = 1;
        biArray[0][1] = 2;
        biArray[1][0] = 3;
        biArray[1][1] = 4;

        System.out.println(biArray[1][0]);
        System.out.println(biArray[1][1]);

        //Print all numbers from array

        System.out.println(biArray.length); // Returns number of lines
        System.out.println(biArray[0].length);

        System.out.println("-----------------");
        for(int line = 0; line != biArray.length; line++){
            for(int column = 0; column != biArray[line].length; column++){
                System.out.println(biArray[line][column]);
            }
        }

        int[][] biArray2 = new int[][]{
                {0, 1, 2, 3},
                {4, 5},
                {6}
        };

        System.out.println("----------------");
        for(int line = 0; line != biArray2.length; line++){
            for(int column = 0; column != biArray2[line].length; column++){
                System.out.println(biArray2[line][column]);
            }
        }

        //Print out the sum of all elements from biArray2

        System.out.println("---------------");

        int sum2 = 0;

        for(int line = 0; line != biArray2.length; line++){
            for(int column = 0; column != biArray2[line].length; column++){
                sum2 += biArray2[line][column];
            }
        }

        System.out.println("The sum of biArray2 is: " + sum2);


    }
}
