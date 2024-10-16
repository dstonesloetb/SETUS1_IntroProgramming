public class DataTypeCasting {
   
    public static void main(String[] args) {
        
        //Widening or upcasting
        //from a smaller data type to a larger 
        //data type
        int myInt = 9;
        // Automatic casting: int to double
        double myDouble = myInt; 

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0
        
        //Downcasting or narrowing 
        //Going from a larger datatype to a smaller
        //data type - could lose information  
        double myDouble2 = 9.78d;
        // Manual casting: double to int
        int myInt2 = (int) myDouble2; 

        System.out.println(myDouble2);   // Outputs 9.78
        System.out.println(myInt2);      // Outputs 9
        
        //Example 3
        float daysFloat = 365.25f;  //num of days in the year
        String weeksString = "52"; //num weeks in year 
        
        //Cast the float value to an int variable
        int daysInt = (int) daysFloat; //365.25->365 
        
        //Convert the String value to an int value
        // "52" String - >   52 integer
        int weeksInt = Integer.parseInt(weeksString);
        
        //Perform some arithmetic on the converted values
                // (365     /   52    ) -> 7 days per week
        int week = (daysInt / weeksInt);
        System.out.println("Days per week: "+week);
        
    } //end main 
    
} //end class 
