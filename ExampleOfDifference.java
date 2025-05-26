package ExampleDifference;

import java.util.ArrayList;

public class ExampleOfDifference {
	public static void main(String[] args) {

        // I will be using an Array
        // Arrays are fixed in size and hold values of the same type
        int[] ArrayNumber = new int[3];  // Creating an array of 3 integers
        ArrayNumber[0] = 10;
        ArrayNumber[1] = 20;
        ArrayNumber[2] = 30;

        System.out.println("Array Elements:");
        for (int i = 0; i <  ArrayNumber.length; i++) {
            System.out.println( ArrayNumber[i]);
        }

        // I can't add more elements once the array is full, numberArray[3] = 40; so this will cause an error


        // I will be using an ArrayList, ArrayLists are dynamic which deduce or grow
        ArrayList<Integer> ListOfNumber = new ArrayList<>(); // Integer with capital "I" is the object type

        ListOfNumber .add(10);
        ListOfNumber .add(20);
        ListOfNumber .add(30);
        ListOfNumber .add(40); 
        // I can keep adding elements

        System.out.println("\nArrayList Elements : ");
        for (int i = 0; i < ListOfNumber .size(); i++) {
            System.out.println(ListOfNumber.get(i));
        }

        // I can also remove elements easier
        ListOfNumber.remove(1); //This Removes the second element of (index 1)

        System.out.println("\nArrayList after removing one element : ");
        for (int num : ListOfNumber) {
            System.out.println(num);
        }

    }
}


