public class Pattern{
	public static void main(String[] args){
        int i, j, k;
		for (i = 1; i <= 5; i++){
				for(k = 10-2*i; k > 0; k--){
					System.out.print(" ");
				}
				for (j = 1; j <= i*2; j++){
					System.out.print("- ");
			    }
			System.out.println();
		}

		for (i = 4; i >= 1; i--){
			for (k = 10-i*2; k > 0; k--){
				System.out.print(" ");
			}
			for(j = i*2; j > 0; j--){
				System.out.print("- ");
			}
			System.out.println();
		}
	}
}