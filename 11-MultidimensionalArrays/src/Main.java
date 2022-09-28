
public class Main {

	public static void main(String[] args) {

		String[][] cities = new String[3][3];

		cities[0][0] = "Ankara";
		cities[0][1] = "Konya";
		cities[0][2] = "Kayseri";

		cities[1][0] = "İstanbul";
		cities[1][1] = "Bursa";
		cities[1][2] = "Sakarya";

		cities[2][0] = "Trabzon";
		cities[2][1] = "Samsun";
		cities[2][2] = "Artvin";

		for (int i = 0; i <= 2; i++) {

			System.out.println("--------------");

			for (int j = 0; j <= 2; j++) {

				System.out.println(cities[i][j]);

			}

		}

	}

}
