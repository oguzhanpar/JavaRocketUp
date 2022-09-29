
public class Main {

	public static void main(String[] args) {

		String message = "My name is Oğuzhan Parlak !";

		System.out.println("Message: " + message); // prints full message
		System.out.println("Number of character : " + message.length()); // counts the character of message
		System.out.println("4th character : " + message.charAt(4)); // return the 4th character
		System.out.println(message.concat(" --Welcome On Board-- ")); // it adds message + new string
		System.out.println(message.startsWith("M")); // if the message's first character is 'M' it returns true
		System.out.println(message.endsWith("!")); // if the message's last character is '!' it returns true

		char[] characters = new char[5];

		message.getChars(0, 5, characters, 0); // returns the first 5 character
		System.out.println(characters);

		System.out.println(message.indexOf("am")); // return the character index number
		System.out.println(message.lastIndexOf("a")); // return the character index number starts with end

	}

}
