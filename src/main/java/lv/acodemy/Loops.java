package lv.acodemy;

public class Loops {
    public static void main(String[] args) {

        String[] shoppingList = {"Bread", "Milk", "Eggs", "Fruits"};
        for (int i = 0; i < shoppingList.length; i++) {
            System.out.println("Current product is " + shoppingList[i]);
        }
        System.out.println("Goes next!");

        // for each example

        for (String s : shoppingList) {
            System.out.println("Current product is " + s);
        }
        System.out.println("Goes next!");

        int i = 0;
        while(i < shoppingList.length) {
            System.out.println("Current product is " + shoppingList[i]);
            i++;
        }
        int j = 0;
        do {
            System.out.println("Current product is " + shoppingList[j]);
            j++;
        } while (j < shoppingList.length);

        boolean x = 1 < 5 && 6 > 3; //AND
        boolean y = 2 < 5 || 3>2; // OR
        System.out.println(x);
        System.out.println(y);



    }
}
