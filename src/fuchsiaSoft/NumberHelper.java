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
	
	
	
}
