package com.wchy.structure.sort.insert;

import com.wchy.structure.sort.base.NumberSort;

/**
 * ��������.
 * @author bingV
 *
 * @param <T>
 */
public class InsertSort<T extends Number> extends NumberSort<T> 
{
	
	public InsertSort() 
	{
		super(10);
	}
	
	public InsertSort(int initCapacity) 
	{
		super(initCapacity);
	}

	@Override
	public void sort() 
	{
		Number[] arr = this.getArr();
		int length = this.getSize();
		
		int i,j;
		for (i = 1; i < length; i++) 
		{
			j = i;
			Number current = arr[i];
			while (j > 0 && compare(arr[j - 1], current)) 
			{
				// �ƶ�λ�ã�����д��arr[j--] = arr[j - 1]������arr[2] = arr[1-1]
				// arr[j] = arr[j - 1];
				// --j;
				arr[j--] = arr[j];
			}
			arr[j] = current;
		}
	}

}
