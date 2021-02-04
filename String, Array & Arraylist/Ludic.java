import java.util.*;  
  
public class Ludic {
	
	public static void main(String[] srgs){    
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println(getLudic(num)); 
    }  
  
    public static List<Integer> getLudic(int num){
        
        List<Integer> ludics = new ArrayList<Integer>(num); 
        
        for (int i = 1; i <= num; i++)  
            ludics.add(i); 
           
        for (int index = 1; index < ludics.size(); index++){
        	int first_ludic = ludics.get(index);
            int remove_index = index + first_ludic; 
            while (remove_index < ludics.size()){
                ludics.remove(remove_index);
                remove_index = remove_index + first_ludic - 1; 
            } 
        } 
        return ludics; 
    }
} 