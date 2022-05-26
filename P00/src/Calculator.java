/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * Pre-Installed User, May 26, 2022 11:42:01 AM
 */

/**
 * @author Pre-Installed User
 *
 */
public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	public int subtract (int a, int b) {
		return a - b;
	}
	public int multiply(int a, int b) {
		return a *b;
	}
	public int divide(int a, int b) {
		if (b==0) {
			throw new IllegalArgumentException("Value cannot be 0!");
	
		}	else {
			return a /b ;
		
			
			
		}
		
	}
}

