
public class Strings {
	public static void main(String[] args) {
		// 1. Create a String variable and initialize it to whatever you want
		String kaur= "Hello";
		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt
		// 3. Print the length of your String to the console.
		//    HINT: .length
		System.out.println(kaur.charAt(2));
		System.out.println(kaur.length());
		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops
		for(int i=0; i < kaur.length();i++){
			System.out.println(kaur.charAt(i));
		}
		for(int b=0;b<kaur.length();b++){
			if(kaur.charAt(b)=='o'){
				System.out.println(b);
			}
		}
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
		
	}
}

