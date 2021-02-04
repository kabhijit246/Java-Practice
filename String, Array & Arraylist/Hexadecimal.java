import java.util.Scanner;
public class Hexadecimal{
	public static void main (String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String string = input.nextLine();

		String hexadecimal = ""; 
        for (int i = 0; i < string.length(); i++){
        	char ch = string.charAt(i); 
            int ascii = (int)ch;
            String hex = Integer.toHexString(ascii); 
            hexadecimal += hex; 
        }
     System.out.println(hexadecimal);
	}
}