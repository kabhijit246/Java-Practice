import java.util.Scanner;
public class Swap_Reverse{
	public static void main (String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String string = input.nextLine();

		String first = "";
        int i = 0;   
		for (i = 0; i < string.length();){
			while (string.charAt(i) != ' '){
				first = first + string.charAt(i);
				i++; 
			}
			break;
		}

		String last = "";
		int j = 0;
		for (j = string.length()-1; j >= i; j--){
			while (string.charAt(j) != ' '){
				last = string.charAt(j) + last;
				j--; 
			}
			break;
		}

		System.out.print(last);

		for (int k = j; k >= i; k--){
			System.out.print(string.charAt(k));
		}

		System.out.print(first);
	}
}