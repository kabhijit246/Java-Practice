//concatenating two linked list objects of character.
package com.jetbrains;
import java.util.*;

public class ListConcatenate
{
	public static void main(String[] args) 
	{
		List<Character> list1 = new LinkedList<Character>();
		list1.add('H');
		list1.add('E');
		list1.add('L');
		list1.add('L');
		list1.add('O');

		List<Character> list2 = new LinkedList<Character>();
		list2.add('W');
		list2.add('O');
		list2.add('R');
		list2.add('L');
		list2.add('D');

		System.out.println("Elements present in the list1 initially: "+ list1);
		System.out.println("Elements present in the list2 initially: "+ list2);

		concatenate(list1, list2);
    }

	public static void concatenate(List l1, List l2)
	{
		l1.addAll(l2);
		System.out.println("Elements present in the list1 after concatenation: "+ l1);
	} 
}