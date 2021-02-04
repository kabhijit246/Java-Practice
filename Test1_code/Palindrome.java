package test1;

public class Palindrome 
{
	public static void main(String[] args) 
	{
        String s = "abhijit";
        System.out.println(Palindrome.palindrome(s));
    }

    static int palindrome(String s)
    {
        int[] occ = new int[257];
        for(int i = 0; i < s.length(); i++)
        {
            occ[s.charAt(i)] ++;
        }

        int odd = 0;
        for (int j : occ) {
            odd += j % 2 == 0 ? 0 : 1;
        }
        return (odd - 1);
    }
}
