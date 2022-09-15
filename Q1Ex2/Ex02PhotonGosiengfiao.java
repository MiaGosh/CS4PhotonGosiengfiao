package Ex02;
	import java.util.Scanner;

public class Q1Ex02 {
	public static void main(String[] args) {
		Scanner an = new Scanner(System.in);
		String setting1 = "Start game";
		String setting2 = "Change settings";
		String setting3 = "End application";
		boolean start = true;
		
		Scanner gu = new Scanner(System.in);
		Scanner pl = new Scanner(System.in);
		Scanner lowli = new Scanner(System.in);
		Scanner upli = new Scanner(System.in);
		Scanner guesses = new Scanner(System.in);
		int numguess = 3;
		int lowerlimit = 1;
		int upperlimit = 10;
		
		do {
			System.out.print("Welcome to higher or lower! What will you do? \r\n"
					+ "-" + setting1+ "\r\n"
					+ "-" + setting2+ "\r\n"
					+ "-" + setting3+ "\r\n");
			String answer = an.nextLine();
			
			if (answer.equals(setting1)) {
				String again;
				do {
					int random = (int) Math.floor(Math.random()*(upperlimit-lowerlimit)) + lowerlimit;
					System.out.print("\n");
					
					for (int i=numguess; i>0; i--) {
						System.out.printf("You have %d guess(es) left! What is your guess? ", i);
						int guess = gu.nextInt();
						
						if (i==1 && guess != random) {
							 System.out.printf("You lost... %n");
							 break;
						}
						else if (guess<random) {
							 String direction = "higher";
							 System.out.printf("Guess %s! ", direction);
						 }
						 else if (guess > random) {
							 String direction = "lower";
							 System.out.printf("Guess %s! ", direction);
						 }
						 else if (guess == random) {
							 System.out.printf("You got it! %n");
							 break;
						 }
					}
					
					System.out.printf("Play again? (y/n) ");
					again = pl.nextLine();
					System.out.print("\n");
				}while(again.equals("y"));
			}
			else if (answer.equals(setting2)){
				System.out.print("What is the lower limit of the random number?\r\n"
						+ "What is the upper limit of the random number?\r\n"
						+ "How many guesses are allowed?\n");
				System.out.print("Lower Limit: ");
				lowerlimit = lowli.nextInt();
				System.out.print("Upper Limit: ");
				upperlimit = upli.nextInt();
					if(upperlimit < lowerlimit) {
						System.out.print("Upper limit should be higher than the lower limit. Kindly re-enter: ");
						upperlimit = upli.nextInt();
					}
				System.out.print("Guesses: ");
				numguess = guesses.nextInt();
				System.out.print("\n");
				continue;
			}
			else if (answer.equals(setting3)){
				start = false;
			}
		} while (start);
	}
}
