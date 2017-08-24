package com.wchy.structure.sort.shell;

import com.wchy.structure.sort.base.NumberSort;

/**
* @ClassName ShellSort.java
* @Description 
* <p>
* ϣ������.
* </p>
* <p>
* ��ϸ����.
* </p>
* <p>
* ʾ������.
* </p>
*
* @Author wchy.
* 
* @Date 2017��8��22�� ����10:19:38.
* 
* @param <T>
 */
public class ShellSort<T extends Number> extends NumberSort<T> 
{

	public ShellSort() 
	{
		super(10);
	}
	
	public ShellSort(int initCapacity) 
	{
		super(initCapacity);
	}

	@Override
	public void sort() 
	{
		Number[] arr = getArr();
		int size = getSize();
		int h = 1;
		while (3 * h <= size) 
		{
			h = 3 * h + 1;
		}
		
		int i,j;
		Number current;
		while (h > 0) 
		{
			for (i = h; i < size; i++) 
			{
				// ��������,��඼�ֲ�����,���յ���С���Ϊ1.
				current = arr[i];
				for (j = i; j > h -1 && compare(arr[j - h], current); j -= h)
				{
					arr[j] = arr[j - h];
				}
				arr[j] = current;
			}
			h = (h-1) / 3;
		}
		
	}

}
