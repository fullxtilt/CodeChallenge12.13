
public class MainDriver {

	public static void main(String[] args) {
		final String[] testStrings = {"abcdcbg", "abccia", "abcdaaa", "1234312"};

		for (String str: testStrings) {
			System.out.println("almostPalindrome(" + str + ") -> " + almostPalindrome(str));
		}
	}
	
	/**
	 * Determines whether a given String is one letter away from being a palindrome.
	 * @param str 	The String to be checked
	 * @return		True if almost palindrome, false if not
	 */
	public static boolean almostPalindrome(String str) {
		
		// Reverse the given string
		StringBuffer sBuffer = new StringBuffer(str);
		String revStr = sBuffer.reverse().toString();
		
		// Count differences
		int numDiffs = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != revStr.charAt(i)) {
				numDiffs++;
			}
		}
		
		// Is it almost a palindrome?
		return (numDiffs == 2);
		
	}
}
