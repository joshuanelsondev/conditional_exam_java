package org.example;

/**
 * Hello world!
 *
 */
public class App {
    

    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        System.out.println(checkNumber(10)); // Positive
        System.out.println(checkNumber(-5)); // Negative
        System.out.println(checkNumber(0));  // Zero

        System.out.println(checkAge(20)); // Adult
        System.out.println(checkAge(16)); // Minor
        System.out.println(checkAge(18)); // Adult

        System.out.println(getGrades(95)); // A
        System.out.println(getGrades(82)); // B
        System.out.println(getGrades(45)); // F
    }

    public static String checkNumber(int num) {
        if (num > 0) {
            return "Positive";
        } else if (num < 0) {
           return "Negative";
        } else {
            return "Zero";
        }
    }

    public static String checkAge(int age) {
        return age >= 18 ? "Adult" : "Minor";
    }

    public static String getGrades(int score) {
        switch (score) {
            case 100:
            case 95:
                return "A";
            case 85:
                return "B";
            case 72:
                return "C";
            case 65:
                return "D";
            default:
                return "F";
        }
    }
}
