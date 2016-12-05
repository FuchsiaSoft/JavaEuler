/**
 * 
 */
package fuchsiaSoft;

/**
 * @author chris
 *
 */
public class Problem05 extends BaseProblem {

	/* (non-Javadoc)
	 * @see fuchsiaSoft.BaseProblem#Solve()
	 */
	@Override
	public String Solve() {
		
		//Smallest number evenly divisible by 1 through 20
		long result = 0;
		long i = 1;
		while (result ==0) {
			for (int j = 1; j < 21; j++) {	
				if (i % j != 0) {
					result = 0;
					break;
				}
				result = i;
			}
			i++;
		}
		
		return String.valueOf(result);
		
	}

}
