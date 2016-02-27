package base;

//Garrett LaCurts

public class MyInteger {

	private int iValue;

	public MyInteger(int value) {
		
		this.iValue = value;
	}

	public int getValue() {
		
		return iValue;
	}

	public boolean isEven() {

		if (iValue % 2 == 0)
			return true;
		else
			return false;
	}

	public boolean isOdd() {

		if (iValue % 2 != 0)
			return true;
		else
			return false;
	}

	public boolean isPrime() {

		for (int i = 2; i < iValue; i++) {

			if (iValue % i == 0)
				return false;
		}
		return true;
	}

	public static boolean isEven(int iValue) {
		
		return isEven(iValue);
	}
	
	public static boolean isOdd(int iValue) {
		
		return isOdd(iValue);
	}
	
	public static boolean isPrime(int iValue) {
		
		return isPrime(iValue);
	}
	
	public static boolean isEven(MyInteger value) {
		
		return MyInteger.isEven(value.getValue());
	}
	
	public static boolean isOdd(MyInteger value) {
		
		return MyInteger.isOdd(value.getValue());
	}
	
	public static boolean isPrime(MyInteger value) {
		
		return MyInteger.isPrime(value.getValue());
	}
	
	public boolean equals(int value) {
		
		if (value == iValue)
			return true;
		else
			return false;
	}
	
	public boolean equals(MyInteger value) {
		
		return value.equals(value.getValue());
	}
	
	public static void main(String[] args) {
		
	}

}