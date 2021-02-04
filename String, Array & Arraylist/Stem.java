import java.util.*; 
  
public class Stem { 
  
    public static String findStem(String array[]) { 
        
        int n = array.length; 
       
        String s = array[0]; 
        int len = s.length(); 
  
        String res = ""; 
        for (int i = 0; i < len; i++) { 
            for (int j = i + 1; j <= len; j++) { 
  
                String stem = s.substring(i, j); 
                int k = 1; 
                for (k = 1; k < n; k++) {
                    if (!array[k].contains(stem)) 
                        break; 
                } 

                if (k == n && res.length() < stem.length()) 
                    res = stem; 
            } 
        } 
        return res; 
    } 

    public static void main(String args[]) 
    { 
        String array[] = { "sadness", "sad", "sadly" }; 
        String stems = findStem(array); 
        System.out.println(stems); 
    } 
} 