package com.wchy.structure.sort.select;

import com.wchy.structure.sort.base.NumberSort;

/**
 * 选择排序.
 * @author bingV
 *
 * @param <T>
 */
public class SelectSort<T extends Number> extends NumberSort<T> 
{
	
	public SelectSort() 
	{
		super(10);
	}
	
	public SelectSort(int initCapacity) 
	{
		super(initCapacity);
	}

	@Override
	public void sort() 
	{
		Number[] arr = this.getArr();
		int indexMin = 0;
		for (int i = 0; i < this.getSize() - 1; i++) 
		{
			indexMin = i;
			for (int j = i + 1; j < this.getSize(); j++) 
			{
				if (compare(arr[indexMin], arr[j])) 
				{
					indexMin = j;
				}
			}
			
			// 将i+1~size-1中的最小值和第i位进行交换。
			swap(i, indexMin);
		}
	}
	
}
