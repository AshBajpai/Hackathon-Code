import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) throws InterruptedException {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    //System.out.print("What would you like to ask the mystical Magic 8 Ball? ");
    String message = "What would you like to ask the Mystical Magic 8 Ball";
    for(int a = 0; a < message.length(); a++)
      {
        System.out.print()
      }
    String answer = scan.nextLine();
    int number = rand.nextInt(9);

    switch(number){
        case(0):{
          System.out.println("I'm tired, ask me later");
        }
        case(1):{
          System.out.println("Why is this even a question, the answer is obviously no.");
        }
        case(2):{
          System.out.println("I don't know, don't ask me.");
        }
        case(3):{
          System.out.println("Please. Stop. Talking.");
        }
        case(4):{
          System.out.println("I dont't really know, but the answer is probably no.");
        }
        case(5):{
          System.out.println("Is your brain the size of a walnut? The answer is obviously yes.");
        }
        case(6):{
          System.out.println("Maybe yes, maybe no, i don't know ask Google.");
        }
        case(7):{
          System.out.println("My main source, aka my smart self, says that it's a yes !!");
        }
        case(8):{
          System.out.println("Your outlook surprisingly says yes.");
        }
        case(9):{
          System.out.println();
        }
    }
    scan.close();
  }
}
