public class Test {
	/* 
	 * Takes an string and converts that into an integer.
	 * For each digit it encounters, multiply by 10 to the temp number
	 * so that the digits will shift, then add that digit to the temp number.
	 * We will get the number by getting its vaue by index, then subtract the
	 * ascii value of '0' to shift the correct number. If the string is negative,
	 * then return the negative of the number, otherwise return positive.
	 *
	 * @param s      A string containing only numbers
	 * @return num   An integer that is the same as the paramter s
	 */
	private static int stoi(String s) {
		int num = 0;
		int i = 0;
		boolean isNegative = false;
		if (s.charAt(0) == '-') {
			isNegative = true ;
			i = 1;
		}

		while (i < s.length()) {
			num *= 10;
			num += (s.charAt(i) - '0');
			i++;
		}

		if (isNegative) {
			return -num;
		} else {
			return num;
		}
	}

	/* 
	 * Takes an string and checks if the string has a number in it.
	 * This will use regular expression. ".*" means for any character, 0 or more occurences.
	 * "\d" means a digit, and "+" next to that means anything 1 or more occurences. Therefore,
	 * it will find a match of a digit with 1 or more occurences.
	 *
	 * @param s      A string containing only numbers
	 * @return num   An integer that is the same as the paramter s
	 */
	private static boolean doesIntExistInStr(String s) {
		return s.matches(".*\\d+.*");
	}

	public static void main(String[] args) { 
		// Test cases for stoi
		String stoiTest1 = "123";
		String stoiTest2 = "-4";
		String stoiTest3 = "0";
		String stoiTest4 = "987654321";
		String stoiTest5 = "-924462";
		
		System.out.println("stoiTest1: " + (123 == stoi(stoiTest1)));
		System.out.println("stoiTest2: " + (-4 == stoi(stoiTest2)));
		System.out.println("stoiTest3: " + (0 == stoi(stoiTest3)));
		System.out.println("stoiTest4: " + (987654321 == stoi(stoiTest4)));
		System.out.println("stoiTest5: " + (-924462 == stoi(stoiTest5)));

		// Test cases for doesIntExistInStr
		String doesIntExistInStr1 = "Testing";
		String doesIntExistInStr2 = "I am Testing 2";
		String doesIntExistInStr3 = "ab1 cd2 ef3";
		String doesIntExistInStr4 = "abcdef ghijkl";
		String doesIntExistInStr5 = "";
		
		System.out.println("doesIntExistInStr1: " + (false == doesIntExistInStr(doesIntExistInStr1)));
		System.out.println("doesIntExistInStr2: " + (true == doesIntExistInStr(doesIntExistInStr2)));
		System.out.println("doesIntExistInStr3: " + (true == doesIntExistInStr(doesIntExistInStr3)));
		System.out.println("doesIntExistInStr4: " + (false == doesIntExistInStr(doesIntExistInStr4)));
		System.out.println("doesIntExistInStr5: " + (false == doesIntExistInStr(doesIntExistInStr5)));
	}
}