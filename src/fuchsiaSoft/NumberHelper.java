/**
 * 
 */
package fuchsiaSoft;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chris
 *
 */
public class NumberHelper {

	/**
	 * @param n the number to factorize
	 * @return a list of factors for the specified n
	 */
	public static List<Long> getFactors(long n) {
		
		List<Long> result = new ArrayList<Long>(); 
		
		for (long i = 1; i <= Math.sqrt(n); i++) {
		
			if (n % i == 0) {
				result.add(i);
				result.add(n / i);
			}
		}
		
		return result;
	}
	
	/**
	 * Doesn't work particularly well at it, just a square
	 * root brute force check... so use with caution for
	 * larger numbers
	 * 
	 * @param n number to check if is prime
	 * @return true or false whether number is prime
	 * 
	 */
	public static boolean isPrime(long n) {
		
		for (long i = 2; i <= Math.sqrt(n); i++) {
			
			if (n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * Gets an array of the digits that constitute the number
	 * 
	 * @param n the number to get the digits of
	 * @return array of the digits for n
	 */
	public static int[] getDigits(long n) {
		return getDigits(n, false);
	}
	
	/**
	 * Gets an array of the digits that constitute the number
	 * 
	 * @param n the number to get the digits of
	 * @param reverse whether or not to reverse the digits (true inverts)
	 * @return array of the digits for n
	 */
	public static int[] getDigits(long n, boolean reverse) {
		
		int[] digits = new int[getDigitCount(n)];
		long i = n;
		int index = 0;
		
		if (!reverse) {
			index = digits.length - 1;
		}
		
		while (i > 0) {
			digits[index] = (int)(i % 10);
			i /= 10;
			if (!reverse) {
				index--;
			} else {
				index++;
			}
		}
		
		return digits;
		
	}
	
	/**
	 * Gets the number of digits in n
	 * 
	 * @param n the number to count digits of
	 * @return number of digits
	 */
	public static int getDigitCount(long n) {
		
		long i = n;
		int result = 0;
		
		while (i > 0) {
			i /= 10;
			result++;
		}
		
		return result;
	}
	
	
	
}
