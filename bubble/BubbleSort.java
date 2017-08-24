package com.wchy.structure.sort.bubble;

import com.wchy.structure.sort.base.NumberSort;

/**
 * ð������.
 * @author bingV
 *
 * @param <T>
 */
public class BubbleSort<T extends Number> extends NumberSort<T>
{
	
	public BubbleSort() 
	{
		super(10);
	}
	
	public BubbleSort(int initCapacity) 
	{
		super(initCapacity);
	}

	@Override
	public void sort() 
	{
		Number[] arr = this.getArr();
		
		// ð���������ѭ��1~size-1;�ڲ�ѭ��0-size-2
		for (int i = this.getSize() - 1; i > 0; i--) 
		{
			for (int j = 0; j < i; j++) 
			{
				if (compare(arr[j], arr[j + 1])) 
				{
					swap(j, j + 1);
				}
			}
		}
	}
	
}
