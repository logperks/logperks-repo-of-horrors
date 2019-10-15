import java.util.Scanner;

public class word2ascii {
	//XXXXX
	//XXXXX
	//XXXXX
	//XXXXX
	//XXXXX
	
	public static String transferLine(String word, String letter) {
		String blank = " "; //String blank = ":black_large_square: ";
		//letter = letter + " ";
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
					System.out.println(blank + letter + letter + letter + letter);
					System.out.println(letter + blank + blank + blank + letter);
					System.out.println(letter + blank + letter + letter + letter);
					System.out.println(letter + blank + blank + blank + letter);
					System.out.println(letter + letter + letter + letter + letter);
					break;
				case 'H':
					System.out.println(letter + blank + blank + blank + letter);
					System.out.println(letter + blank + blank + blank + letter);
					System.out.println(letter + letter + letter + letter + letter);
					System.out.println(letter + blank + blank + blank + letter);
					System.out.println(letter + blank + blank + blank + letter);
					break;
			}	
		}
		return "";
	}
	
	public static void main(String[] args) {
		Scanner inputReader = new Scanner(System.in);
		
		System.out.print("Input word to transfer: ");
		String word = inputReader.next();
		
		System.out.print("Input letter/emoji to make word out of: ");
		String letter = inputReader.next();
		inputReader.close();
		
		transferLine(word, letter);
	}
}
