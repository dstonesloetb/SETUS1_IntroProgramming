class Comparison {
  public static void main(String[] args) {
    String txt = "Super ";
    String lang = "Java";

    //Compare txt and lang
    boolean state = (txt == lang);
    System.out.println(state);
    state = (txt != lang);
    System.out.println(state);

    //compare dozen to score
    int dozen =12; 
    int score = 20; 
    state = (dozen >score); //12>20
    System.out.println(state);
    state = (dozen <score); //12<20
    System.out.println(state);
    
  } //end main
} //end class
