package com.wchy.structure.sort.select;

import com.wchy.structure.sort.base.NumberSort;

/**
 * 
* @ClassName SelectSort.java
* @Description 
* <p>
* ���֣�ѡ������.
* </p>
* <p>
* TODO ��ϸ����.
* </p>
* <p>
* TODO ʾ������.
* </p>
*
* @Author wchy.
* 
* @Date 2017��8��26�� ����7:46:51.
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
			
			// ��i+1~size-1�е���Сֵ�͵�iλ���н�����
			swap(i, indexMin);
		}
	}
	
}
