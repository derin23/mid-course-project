
public class Dice2 {

	public static void main(String[] args) {
		System.out.println("Hello, Welcome to the dice game made by Derin and Johnson. The rules are simple, if you get a total of 7 or 11 from rolling your two dices on the first try you win. If you land 2,3 or 12 on your first roll you automatically lose. If you land another number that becomes your score and you keep rolling until you hit your score again. If you hit 7 after the first roll you lose. Got all that? Lets Play!");
		 String message = Game(Roll());
		 System.out.println(message);
	}
	//This function generates 2 random numbers and adds them together.
	public static int Roll() {
		//makes random numbers.
		int dice1 = (int)(Math.random() * 6)+1;
		int dice2 = (int)(Math.random() * 6)+1;
		//adds them together.
		int diceTotal = dice1+dice2;
		//Tells the user what the total of both dices are.
		System.out.println("You rolled "+diceTotal);
		return diceTotal;
	}
	// This functions does all the 
	public static String Game(int diceTotal) {
		int Total = diceTotal;
		String message ="";
		// user lands 7 or 11 they win
		 if ( diceTotal == 7 || diceTotal == 11) {
				message = "You Win!!";
				return message;
			}
		//user lands 2,3 or 12 they lose
		 else if(diceTotal == 2 || diceTotal == 3 || diceTotal == 12) {
				message = "You Lost";
				return message;
			}
		 
		 else {
			 int newRoll = 0;
			 //if user lands anything else that becomes their score.
			 while (diceTotal != newRoll && newRoll != 7) {
				 System.out.println("Your score is "+ diceTotal);
				 newRoll = Roll();
				 if(newRoll != 7) {
				System.out.println("You need to roll "+ diceTotal +" to win");	
				 }
			
		}
			 //if user lands 7 after first roll they lose
			 if(newRoll == 7) {System.out.println("Seven after the first roll means you lose");
			 }
			 else {
			 System.out.println("You Won!!");}
		//return Total;
		
		
	}
		 return message;
		 
	}

}
