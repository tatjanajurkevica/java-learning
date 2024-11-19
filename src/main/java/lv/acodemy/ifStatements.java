package lv.acodemy;

public class ifStatements {
    public static void main(String[] args) {

        // Even or Odd (if-else)
        int number = 7;
        if(number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd");
        }

        // check if number is positive or negative (assume 0 is positive)

        number = 3;
        if (number >= 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative");
        }

        // Grade checker (if-else-if)
        // 90> = A
        // 75 -> 89 = B
        // 50 -> 74 = C
        // <50 = F

        // 1) create score variable
        // 2) create logic if(score >= 90) -> A
        // else-if(score >= 75) -> B
        // else-if(score >= 50) -> C
        // else -> F

        int score = 68;
                if (score >= 90) {
                    System.out.println("Grade A");
                } else if (score >= 75) {
                    System.out.println("Grade B");
                } else if (score >= 50) {
                    System.out.println("Grade C");
                } else {
                    System.out.println("Grade F");
                }

                // task 1: check if person is eligible to buy alcohol

        int age = 18;
                if (age >= 18) {
                    System.out.println("Eligible to buy alcohol");
                } else if (age <18) {
                    System.out.println("Not eligible to but alcohol");
                }

                // task 2: check if a number can be divided by 5;

        number = 10;
                if(number % 5 == 0) {
                    System.out.println("Number can be divided by 5");
                }

                // Task 3: check pass or fail
                // if score >= 50 (passed)
                // all other cases (failed)
        score = 30;
                if(score >= 50) {
                    System.out.println("You passed");
                } else {
                    System.out.println("You failed");
                }

                // Temperature message
                // Above 30 (It's hot)
                // Temperature between 15 and 30 (Nice weather)
                // Below 15 (It's cold)

        int temperature = 25;
                if(temperature >30) {
                    System.out.println("It's hot");
                } else if(temperature >= 15){
                    System.out.println("Nice weather");
                } else {
                    System.out.println("It's cold");
                }

                // Traffic light system
                // Green -> Go
                // Yellow -> Slow down
                // Red -> Stop
                // String color;
                // if(colour.equals("Green")) { }

                String color = "green";

                if(color.equals("green")) {
                    System.out.println("Go!");
                } else if (color.equals("yellow")) {
                    System.out.println("Slow-down!");
                } else if (color.equals("red")) {
                    System.out.println("Stop!");
                } else {
                        System.out.println("Unknown color");
                    }




    }
}
