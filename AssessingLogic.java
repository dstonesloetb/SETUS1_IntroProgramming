class AssessingLogic {
  public static void main(String[] args) {

    boolean yes = true;
    boolean no = false; 

    //Test if both conditions are true 
    boolean result = (yes && yes); //True 
    System.out.println(result);

    result = (yes && no); //False 
    System.out.println(result);

    //Test if either condition is true
    result = (yes || yes); //True
    System.out.println(result);

    result = (yes || no); //True
    System.out.println(result);

    result = (no || no); //False 
    System.out.println(result);

    //Display the original and then the inverse
    //value
    result = yes;   //true 
    System.out.println(result);
    result = !yes;  //false  
    System.out.println(result);
    
  } //end main 
} //end class
