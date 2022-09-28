
public class Main {

	public static void main(String[] args) {

		// DEMO APP - Find The Greatest Height Value
		double[] height = { 1.72, 1.64, 1.55, 1.78, 1.43 };

		double max = height[0];

		double total = 0;

		for (double d : height) {

			if (max < d) {

				max = d;

			}

			total = total + d;
			System.out.println(d);

		}

		System.out.println("Total = " + total);

		System.out.println("The Greatest is = " + max);

	}

}
