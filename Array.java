import java.util.Arrays;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

public class Array {
	int[] array;
	int es;
	
	public Array(int size) 
	{
		array = new int[size];
		es = 0;
	}

	public void add(int a)
	{
		if(es >= array.length)
		{
			System.out.println("Array is full!");
		}else {
			array[es++] = a;
		}
	}
	
	public int search(int a)
	{
		for(int i=0 ; i < array.length ; i++)
		{
			if(array[i] == a) 
			{
				return i;
			}
		}
		return -1;
	}
	
	public void del(int a)
	{
		int indis = this.search(a);
		
		if( indis == -1) 
		{
			System.out.println("Number Not Found!");
		}else
		{
			for( int i = indis ; i < es-1 ; i++)
			{
				array[i] = array[i+1];
			}
			
			array[--es] = 0;
		}
	}
	
	public void updt(int oldNumber, int newNumber)
	{
		int indis = this.search(oldNumber);
		
		if( indis == -1) 
		{
			System.out.println("Number Not Found!");
		}else
		{
			array[indis] = newNumber;
		}
		System.out.println("Updated!");
	}
	
	public void print()
	{
		System.out.println(" " + Arrays.toString(array));
	}
	
	
	
	
}
