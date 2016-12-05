/**
 * 
 */
package fuchsiaSoft;

/**
 * @author chris
 *
 */
public class Problem06 extends BaseProblem {

	/* (non-Javadoc)
	 * @see fuchsiaSoft.BaseProblem#Solve()
	 */
	@Override
	public String Solve() {
		
		//Difference between sum of squares and square of sum
		//of first 100 numbers
		
		long sumOfSquares = 0;
		long squareOfSums = 0;
		
		for (int i = 1; i < 101; i++) {
			
			sumOfSquares += (i*i);
			squareOfSums += i;
			
		}
		
		squareOfSums *= squareOfSums;
		
		return String.valueOf(squareOfSums - sumOfSquares);
		
	}

}
