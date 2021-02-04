//Generic method example
package com.jetbrains;

public class Ques1
{
	public static void main(String[] args)
	{
		Integer[] intArray = {42, 16, 78, 34, 109, 61, 100};
		Double[] doubleArray = {10.4, 41.3, 83.14, 26.81, 43.17, 21.9, 97.64};
		Character[] charArray = {'G', 'E', 'N', 'E', 'R', 'I', 'C', ' ', 'W', 'O', 'R', 'L', 'D'};

		System.out.println("Array intArray contains: ");
		printArray(intArray);

		System.out.println("Array doubleArray contains: ");
		printArray(doubleArray);

		System.out.println("Array charArray contains: ");
		printArray(charArray);
	}

	public static <E> void printArray(E[] array)
	{
		for(E i : array)
		{
			System.out.printf("%s ", i);
		}
		System.out.println();
	}
}