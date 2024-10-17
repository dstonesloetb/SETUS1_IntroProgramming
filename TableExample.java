public class TableExample {

  
    public static void main(String[] args) {
        // Build a String containing 
        // a formatted table title and column headings 
        String header = "\n\tNEW YORK 3-DAY FORECAST:\n";
        header += "\n\tDay\t\tHigh\tLow\tConditions\n";
        header += "\t---\t\t----\t---\t----------\n";
       
        //Build a String containing the 
        //formatted table cell data
        String forecast = "\tSunday\t\t68F\t48F\tSunny\n";
        forecast += "\tMonday\t\t69F\t57F\tSunny\n";
        forecast += "\tTuesday\t\t71F\t50F\tCloudy\n";
        
        //Output both the heading and the table data
        System.out.println(header+forecast);
        
        
    } //end main 
    
} //end class 
