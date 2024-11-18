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

        // 1. Use a loop to calculate the sum of numbers from 1 to 20.

        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum += i;
        }
        System.out.println("The sum of numbers from 1 to 20 is: " + sum);

        //2. Write a program to print the multiplication table from 1 to 10.


            for(int i = 1; i <= 10; i++) {
                System.out.println(i);
            }

        // Loop through numbers 1 to 10
        for (int i = 1; i <= 10; i++) {
            // Loop through numbers 1 to 10 for each multiplication table
            for (int j = 1; j <= 10; j++) {
                // Print the multiplication result
                System.out.printf("%d * %d = %d%n", i, j, i * j);
            }
            // Print a blank line after each table for better readability
            System.out.println();
        }
        // 3. Print numbers in reverse order from 10 to 1.

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // 4. Print the following pattern using nested loops:

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 5. Use a loop to print the squares of numbers from 1 to 10.

        for (int i = 1; i <= 10; i++) {
            System.out.println("The square of " + i + " is: " + (i * i));
        }

        int sum1 = 0;
        for (int i = 1; i <= 10; i++) {
            sum1 += i;
            System.out.println("Cumulative sum at step " + i + " is: " + sum1);
        }
        // 7. Create an int array and use a loop to print each element.

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Meaning at index " + i + " is: " + numbers[i]);
        }
        // 8. Write a loop to count down from 100 to 0, decrementing by 5 each time.

        for (int i = 100; i >= 0; i -= 5) {
            System.out.println(i);
        }






    }

}
