//Tower and disks example with some constraints
package com.jetbrains;
import java.util.*;

public class Ques4
{
	public static void main(String[] args) throws Exception 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of disks: ");
		int n = input.nextInt();
		Tower[] myTower = new Tower[3];

		for (int i = 0; i < 3; i++) 
		{
			myTower[i] = new Tower(i);
		}

		for (int i = n-1; i >= 0; i--) 
		{
			myTower[0].add(i);
		}

		myTower[0].moveDisks(n, myTower[1], myTower[2]);
	}
}

class Tower
{
	int index;
	Stack<Integer> disks;

	public Tower(int i) 
	{
		disks = new Stack<Integer>();
		index = i;
	}

	public void moveDisks(int n, Tower source, Tower destination) throws Exception 
	{
		if (n > 0) 
		{
			moveDisks(n - 1, destination, source);
			moveTo(destination);
			source.moveDisks(n - 1, this, destination);
		} 
		else
			return;
	}

	private void moveTo(Tower destination) throws Exception 
	{
		int t = disks.pop();
		destination.add(t);
		t++;
		System.out.println("Now moving disk " + t + " from " + (this.index+1) + " to " + (destination.index+1));
	}

	public void add(int val) throws Exception 
	{
		if ((!disks.isEmpty()) && disks.peek() < val) 
		{
			throw new Exception("Error placing disk " + val);
		} 
		else 
		{
			disks.push(val);
		}
	}
}