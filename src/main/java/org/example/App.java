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
        switch (score/10) {
            case 10:
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            default:
                return "F";
        }
    }
}
