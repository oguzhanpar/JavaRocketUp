
public class Main {

	public static void main(String[] args) {

		String _name = "Ahmet";

		String _welcomeMessage = "Hoşgeldin !";

		String _show = showMessage(_name, _welcomeMessage);

		System.out.println(_show);

	}

	public static String showMessage(String name, String message) {

		return "Merhaba " + name + " " + message;

	}

}
