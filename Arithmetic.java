class Arithmetic {
  public static void main(String[] args) {
  //Declare and initialise 3 variables
    int num=365;
    int factor=5;
    int sum=0;

    //Perform addition and subtraction
    //Display results 
    sum = num + factor; //120=100+20 
    System.out.println("Add result: "+sum);
    sum = num - factor; //80=100-20 
    System.out.println("Sub result: "+sum);

    //Perform multiplication and division
    //Display results 
    sum = num % factor; //2000=100*20 
    System.out.println("Multiply result: "+sum);
    sum = num / factor; //5=100/20 
    System.out.println("Division result: "+sum);
    
  }//end main
} //end class 
