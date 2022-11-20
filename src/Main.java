import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int testcase=0;testcase<5;testcase++) {
			doTestCase();
		}
	}
	
	private static void doTestCase() {
		// TODO Auto-generated method stub
		String line = sc.nextLine();
		String[] numbers = line.split(" ");
		for (String num:numbers) {
			int comp = getCompensateDigit(num);
			System.out.print(comp);
		}
		System.out.println();
	}

	private static int getCompensateDigit(String num) {
		// TODO Auto-generated method stub
		int comp = 0;
		int sum = 0;
		for (int i=0;i<num.length();i++) {
			char digit = num.charAt(num.length()-1-i);
			if (i % 2==0)
				sum += doubleDigit(digit);
			else
				sum += digit-'0';
		}
		
		int remainder = sum % 10;
		if (remainder == 0) {
			comp = 0;
		} else {
			comp = 10 - remainder;
		}
		return comp;
	}

	private static int doubleDigit(char digit) {
		// TODO Auto-generated method stub
		int num = digit - '0';
		num *= 2;
		if (num>=10) {
			num = num%10 + num/10;
		}
		return num;
	}

}
