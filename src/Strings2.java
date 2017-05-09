
public class Strings2 {
	public static void main(String[] args) {
		// 1. Create a String variable and initialize it with
		//    random upper and lower case characters.
String kaur= "Chawla";
		// 2. Print your String to the console in upper case.
		kaur=kaur.toUpperCase();
		System.out.println(kaur);
		// 3. Print your String to the console in lower case.
		kaur=kaur.toLowerCase();
		System.out.println(kaur);
		// 4. Print the first 3 char's of your String
		//    HINT: .substring(start,end)
		kaur=kaur.substring(0, 3);
		System.out.println(kaur);
		// 5. Print a single char somewhere in the middle of your String
		//    REMINDER: char's in string start at index 0
		String kaur1="Chawla";
		kaur1=kaur1.substring(3,4);
		System.out.println(kaur1);
		// 6. BONUS -- print the LAST 3 char's of your string using
		//        .length() to determine WHERE the last 3 char's are located.
		String kaur2="Chawla";
		kaur2=kaur2.substring(kaur2.length()-3,kaur2.length());
		System.out.println(kaur2);
	}
	
}

