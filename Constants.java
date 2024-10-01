class Constants {
  public static void main(String[] args) {

    //Declare and initialise three integer constants
    final int TOUCHDOWN = 6;
    final int CONVERSION = 1;
    final int FIELDGOAL = 3; 

     //Declare 4 variables
    int td=0, pat=0, fg=0, total=0;

    //Calculate the score for the game
    td = 4 * TOUCHDOWN; //24=4*6
    pat = 3 * CONVERSION; //3=3*1 
    fg = 2 * FIELDGOAL; // 6=2*3 
    total = (td+pat+fg);

    //Output result   
    System.out.println("Score: "+total);

    
  } //end main 
} //end class 
