/**
 * 
 */
package fuchsiaSoft;

import java.sql.Array;
import java.util.Arrays;
import java.util.function.IntPredicate;

/**
 * @author chris
 *
 */
public class Problem04 extends BaseProblem {

	/* (non-Javadoc)
	 * @see fuchsiaSoft.BaseProblem#Solve()
	 */
	@Override
	public String Solve() {
		
		//largest palindrome made from the product
		//of two 3 digit numbers
		
		int longestPalindrome = 0;
		
		for (int i = 1; i < 1000; i++) {
			for (int j = 1; j < 1000; j++) {
				
				int[] digitsForward = NumberHelper.getDigits(i * j, false);
				int[] digitsBackward = NumberHelper.getDigits(i * j, true);
				
				if (Arrays.equals(digitsForward, digitsBackward)) {
					if (i * j > longestPalindrome) {
						longestPalindrome = i * j;
					}
				}
				
			}
		}
		
		return String.valueOf(longestPalindrome);
		
	}

}
