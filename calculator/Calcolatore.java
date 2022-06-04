package calculator;

import java.util.Scanner;

public class Calcolatore
{

    public static void inizia()
    {
        System.out.println("Welcome!");
        System.out.println("\n");

        Scanner scanner = new Scanner(System.in);
        scanner.close();

        System.out.println("Input the first number: ");
        double number_1 = scanner.nextDouble();
        
        System.out.println("Input the operator: ");
        String operator = scanner.next();

        System.out.println("Input the second number: ");
        double number_2 = scanner.nextDouble();

//        if (operator.equals("+")) System.out.println(number_1 + number_2);
//        if (operator.equals("-")) System.out.println(number_1 - number_2);
//        if (operator.equals("*")) System.out.println(number_1 * number_2);
//        if (operator.equals("/")) System.out.println(number_1 / number_2);
        switch (operator)
        {
            case "+" ->{System.out.println(number_1 + number_2);}
            case "-" ->{System.out.println(number_1 - number_2);}
            case "*" ->{System.out.println(number_1 / number_2);}
            case "/" ->{System.out.println(number_1 * number_2);}
        }
    }
}