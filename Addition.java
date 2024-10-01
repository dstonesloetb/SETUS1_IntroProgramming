/**
 * Purpose: Input two integer values,
 * calculate and display the result
 * Date: 
 * @author DarrenStones
 */
public class Addition {

    public static void main(String[] args) {
        //Declare and initialise our variables
        int number1 = 0;
        int number2 = 0;
        int answer = 0;
       
        //  Output a message to prompt user for the first number
        System.out.print("Enter the first number: ");
        
        //Input the first number.
        number1 = EasyIn.getInt();
        
        //Output a message to prompt user for the second number
         System.out.print("Enter the second number: ");
         
        //Input the second number.
        number2 = EasyIn.getInt();
        
        //answer = first number plus second number
        answer = number1 + number2;
        
        //Output answer
        System.out.println("The sum of the two numbers is "+answer);      
                        
    } //end main
} //end class
