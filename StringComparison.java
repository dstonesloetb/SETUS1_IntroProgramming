class StringComparison {
  public static void main(String[] args) {
            
    String emp1 = "Fred Smith";
    String emp2 = "fred smith";
        
    //check to see if the content
    //of both strings are the same 
    if (emp1.equals(emp2)) {
        System.out.println("Both names are the same");
    }
    else {
        System.out.println("Both names are not the same");
    } //end if 

 //check to see if the content
    //of both strings are the same 
    if (emp1.equalsIgnoreCase(emp2)) {
        System.out.println("Both names are the same");
    }
    else {
        System.out.println("Both names are not the same");
    } //end if 

    
        
  }//end of main
    
} //end of class
