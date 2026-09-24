// Class: TemperatureConverter
// Student Name : [Your Name Here]
// Student Id Number : [Your Student ID Here]
// Date : 24/09/2026
// Purpose : A program that takes a Fahrenheit value from the keyboard, 
//           converts it to Centigrade, and prints the result.

public class TemperatureConverter 
{
    public static void main(String[] args) 
    {
        // 1. Variable Declarations
        double fahrenheit=0;
        double centigrade=0;

        // 2. Input Processing using EasyIn
        System.out.print("Please enter the temperature in Fahrenheit: ");
        fahrenheit = EasyIn.getDouble();

        // 3. Mathematical Computation
        // Note: We use 5.0 / 9.0 instead of 5 / 9 to avoid integer division (which evaluates to 0)
        centigrade = (5.0 / 9.0) * (fahrenheit - 32.0);

        // 4. Output Presentation
        System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + centigrade + " degrees Centigrade.");
    }
}
