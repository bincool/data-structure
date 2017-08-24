package com.wchy.structure.sort.quick;

import com.wchy.structure.sort.base.NumberSort;

/**
 * 
* @ClassName QuickSort.java
* @Description 
* <p>
* ��������.
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
* @Date 2017��8��23�� ����11:08:40.
* 
* @param <T>
 */
public class QuickSort<T extends Number> extends NumberSort<T> 
{
	
	protected QuickSort() 
	{
		super(10);
	}

	protected QuickSort(int initCapacity) 
	{
		super(initCapacity);
	}

	@Override
	public void sort() 
	{
		quickSort(0, getSize() - 1);
	}
	
	/**
	 * 
	* @Title: quickSort 
	* @Description: ��������.
	* @param @param left
	* @param @param right �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	private void quickSort(int left, int right) 
	{
		if (left >= right) 
		{
			return;
		} 
		else 
		{
			Number pivot = getArr()[right];
			int partition = partitionIt(left, right, pivot);
			quickSort(left, partition - 1);
			quickSort(partition + 1, right);
		}
	}
	
	/**
	 * 
	* @Title: partitionIt 
	* @Description: �����㷨.
	* @param @param left
	* @param @param right
	* @param @param pivot
	* @param @return �趨�ļ�. 
	* @return int �������� .
	* @throws 
	* 		�쳣.
	 */
	private int partitionIt(int left, int right, Number pivot) 
	{
		Number[] arr = getArr();
		int leftPtr = left - 1;
		int rightPtr = right;
		while (true) 
		{
			while (compare(pivot, arr[++leftPtr])) 
			{
			}
			while (rightPtr > 0 && compare(arr[--rightPtr], pivot)) 
			{
			}
			if (leftPtr >= rightPtr) 
			{
				break;
			} 
			else
			{
				swap(leftPtr, rightPtr);
			}
			
			swap(leftPtr, rightPtr);
		}
		return leftPtr;
	}
	
}
