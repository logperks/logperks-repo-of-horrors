import java.util.Scanner;

public class word2ascii {
	//XXXXX
	//XXXXX
	//XXXXX
	//XXXXX
	//XXXXX
	
	public static String transferLine(String word, String letter) {
		String blank = " ";

		for (int i = 0; i < word.length(); i++) {
			switch (Character.toUpperCase(word.charAt(i))){
				case 'A':				
					System.out.println(blank + blank + letter + blank + blank);
					System.out.println(blank + letter + blank + letter + blank);
					System.out.println(blank + letter + letter + letter + blank);
					System.out.println(letter + blank + blank + blank + letter);
					System.out.println(letter + blank + blank + blank + letter);
					System.out.println();
					break;
				case 'B':
					System.out.println(letter + letter + letter + letter + blank);
					System.out.println(letter + blank + blank + blank + letter);
					System.out.println(letter + letter + letter + letter + blank);
					System.out.println(letter + blank + blank + blank + letter);
					System.out.println(letter + letter + letter + letter + blank);
					System.out.println();
					break;
				case 'C':
					System.out.println(blank + letter + letter + letter + letter);
					System.out.println(letter);
					System.out.println(letter);
					System.out.println(letter);
					System.out.println(blank + letter + letter + letter + letter);
					System.out.println();
					break;
				case 'D':
					System.out.println(letter + letter + letter + letter + blank);
					System.out.println(letter + blank + blank + blank + letter);
					System.out.println(letter + blank + blank + blank + letter);
					System.out.println(letter + blank + blank + blank + letter);
					System.out.println(letter + letter + letter + letter + blank);
					System.out.println();
					break;
				case 'E':
					System.out.println(letter + letter + letter + letter + letter);
					System.out.println(letter);
					System.out.println(letter + letter + letter);
					System.out.println(letter);
					System.out.println(letter + letter + letter + letter + letter);
					System.out.println();
					break;
				case 'F':
					System.out.println(letter + letter + letter + letter + letter);
					System.out.println(letter);
					System.out.println(letter + letter + letter);
					System.out.println(letter);
					System.out.println(letter);
					System.out.println();
					break;
				case 'G':
					System.out.println(letter + letter + letter + letter + letter);
					System.out.println(letter + blank + blank + blank + blank);
					System.out.println(letter + blank + letter + letter + letter);
					System.out.println(letter + blank + blank + blank + letter);
					System.out.println(letter + letter + letter + letter + letter);
					System.out.println();
					break;
				case 'H':
					System.out.println(letter + blank + blank + blank + letter);
					System.out.println(letter + blank + blank + blank + letter);
					System.out.println(letter + letter + letter + letter + letter);
					System.out.println(letter + blank + blank + blank + letter);
					System.out.println(letter + blank + blank + blank + letter);
					System.out.println();
					break;
				case 'I':
					System.out.println(letter + letter + letter + letter + letter);
					System.out.println(blank + blank + letter + blank + blank);
					System.out.println(blank + blank + letter + blank + blank);
					System.out.println(blank + blank + letter + blank + blank);
					System.out.println(letter + letter + letter + letter + letter);
					System.out.println();
					break;
				case 'J':
					System.out.println(letter + letter + letter + letter + letter);
					System.out.println(blank + blank + blank + letter + blank);
					System.out.println(blank + blank + blank + letter + blank);
					System.out.println(letter + blank + blank + letter + blank);
					System.out.println(letter + letter + letter + letter + letter);
					System.out.println();
					break;
				case 'K':
					System.out.println(letter + blank + blank + letter + blank);
					System.out.println(letter + blank + letter + blank + blank);
					System.out.println(letter + letter + blank + blank + blank);
					System.out.println(letter + blank + letter + blank + blank);
					System.out.println(letter + blank + blank + letter + blank);
					System.out.println();
					break;
				case 'L':
					System.out.println(letter + blank + blank + blank + blank);
					System.out.println(letter + blank + blank + blank + blank);
					System.out.println(letter + blank + blank + blank + blank);
					System.out.println(letter + blank + blank + blank + blank);
					System.out.println(letter + letter + letter + letter + letter);
					System.out.println();
					break;
				case 'M':
					System.out.println(blank + letter + blank + letter + blank);
					System.out.println(letter + blank + letter + blank + letter);
					System.out.println(letter + blank + letter + blank + letter);
					System.out.println(letter + blank + letter + blank + letter);
					System.out.println(letter + blank + letter + blank + letter);
					System.out.println();
					break;
				case 'N':
					System.out.println(letter + blank + blank + blank + letter);
					System.out.println(letter + letter + blank + blank + letter);
					System.out.println(letter + blank + letter + blank + letter);
					System.out.println(letter + blank + blank + letter + letter);
					System.out.println(letter + blank + blank + blank + letter);
					System.out.println();
					break;
				case 'O':
					System.out.println(blank + letter + letter + letter + blank);
					System.out.println(letter + blank + blank + blank + letter);
					System.out.println(letter + blank + blank + blank + letter);
					System.out.println(letter + blank + blank + blank + letter);
					System.out.println(blank + letter + letter + letter + blank);
					System.out.println();
					break;
				case 'P':
					System.out.println(letter + letter + letter + letter + letter);
					System.out.println(letter + blank + blank + blank + letter);
					System.out.println(letter + letter + letter + letter + letter);
					System.out.println(letter);
					System.out.println(letter);
					System.out.println();
					break;
				case 'Q':
					System.out.println(blank + letter + letter + letter + blank);
					System.out.println(letter + blank + blank + blank + letter);
					System.out.println(letter + blank + blank + blank + letter);
					System.out.println(blank + letter + letter + letter + blank);
					System.out.println(blank + blank + blank + blank + letter);
					System.out.println();
					break;
				case 'R':
					System.out.println(letter + letter + letter + letter + blank);
					System.out.println(letter + blank + blank + blank + letter);
					System.out.println(letter + letter + letter + letter + blank);
					System.out.println(letter + blank + letter + blank + blank);
					System.out.println(letter + blank + blank + letter + blank);
					System.out.println();
					break;
				case 'S':
					System.out.println(blank + letter + letter + letter + letter);
					System.out.println(letter);
					System.out.println(blank + letter + letter + letter + letter);
					System.out.println(blank + blank + blank + blank + letter);
					System.out.println(letter + letter + letter + letter + blank);
					System.out.println();
					break;
				case 'T':
					System.out.println(letter + letter + letter + letter + letter);
					System.out.println(blank + blank + letter + blank + blank);
					System.out.println(blank + blank + letter + blank + blank);
					System.out.println(blank + blank + letter + blank + blank);
					System.out.println(blank + blank + letter + blank + blank);
					System.out.println();
					break;
				case 'U':
					System.out.println(letter + blank + blank + blank + letter);
					System.out.println(letter + blank + blank + blank + letter);
					System.out.println(letter + blank + blank + blank + letter);
					System.out.println(letter + blank + blank + blank + letter);
					System.out.println(letter + letter + letter + letter + letter);
					System.out.println();
					break;
				case 'V':
					System.out.println(letter + blank + blank + blank + letter);
					System.out.println(letter + blank + blank + blank + letter);
					System.out.println(blank + letter + blank + letter + blank);
					System.out.println(blank + letter + blank + letter + blank);
					System.out.println(blank + blank + letter + blank + blank);
					System.out.println();
					break;
				case 'W':
					System.out.println(letter + blank + letter + blank + letter);
					System.out.println(letter + blank + letter + blank + letter);
					System.out.println(letter + blank + letter + blank + letter);
					System.out.println(letter + blank + letter + blank + letter);
					System.out.println(blank + letter + blank + letter + blank);
					System.out.println();
					break;
				case 'X':
					System.out.println(letter + blank + blank + blank + letter);
					System.out.println(blank + letter + blank + letter + blank);
					System.out.println(blank + blank + letter + blank + blank);
					System.out.println(blank + letter + blank + letter + blank);
					System.out.println(letter + blank + blank + blank + letter);
					System.out.println();
					break;
				case 'Y':
					System.out.println(letter + blank + blank + blank + letter);
					System.out.println(letter + blank + blank + blank + letter);
					System.out.println(blank + letter + blank + letter + blank);
					System.out.println(blank + blank + letter + blank + blank);
					System.out.println(blank + blank + letter + blank + blank);
					System.out.println();
					break;
				case 'Z':
					System.out.println(letter + letter + letter + letter + letter);
					System.out.println(blank + blank + blank + letter + blank);
					System.out.println(blank + blank + letter + blank + blank);
					System.out.println(blank + letter + blank + blank + blank);
					System.out.println(letter + letter + letter + letter + letter);
					System.out.println();
					break;
			}	
		}
		return "";
	}
	
	public static void main(String[] args) {
		boolean goodbye = false;
		Scanner inputReader = new Scanner(System.in);

		while (goodbye == false) {

			System.out.print("Input word to transfer: ");
			String word = inputReader.next();
			String letter = "";

			System.out.print("Input letter/emoji to make word out of: ");

			while (letter.length() != 1) {
				letter = inputReader.next();
				if (letter.length() != 1) {
					System.out.println("Letter length must be equal to one.");
					System.out.print("Input letter/emoji to make word out of: ");
				}
			}

			transferLine(word, letter);
			boolean goodbyePrompt = true;
			
			while (goodbyePrompt == true) {
				System.out.print("Continue? [Y/N]");
				String goodbyeChoose = inputReader.next();

				if (goodbyeChoose.equals("y") || goodbyeChoose.equals("Y")) {
					goodbyePrompt = false;
				} else if (goodbyeChoose.equals("n") || goodbyeChoose.equals("N")) {
					goodbye = true;
					goodbyePrompt = false;
				} else {
					System.out.println("Must output Y or N.");
				}
			}
		}
		inputReader.close();
	}
}
