import java.util.Scanner;
public class Palindrome {

		private boolean isPalindrome(String word) {

			int x = 0;
			int y = word.length() - 1;
        	while (x < y) {
        	if (word.charAt(x) != word.charAt(y)){
        		return false;}
        	x++;
            y--;
        }
        return true;
	}
	/*
	 * Open up  the file.
	 * Break into words
	 *  print out all Palindromes
	 */
	private void findAllPalindromes(String fileName) {


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
		new Palindrome();



		System.out.println("I believe that this program has a Big O of  O(N) ");
		System.out.println("This is because each letter of a word is checked at maximum once and compared to another letter");

	}

}