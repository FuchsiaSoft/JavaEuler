package fuchsiaSoft;
/**
 * 
 */

/**
 * @author chris
 *
 */
public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Problem ID  --  " + String.format("%-10s", "Answer") + "  --  Time");
		System.out.println("------------------------------------");
		
		long start = System.currentTimeMillis();
		String answer = "";
		Problem01 problem01 = new Problem01();
		answer = problem01.Solve();
		long end = System.currentTimeMillis();
		System.out.println("Problem 01  --  " + String.format("%-10s", answer) + "  --  " + String.valueOf(end-start) + "ms");
		
		start = System.currentTimeMillis();
		answer = "";
		Problem02 problem02 = new Problem02();
		answer = problem02.Solve();
		end = System.currentTimeMillis();
		System.out.println("Problem 02  --  " + String.format("%-10s", answer) + "  --  " + String.valueOf(end-start) + "ms");
		
		start = System.currentTimeMillis();
		answer = "";
		Problem03 problem03 = new Problem03();
		answer = problem03.Solve();
		end = System.currentTimeMillis();
		System.out.println("Problem 03  --  " + String.format("%-10s", answer) + "  --  " + String.valueOf(end-start) + "ms");
		
		start = System.currentTimeMillis();
		answer = "";
		Problem04 problem04 = new Problem04();
		answer = problem04.Solve();
		end = System.currentTimeMillis();
		System.out.println("Problem 04  --  " + String.format("%-10s", answer) + "  --  " + String.valueOf(end-start) + "ms");
		
		start = System.currentTimeMillis();
		answer = "";
		Problem05 problem05 = new Problem05();
		answer = problem05.Solve();
		end = System.currentTimeMillis();
		System.out.println("Problem 05  --  " + String.format("%-10s", answer) + "  --  " + String.valueOf(end-start) + "ms");
		
		start = System.currentTimeMillis();
		answer = "";
		Problem06 problem06 = new Problem06();
		answer = problem06.Solve();
		end = System.currentTimeMillis();
		System.out.println("Problem 06  --  " + String.format("%-10s", answer) + "  --  " + String.valueOf(end-start) + "ms");
	}

}
