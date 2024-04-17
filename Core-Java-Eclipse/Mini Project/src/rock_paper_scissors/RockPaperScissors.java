package rock_paper_scissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		//To get a user input
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			String[] rps = {"r", "p", "s"};//r-rock, p-paper, s-scissors
			
			//To get a random move from Computer - creating instance for Random class
			String computerMove = rps[new Random().nextInt(rps.length)]; 
			//random no in range 0 (including) to rps.length (excluding)
			//For specific range in random no, int randomNumber = random.nextInt(max-min+1)+min;
			
			String playerMove;
			
			//Invalid input from the user
			while(true){
				System.out.println("Please enter your move (r, p, s)");
				playerMove = scanner.nextLine();
				if(playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")){
					break;
				}
				System.out.println(playerMove + " is not a valid move");
			}
			
			
			System.out.println("Computer played: " + computerMove);
			
			//Tie condition between playerMove and computerMove
			if(playerMove.equals(computerMove)){
				System.out.println("The game is a tie!");
			}
			
			else if(playerMove.equals("r")){
				if(computerMove.equals("p")){
					System.out.println("You lose!");
				}
				else if(computerMove.equals("s")){
					System.out.println("You win!!!");
				}
			}
			
			else if(playerMove.equals("p")){
				if(computerMove.equals("s")){
					System.out.println("You lose!");
				}
				else if(computerMove.equals("r")){
					System.out.println("You win!!!");
				}
			}
			
			else if(playerMove.equals("s")){
				if(computerMove.equals("r")){
					System.out.println("You lose!");
				}
				else if(computerMove.equals("p")){
					System.out.println("You win!!!");
				}
			}
			
			System.out.println(("Wanna play again? (y/n)"));
			String playAgain = scanner.nextLine();
			if(!playAgain.equals("y")){
				break;
			}
		}
		//To prevent resource leak 
		scanner.close();
		System.out.println("Thank you for playing!!!");
	}
}
