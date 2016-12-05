/**
 * 
 */
package fuchsiaSoft;

/**
 * @author chris
 *
 */
public class Problem02 extends BaseProblem {

	/* (non-Javadoc)
	 * @see FuchsiaSoft.BaseProblem#Solve()
	 */
	public String Solve() {
		
		int a = 0, b = 0, c = 1;
		int result = 0;
		
		while (c < 4000000) {
			
			if(c % 2 == 0) {
				result += c;
			}
			
			a = b;
			b = c;
			c = a + b;
		}
		
		return String.valueOf(result);
		
	}

}
