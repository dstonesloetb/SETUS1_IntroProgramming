public class Pay
{
  public static void main(String[] args)
  {
    //Declaring the variables 
    double grossPay; 
    double netPay; 
    double tax;
    double taxRate;


    // Output a message to prompt user for Gross Pay System.out.println("Please enter your gross pay ");

    // Input Gross Pay
    grossPay = EasyIn.getDouble();

   // Output a message to Prompt for Tax Rate System.out.println("Please enter your tax rate");

    // Input Tax Rate
    taxRate = EasyIn.getDouble();

    // Calculating the amount of tax due using: tax = GrossPay *   TaxRate 
    tax = grossPay * taxRate;

    // Finding the Nett pay using: Net Pay = Gross Pay - Tax 
    netPay = grossPay - tax;

    // Output Tax
    System.out.println("Your tax paid amount is " + tax);

    // Output Net Pay
    System.out.println("Your net pay is " + netPay);

  } //end main
} //end class
