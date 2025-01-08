package br.com.calculadoraJavaComSwing;

public class Calculate {
	
	public static float operation(String operation, float number1, float number2) {
		if(operation.equals("+")) {
			return sum(number1, number2);
		}else if (operation.equals("-")) {
			return sub(number1, number2);
		}else if (operation.equals("*")) {
			return mult(number1, number2);
		}else if (operation.equals("/")) {
			return div(number1, number2);
		}
		return (Float) null;
	}
	
	private static float div(float number1, float number2) {
		float ResultNumber1 = number1;
		float ResultNumber2 = number2;
		float div = ResultNumber1 / ResultNumber2;
		
		return div;
	}
	
	private static float mult(float number1, float number2) {
		float ResultNumber1 = number1;
		float ResultNumber2 = number2;
		float mult = ResultNumber1 * ResultNumber2;
		
		return mult;
	}
	
	private static float sub(float number1, float number2) {
		float ResultNumber1 = number1;
		float ResultNumber2 = number2;
		float sub = ResultNumber1 - ResultNumber2;
		
		return sub;
	}
	
	private static float sum(float number1, float number2) {
		float ResultNumber1 = number1;
		float ResultNumber2 = number2;
		float sum = ResultNumber1 + ResultNumber2;
		
		return sum;
	}
}
