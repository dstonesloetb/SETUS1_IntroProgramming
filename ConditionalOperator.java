package com.mycompany.intro;

public class ConditionalOperator {

  
    public static void main(String[] args) {
        // Coffee shop order (size and upcharge)
        boolean isLargeSize = true; 
        double basePrice = 3.50;
        
        double finalPrice = basePrice +
                (isLargeSize ? 1.50 : 0.00);
        
        //Ouput:  Your total is €5.0 
        System.out.println("Your total is EUR "+finalPrice);
        
        System.out.println("--------");
        
        //Determine the spicy level of the chilli
        
        int scovilleUnits = 50000; 
        
        String spiceLevel = (scovilleUnits >100000) ?
                "Nuclear" : 
                (scovilleUnits > 10000) ?
                "Spicy" : "Mild";
        
        //Output: Spice Level: Spicy 
        System.out.println("Spice Level: "+spiceLevel);
        
    } //end main 
    
} //end class 
