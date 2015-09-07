import java.util.Scanner;

public class StringExercises {

	public static boolean forgivingPrompt(){
		System.out.println("Do you like Grinnell?");
		Scanner in = new Scanner(System.in);
		String response = in.nextLine();
		if(response.equalsIgnoreCase("Y") ||
				response.equalsIgnoreCase("Yes") ||
				response.equalsIgnoreCase("Yep")){
			return true;
		} else if(response.equalsIgnoreCase("N") ||
				response.equalsIgnoreCase("No") ||
				response.equalsIgnoreCase("Nope")){
			return false;
		} else{
			return forgivingPrompt();
		}
	}
	public static void main(String[] args) {
		if(forgivingPrompt()){
			System.out.println("You do like Grinnell");
		} else {
			System.out.println("You don't like Grinnell");
		}

	}

}
