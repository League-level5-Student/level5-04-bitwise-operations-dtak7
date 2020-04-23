package _03_Printing_Binary;

import java.math.BigInteger;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Use bit shifting and bit masking to print the binary numbers.
	//Do not use the Integer.toBinaryString method!
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	public static void main(String[] args) {
		BinaryPrinter pb= new BinaryPrinter();
		pb.printByteBinary((byte)50);
		System.out.println("");
		pb.printShortBinary((short)2345);
		System.out.println("");
		pb.printIntBinary(312351625);
		System.out.println("");
		pb.printLongBinary(121345134531L);
	}
	public void printByteBinary(byte b) {
		int binary = 128;
		for(int i =8;i>0;i--) {
		byte ans=(byte) ((b&binary)>>i-1);
		System.out.print(ans);
		binary/=2;
		}
	}
	
	public void printShortBinary(short s) {
		int binary = 32768;
		for(int i =16;i>0;i--) {
			byte ans = (byte) ((s&binary)>>i-1);
			System.out.print(ans);
			binary/=2;
		}
		
	}
	
	public void printIntBinary(int i) {
		long binary = 2147483648L;
		for(int i2 =32;i2>0;i2--) {
			byte ans = (byte) ((i&binary)>>i2-1);
			System.out.print(ans);
			binary/=2;
		}
	}
	
	public void printLongBinary(long l) {
		printIntBinary((int)(l>>32));
		printIntBinary((int)(l));
}
}
