package coreJavaTest;
import java.util.*; 

public class Ques1 
{ 
	public static void main(String args[]) 
    { 
        Stack<Integer> stack = new Stack<Integer>(); 
        stack.push(12); 
        stack.push(6); 
        stack.push(78); 
        stack.push(36); 
        stack.push(18); 
        
        System.out.print("Stack before sorting: "); 
        System.out.println(stack);
        
        Stack<Integer> temp = sortStack(stack); 
        System.out.print("Stack after sorting: "); 
        System.out.println(temp);
    }
    public static Stack<Integer> sortStack(Stack<Integer> stack) 
    { 
        Stack<Integer> tempStack = new Stack<Integer>(); 
      
        while(!stack.isEmpty()) 
        { 
            int num = stack.pop();
            while(!tempStack.isEmpty() && tempStack.peek() > num) 
            {
            	stack.push(tempStack.pop()); 
            } 
            tempStack.push(num); 
        } 
        return tempStack; 
    } 
} 