
public class ParseName {

	public static void parseName(String s){
		int comma1 = s.indexOf(',');
		int comma2 = s.lastIndexOf(',');
		char[] lastName = new char[comma1];
		char[] firstName = new char[comma2 - comma1 - 1];
		char[] middleName = new char[s.length() - comma2 - 1];
		
		for(int i = 0; i < comma1; i++){
			lastName[i] = s.charAt(i);
		}
		
		int m = 0;
		for(int i = comma1+1; i < comma2; i++){
			firstName[m] = s.charAt(i);
			m++;
		}
		
		m = 0;
		for(int i = comma2+1; i < s.length(); i++){
			middleName[m] = s.charAt(i);
			m++;
		}
		
		String firstname = new String(firstName);
		String lastname = new String(lastName);
		String middlename = new String(middleName);
		System.out.println(firstname + " " + middlename + " " + lastname);
	}

	public static void main(String[] args) {
		parseName("Murphy,Dylan,Joseph");

	}

}
