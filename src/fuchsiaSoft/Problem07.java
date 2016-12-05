/**
 * 
 */
package fuchsiaSoft;

import java.util.List;

/**
 * @author chris
 *
 */
public class Problem07 extends BaseProblem {

	/* (non-Javadoc)
	 * @see fuchsiaSoft.BaseProblem#Solve()
	 */
	@Override
	public String Solve() {
		
		//10001st prime number
		
		List<Integer> primes = NumberHelper.generatePrimes(2000000);
		
		return String.valueOf(primes.get(10000));
		
	}

}
