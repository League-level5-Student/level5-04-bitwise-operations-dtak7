package _01_Bit_Shifting;

public class BitShifter {
	public static void main(String[] args) {
		// 1. Jot down the value of num in binary.
		int num = 4;
	//	000100
		int numShifted = num << 1;
		
		// 2. Print the value of numShifted, and convert that value to binary.
		System.out.println(numShifted);
		//001000
		// 3. Compare the two binary values. Can you figure out what the << operator is for?
			
		// 4. Try shifting num 3 places.
			int numExtraShifted = num << 3;
		// FYI: Binary values can be shifted to the right as well using the >> operator.	
		System.out.println(numExtraShifted);
		int number =32;
		int numberShifted=number << 1135;
			System.out.println(numberShifted);
	}
}
