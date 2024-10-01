// Student Name :      D.Stones
// Student Id Number : COM1234
// Date : 
// Purpose : A Sample skeleton program

class UserInput {
  public static void main(String[] args) {
    //Declare and initialise the variable
    String name = "";

    //Input the user's name
		System.out.print("Enter your name: ");
		name = EasyIn.getString();

    //Process the input
    System.out.println("Hello " + name);
		
    //Output
    System.out.println("Have a nice day !");
  } //end main  
} //end class
