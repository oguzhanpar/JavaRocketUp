
public class Main {

	public static void main(String[] args) {

		String[] apps = new String[3];

		apps[0] = "Twitter";
		apps[1] = "Facebook";
		apps[2] = "Instagram";

		// For Loop
		for (int i = 0; i < apps.length; i++) {

			System.out.println(apps[i]);

		}

		// ForEach Loop
		for (String app : apps) {

			System.out.println(app);
		}

	}

}
