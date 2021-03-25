import java.util.Scanner;
public class Palindrome {

	private boolean isPalindrome(String word) {

		if(word.length() == 0 || word.length() == 1)
			return true;
		if (word.charAt(0) == word.charAt(word.length() - 1)){ // checks if two chars match
			return isPalindrome(word.substring(1, word.length()-1)); // checks next two chars using substring and loops until length = 1 or 0
		}

		return false;

	}

	public Palindrome() {

	Scanner testword = new Scanner(System.in);
        System.out.println("Enter a word to test");
        String word = testword.nextLine();
        testword.close();
        word = word.toLowerCase();

		if (isPalindrome(word)) {
		    System.out.println("Pass"); }
		else {
		    System.out.println("Fail"); }
								}


	public static void main(String[] args) {


	}

}
