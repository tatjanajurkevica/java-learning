package lv.acodemy;

public class ExampleClass {
    public static void main(String[] args) {


        // Access modifier (public, private, protected, package-private)
        // Can return specific data type
        // void - if we do not return anything
        // Method name: should be unique, camelCase;
        // Parameters
        // return keyword if we return something


        // To create method
        // [access modifier] [other modifiers] [return type] methodName {
        // method body
        // return [value]

        // Create method that will print out Hello, World!
        sayHello();

        greet("Nikita");

        add((a:12, b:13));

    }

    public static void sayHello() {
        System.out.println("Hello, World!");
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }


    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }


}