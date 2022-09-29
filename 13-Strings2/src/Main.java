
public class Main {

	public static void main(String[] args) {
		

		String name = "Oğuzhan Parlak";
		
		String newName = name.replace(" ", "-"); //replace spaces with "-"
		
		System.out.println(newName);
		
		System.out.println(name.substring(8,14)); // returns between 8th and 14th letters
		
		for (String word : name.split(" ")) { //it splits spaces returns words
			
			System.out.println(word);
			
		}
		
		System.out.println(name.toLowerCase()); //returns all letters lower case
		
		System.out.println(name.toUpperCase()); //returns all letters upper case

		
		String spacedName = "     Oğuzhan Parlak     ";
		
		System.out.println(spacedName.trim());	//returns name with clean begin/end spaces
		

	}

}
