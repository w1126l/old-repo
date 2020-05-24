/* This class contains the methods to do various math related tasks.
 * Author: Winnie Liang
 * Date: 10/10/18
 * Last Change: fixed max three doubles and round2 + some naming of input
 */

public class Calculate {
	
	public static int square(int number) {
		return (number * number);
	} // A call to square returns the square of the value passed.
	
	public static int cube(int number) {
		return (number * number * number);
	} // A call to cube returns the cube of the value passed.
	
	public static double average(double number1, double number2) {
		return ((number1 + number2) /2);
	} // A call to average returns the average of the values passed to it.
	
	public static double average(double number1, double number2, double number3) {
		return ((number1 + number2 + number3) / 3);
	} // Another call to average but instead for three numbers. An example of overloading.
	
	public static double toDegrees(double radian) {
		return ((radian * 180) / 3.14159);
	} // A call toDegrees converts an angle measure given in radians into degrees.
	
	public static double toRadians(double degree) {
		return ((degree * 3.14159) / 180);
	} // A call toRadians converts an angle measure given in degrees into radians.
	
	public static double discriminant(double a, double b, double c) {
		return (b * b) - (4 * a * c);
	} // A call to discriminant provides the coefficient of a quadratic equation in standard form and returns the value of the discriminant.
	
	public static String toImproperFrac(int wholenum, int numerator, int denominator) {
		return ((wholenum * denominator) + numerator) + "/" + denominator;
	} // A call toImproperFrac converts mixed number into an improper fraction.
	
	public static String toMixedNum(int numerator, int denominator) {
		int wholenum = numerator / denominator;
		if (numerator % denominator == 0) {
			return wholenum + "";
		} else {
			return (numerator / denominator) + "_" + (numerator % denominator) + "/" + denominator;
		}
	} // A call toMixedNum converts an improper fraction into a mixed number.
	
	public static String foil(int x1, int m, int x2, int n, String variable) {
		return (x1 * x2) + variable + "^2 + " +  ((x1 * n) + (m * x2)) + variable + " + " + (m * n);
	} // A call to foil converts a binomial multiplication of the form into a quadratic equation in standard form.
	
	public static boolean isDivisibleBy(double dividend, double divisor) {
		if (divisor == 0) {
			throw new IllegalArgumentException("Number cannot be divided by zero.");
		} else if (dividend % divisor == 0) { 
			return true;
		} else {
			return false;
		}
	} // A call to isDivisibleBy determines whether or not one integer is evenly divisible by another. The method accepts two integers and returns a boolean.
	
	public static double absValue(double number) {
		if (number >= 0) {
			return (number);
		} else {
			return (number * -1);
		}
	} // A call to absValue returns the absolute value of the number passed.
	
	public static double max(double number1, double number2) {
		if (number1 > number2) {
			return (number1);
		} else {
			return (number2);
		}
	} // A call to max returns the larger of the values passed.
	
	public static int max(int number1, int number2) {
		if (number1 > number2) {
			return (number1);
		} else {
			return (number2);
		}
	} // A method for gcf larger number value.
	
	public static double max(double number1, double number2, double number3) {
		if (number1 >= number2 && number1 >= number3) {
			return (number1);
		} else if (number2 >= number1 && number2 >= number3) {
			return (number2);
		} else {
			return (number3);
		}
	} // Another call to max but instead for three numbers. Another example of an overload.
	
	public static int min(int number1, int number2) {
		if (number1 > number2) {
			return (number2);
		} else if (number1 < number2) {
			return (number1);
		} else {
			return (number1); // The numbers are the same.
		}
	} // A call to min returns the smaller of the values passed.
	
	public static double round2(double number) {
		double addedNum;
		if (number > 0) {
			addedNum = number + 0.005;
		} else if (number < 0) {
			addedNum = number - 0.005;
		} else {
			return 0;
		}
		double multNum = addedNum * 100;
		int castedNum = (int) multNum;
		double answer = (double) castedNum / 100;
		return answer;
	} // A call to round2 rounds a double correctly to 2 decimal places and returns a double.
	
	public static double exponent(double number, int expo) {
		if (expo == 0) {
			return 1; // Not necessarily needed but just in case.
		} else {
			double answer = number;
			for (int i = 1; i < expo; i++) {
				answer = answer * number;
			}
			return answer;
		}
	} // A call to exponent raises a value to a positive integer power, assuming that the integer is positive.
	
	public static int factorial(int number) {
		if (number < 0) {
			throw new IllegalArgumentException ("Cannot find the factorial of a negative number.");
		} else if (number == 0) {
			return 1;
		} else { 
			for (int i = number - 1; i > 0; i--) {
				number = number * i;
			}
			return number;
		}
	} // A call to factorial returns the factorial of the value passed.
	
	public static boolean isPrime(int number) {
		int i = Calculate.square(number);
		if (number < 0) {
			throw new IllegalArgumentException("Cannot determine if a negative number is prime.");
		} else if (i < 4) {
			return true;
		} else if (i % 2 == 1) {
			return true;
		} else {
			return false;
		}
	} // A call to isPrime determines whether or not an integer is prime. It calls to another method.
	 
	public static int gcf(int number1, int number2) {
		int sm = Calculate.min(number1, number2);
		int lg = Calculate.max(number1, number2);
		int i = lg;
		while (i > 1) {
			if (Calculate.isDivisibleBy(sm, i) == true && Calculate.isDivisibleBy(lg, i) == true) {
				return i;
			} 
			i--;
		}
		return 1;
	} // A call to gcf finds the greatest common factor of two integers. It calls to another method.
	
	public static double sqrt(double number) {
		if (number < 0) {
			throw new IllegalArgumentException("Input must be positive.");
		} else {
			double estimate = (number / 2);
			while (Calculate.absValue((estimate * estimate) - number) >= 0.005) {
				estimate = (0.5 * ((number / estimate) + estimate));
			}
			return Calculate.round2(estimate);
		}
	} // A sqrt returns an approximation of the square root of the value passed, rounded to two decimal places.
	
	public static String quadForm(int a, int b, int c) {
		if (Calculate.discriminant(a, b, c) < 0) {
			return "No real Roots";
		} else if (b == 0 && c == 0) {
			return "0";
		} else if (Calculate.discriminant(a, b, c) == 0) {
			double oneroot = ((b * -1) / (2 * a));
			return oneroot + "";
		} else {
			double discrim = Calculate.discriminant(a, b, c);
			double tworoots1 = (((b * -1) + Calculate.sqrt(discrim)) / (2 * a));
			double tworoots2 = (((b * -1) - Calculate.sqrt(discrim)) / (2 * a));
			return Calculate.round2(tworoots1) + " and " + Calculate.round2(tworoots2);
		}
	} // A call to quadForm uses the coefficients of a quadratic formula to approximate the real roots, if any.

}