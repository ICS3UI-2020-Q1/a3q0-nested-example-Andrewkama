import java.util.Scanner;
/**
 * The example program for Nested stament
 * @author  Andrew kamal
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create saner for user inout
    Scanner input = new Scanner(System.in) ;
    System.out.println("Does the animal have feather? (Yes/No");
    String featherAnwser = input.nextline();

    //check to see feather status
    if(featherAnswer.equals ("yes")){
      
      System.out.println("what colour are the feathers?(red/blue");
      String featherColour = input.nextline();

      // detrime the brid
      if(featherColour.equals("blue")) {
          System.out.println( "That is a bluejay");

      } else if ( featherColour.equals( "red")) {
        System.out.println( "That is a cardianl");
        //
      }
    
    // if the user answerd now 
    }else{


    }
  }
}
