//*****************************************************************************************************************
// Converter.java
//
// This application prompts the user to input a weight in pounds and converts it to a weight in kilograms, then
// prints that output back to the user.
//*****************************************************************************************************************
import java.util.Scanner;

public class Converter
{
    public static void main(String[] args)
    {
        // Declares user input variable and prompts user for value (that is converted into a double)
        Scanner weight = new Scanner(System.in);
        System.out.println("Weight Converter Tool");
        System.out.print("Please enter an amount of lbs to be transferred into kg: ");
        double userInput = weight.nextDouble();

        // Makes weight conversion calculation and displays results (with concatenation)
        double weightConversion = userInput * 0.45359237;
        System.out.println(userInput + "lbs is " + weightConversion + "kgs");
    }
}