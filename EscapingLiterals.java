class EscapingLiterals {
  public static void main(String[] args) {
    // Build a string variable
    // Contain a formatted table
    //title and column headings 
        
    String header = "\n\tNEW YORK 3-DAY FORECAST\n";
   
    header +="\n\tDay\t\t    High\t    Low\tConditions\n";

    
    header +="\t---\t\t    ----\t    ---\t----------\n";
       
    //String containing
    //formatted table cell data 
    //four column table 
    String forecast ="\tSunday |\t68F|\t\t48F|\tSunny\n";
    forecast += "\tMonday |\t71F|\t\t57F|\tSunny\n";
    forecast += "\tTuesday|\t71F|\t\t50F|\tCloudy\n";
           
    //Output the forecast
        System.out.print(header+forecast);
  }
}
