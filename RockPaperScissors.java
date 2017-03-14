import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		
		
		int Rock;
		int Paper;
		int Scissor;
	    int Player;
	    int Computer;
	    	
		Scanner PlayerScan = new Scanner(System.in);
		Random ComputerRandom = new Random();
		
		 System.out.println(" PICK 1.Rock 2.Paper 3.Scissors?: ");
		    Player = PlayerScan.nextInt();
		    Computer = ComputerRandom.nextInt();
		 System.out.printf("Computer Picks %d\n", ComputerRandom.nextInt(2));
		 
		 Rock = 0;
		 Paper = 1;
		 Scissor = 2;
		 
				 
if(Player == Computer)
{ System.out.println("it is a tie");
	}
else if( Player == 0 && Computer == 2)
{ System.out.println("You have won");
	}
if(Player == 1 && Computer == 0 )
{ System.out.println("You have won");
	}
if(Player == 2 && Computer == 1)
{ System.out.println("You have won");
	}
else { 
System.out.println("You have lost");
}
	}
}





	
