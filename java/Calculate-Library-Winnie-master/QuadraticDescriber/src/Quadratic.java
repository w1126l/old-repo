/* This class will be responsible for all calculations in the quadratic client.
 * Author: Winnie Liang
 * Date: 10/10/18
 * Last Change: fixed round 2
 */

public class Quadratic {
	
	public static double discriminant(double a, double b, double c) {
		return (b * b) - (4 * a * c);
	} // Returns the discriminant; method used for quadForm method.
	
	public static double absValue(double number) {
		if (number >= 0) {
			return (number);
		} else {
			return (number * -1);
		}
	} // Returns the absValue; method used for sqrt method.
	
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
	} // Returns the number inputed rounded to two decimals; method used for sqrt method and quadForm method.
	
	public static double sqrt(double number) {
		if (number < 0) {
			throw new IllegalArgumentException("Input must be positive.");
		} else {
			double estimate = (number / 2);
			while (Quadratic.absValue((estimate * estimate) - number) >= 0.005) {
				estimate = (0.5 * ((number / estimate) + estimate));
			}
			return Quadratic.round2(estimate);
		}
	} // Returns the estimated square root of a number; method used for quadForm method.
	
	public static String quadForm(double a, double b, double c) {
		if (Quadratic.discriminant(a, b, c) < 0) {
			return "no intercepts";
		} else if (b == 0 && c == 0) {
			return "0";
		} else if (Quadratic.discriminant(a, b, c) == 0) {
			double oneroot = ((b * -1) / (2 * a));
			return oneroot + "";
		} else {
			double discrim = Quadratic.discriminant(a, b, c);
			double tworoots1 = (((b * -1) + Quadratic.sqrt(discrim)) / (2 * a));
			double tworoots2 = (((b * -1) - Quadratic.sqrt(discrim)) / (2 * a));
			return "(" + Quadratic.round2(tworoots1) + ", 0)" + " and " + "(" + Quadratic.round2(tworoots2) + ", 0)";
		}
	} // Returns the intercepts of a quadratic function; method used for quadDescriber method.
	
	public static String quadDescriber(double a, double b, double c) {
		
		String equation = a + "^(2) + " + b + "x + " + c;
		String descriptionIntro = "This is the description of your equation: ";
		String directionOpened;
		String aos;
		String vertex;
		String xIntercepts;
		String yIntercept;
		
		if (a > 0) {
			directionOpened = "	This quadratic equation opens upward.";
		} else {
			directionOpened = "	This quadratic equation opens downward.";
		} // Returns what direction the graph opens by assigning the direction depending on the outcome of the if/else method.

		double x = -b / 2 * a;
		double y = a * (x * x) + (b * x) + c;
		vertex = "	Vertex = (" + x + ", " + y + ")"; // Returns vertex.
		
		aos = "	Axis of symmetry is at: x = ";
		aos += x;
		
		xIntercepts = "	The point(s) on the x-axis where the graph passes: ";
		xIntercepts += Quadratic.quadForm(a, b, c); // Returns the roots of the graph.
		
		yIntercept = "	The point on the y-axis where the graph passes: ";
		if (c > 0 || c < 0) {
			yIntercept += "(0, " + c + ")";
		} else {
			yIntercept += "no intercept";
		}
		
		System.out.println("Your equation: " + equation);	// Printing equation.
		System.out.println(""); // To make it neater.
		System.out.println(descriptionIntro); // Introducing the description a.k.a letting user know the next outputs are the descriptions.
		System.out.println(directionOpened); // Printing the direction the graph opens up.
		System.out.println(vertex); // Printing vertex.
		System.out.println(aos);
		System.out.println(xIntercepts); // Printing the roots.
		System.out.println(yIntercept); // Printing y-intercept.
		return "";
		
	}
}