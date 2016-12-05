/**
 * 
 */
package fuchsiaSoft;

import java.util.List;


/**
 * @author chris
 *
 */
public class Problem03 extends BaseProblem {

	/* (non-Javadoc)
	 * @see fuchsiaSoft.BaseProblem#Solve()
	 */
	public String Solve() {
		
		//Find largest prime factor of n:
		long n = 600851475143L;
		
		long highestPrimeFactor = 0;
		
		List<Long> factorsList = NumberHelper.getFactors(n);
		
		for (Long candidate : factorsList) {
			if (NumberHelper.isPrime(candidate) && 
				candidate > highestPrimeFactor) {
				
				highestPrimeFactor = candidate;
			}
		}
		
		return String.valueOf(highestPrimeFactor);
		
	}

}
