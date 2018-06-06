package com;
/**
 * Stacks implementation using Linked List
 * @author Kee
 *
 */
public class Stack {

	int top;
	int max = 1000;
	LinkedList ll = new LinkedList();
	Stack()
	{
		
		top = -1;//indicate stack empty initially
	}
	
	public boolean push(int a)
	{
		top++;
		if(top < max)
		{
			ll.addAtFront(a);
			return true;
		}
		else
		{
			System.out.println("Stack overflowed");
			return false;
		}
		
	}
	public boolean pop()
	{
		if(top == -1)
		{
			System.out.println("Stack underflow");
			return false;
		}
		else
		{
			int removed = ll.removeAtFront();
			System.out.println("element poped : "+ removed);
			top--;
			return true;
		}
		
	}
	public int getSize()
	{
		
		return top+1;
	}
	public int get(int index)
	{
		int data;
	 data = ll.get(index);
	 return data;
	}
}
