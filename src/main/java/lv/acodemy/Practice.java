package lv.acodemy;

public class Practice {
    public static void main(String[] args) {

        //cheating option

        String[] numberList = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        for (int i = 0; i < numberList.length; i++) {
            System.out.println("Current number is " + numberList[i]);
        }
        System.out.println("Goes next!");

        // correct option

        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Using  for loop print all even numbers from 2 to 20.

        for(int i = 2; i <= 20 ; i+= 2) {
            System.out.println(i);
        }
        for(int i = 2; i <= 20 ; i= i + 2) {
            System.out.println(i);
        }

        // Use for loop to print the multiplication table of 5 up to 5 * 10.

        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + i * 5);
        }





    }

}
