//Yashi Bajpai and Shreya Kamath

import java.util.Random;
import java.util.Scanner;
import java.awt.*;
import javax.swing.*;

public class Main extends JPanel {
  
  public void paint(Graphics g) {
    super.paintComponent(g);
    setBackground(Color.WHITE);
    g.setColor(Color.black);
    g.drawOval(55, 10, 300, 300);
    g.fillOval(55, 10, 300, 300);

    g.setColor(Color.white);
    g.drawOval(130, 80, 150, 150);
    g.fillOval(130, 80, 150, 150);

    Font arial = new Font("Arial", Font.BOLD, 75);
    g.setColor(Color.black);
    g.setFont(arial);
    g.drawString("8", 180, 180);

    
    }

  
  public static void main(String[] args) throws InterruptedException {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    Scanner in = new Scanner(System.in);

    Main d = new Main();
    JFrame f = new JFrame("8 Ball Graphic.");
    f.add(d);
    f.setSize(400,350);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLocationRelativeTo(null);
    f.setVisible(true);


    String message = "What would you like to ask the Mystical Magic 8 Ball?\n";
    for(int a = 0; a < message.length(); a++)
      {
        System.out.print(message.charAt(a));
        Thread.sleep(100);
      }
    String answer = scan.nextLine();
    int number = rand.nextInt(9);

    if(number == 0)
      System.out.println("\nI'm tired, ask me later");
    if(number == 1)
      System.out.println("\nWhy is this even a question, the answer is obviously no.");
    if(number == 2)
      System.out.println("\nI don't know, don't ask me.");
    if(number == 3)
      System.out.println("\nPlease. Stop. Talking.");
    if(number == 4)
      System.out.println("I dont't really know, but the answer is probably no.");
    if(number == 5)
      System.out.println("Is your brain the size of a walnut? The answer is obviously yes.");
    if(number == 6)
       System.out.println("Maybe yes, maybe no, i don't know ask Google.");
    if(number == 7)
      System.out.println("My main source, aka my smart self, says that it's a yes !!");
    if(number == 8)
       System.out.println("Your outlook surprisingly says yes.");
    if(number == 9)
      System.out.print("Placeholder");

    String mesage = "\nThanks for using the Magic 8 Ball!";
    for(int b = 0; b < mesage.length(); b++)
      {
        System.out.print(mesage.charAt(b));
        Thread.sleep(100);
      }
    System.out.println("\nCopyright © 2022 Yashi & Shreya\nWe tried, nothing worked, this was the best we could do. ");
    scan.close();
    in.close();
  }
}
