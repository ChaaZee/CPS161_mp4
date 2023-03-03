package roman_calculator;

import java.util.*;

public class RomanCalculator {

	public static Scanner input = new Scanner(System.in);
	
	public static char getOperator() {
		char operator = ' ';
		
		while(true) {
			System.out.print("Enter an operator(+,-,*,/): ");
			operator = input.nextLine().charAt(0);
			if(operator == '+' || operator == '-' || operator == '*' || operator == '/') {
				break;
			} else {
				System.out.println("Unknown operator. Try again.");
				continue;
			}
		}
		return operator;
	}
	
	public static String convertToRoman(int num) {
		String numerals = "";
		
		int m = num / 1000;
		while(m > 0) {
			numerals += "M";
			num -= 1000;
			m -= 1;
		}
		
		int d = num / 500;
		while(d > 0) {
			numerals += "D";
			num -= 500;
			d -= 1;
		}
		
		int c = num / 100;
		while(c > 0) {
			numerals += "C";
			num -= 100;
			c -= 1;
		}
		
		int l = num / 50;
		while(l > 0) {
			numerals += "L";
			num -= 50;
			l -= 1;
		}
		
		int x = num / 10;
		while(x > 0) {
			numerals += "X";
			num -= 10;
			x -= 1;
		}
		
		int v = num / 5;
		while(v > 0) {
			numerals += "V";
			num -= 5;
			v -= 1;
		}
		
		int i = num / 1;
		while(i > 0) {
			numerals += "I";
			num -= 1;
			i -= 1;
		}
		return numerals;
	}
	
	public static int convertFromRoman(String numerals) {
		int num = 0;
		
		for(int i = 0; i < numerals.length(); i++) {
			char c = numerals.charAt(i);
			if(Character.toUpperCase(c) == 'M') {
				num += 1000;
			} else if(Character.toUpperCase(c) == 'D') {
				num += 500;
			} else if(Character.toUpperCase(c) == 'C') {
				num += 100;
			} else if(Character.toUpperCase(c) == 'L') {
				num += 50;
			} else if(Character.toUpperCase(c) == 'X') {
				num += 10;
			} else if(Character.toUpperCase(c) == 'V') {
				num += 5;
			} else if(Character.toUpperCase(c) == 'I') {
				num += 1;
			}
		}
		return num;
	}
	
	public static int getOperand() {
		boolean b = true;
		String numerals = "";
		
		while(b) {
			System.out.print("Enter operand: ");
			numerals = input.nextLine();
			for(int i = 0; i < numerals.length(); i++) {
				char c = numerals.charAt(i);
				if(Character.toUpperCase(c) == 'M' || Character.toUpperCase(c) == 'D' || Character.toUpperCase(c) == 'C' || Character.toUpperCase(c) == 'L' || Character.toUpperCase(c) == 'X' || Character.toUpperCase(c) == 'V' || Character.toUpperCase(c) == 'I') {
					b = false;
				} else {
					b = true;
					System.out.println("Invalid operand. Try again.");
					break;
				}
			}
		}
		return convertFromRoman(numerals);
	}
	
	public static String doMath(char operator, int firstNum, int secondNum) {
		int total = 0;
		if(operator == '+') {
			total = firstNum + secondNum;
		} else if(operator == '-') {
			total = firstNum - secondNum;
		} else if(operator == '*') {
			total = firstNum * secondNum;
		} else if(operator == '/') {
			total = firstNum / secondNum;
		} 
		return "Answer: " + convertToRoman(total);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = "";
		char c = 'y';
		
		while(c == 'y') {
			result = doMath(getOperator(), getOperand(), getOperand());
			System.out.println(result);
			
			System.out.print("Do you want to continue(y/n): ");
			c = input.nextLine().charAt(0);
			System.out.println();
		}
	}

}
