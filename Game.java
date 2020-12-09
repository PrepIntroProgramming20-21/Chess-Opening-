import java.util.Scanner;

public class Game {
  public String name;
  public String opening;
  public String moreOpenings;
  Board gameBoard = new Board();
  Scanner consoleInput = new Scanner(System.in);
  
  public void name() {
    System.out.println("\nPlease enter your name: ");
        name = consoleInput.nextLine();
       System.out.println("Hello " + name + "!\n");
  }

  public void opening() {
    System.out.println("We have 3 openings prepared: \n1. Danish Gambit \n2. Morra Gambit \n3. Evan's Gambit \n\nWhich opening would you like to see?");
    while (true) {
          opening = consoleInput.nextLine();
      if (opening.equals("Danish Gambit")) {
          System.out.println("\nGreat choice! Here's the Danish Gambit:");
          Danish.board();
          moreOpenings();
          break;
        } 
      else if (opening.equals("Morra Gambit")) {
          System.out.println("\nExcellent choice! Here's the Morra Gambit: ");
          Morra.board();
          moreOpenings();
          break;
      }
      else if (opening.equals("Evan's Gambit")) {
          System.out.println("\nPerfect! Here's the Evan's Gambit: ");
          Evans.board();
          moreOpenings();
          break;
      }
      else {
        System.out.println("Please enter an opening.\n'Danish Gambit', 'Morra Gambit', or 'Evan's Gambit' ");
      }
    }
  }
  
  public void moreOpenings() {
    System.out.println("\nWould you like to see another opening? Reply 'Yes' or 'No' ");
    while (true) {
        moreOpenings = consoleInput.nextLine();
      if (moreOpenings.equals("Yes")) {
        System.out.println("\nAwesome!");
        opening();
        break;
      }
      else if (moreOpenings.equals("No")) {
        System.out.println("\nThanks for playing! We hope you learned a new gambit!");
        consoleInput.next();
        break;
      }
      else {
        System.out.println("Please enter 'Yes' for more openings OR 'No' to end the lesson.");
      }
    }
  }

  public void danish() {
      gameBoard.arrayOfArrays[4][4] = '\u265F';
      moreOpenings();
    }

  public void morra() {
      moreOpenings();
    }
  
  public void evans() {
      moreOpenings();
    }
}

  