package com.wchy.structure.sort.quick;

import com.wchy.structure.sort.base.NumberSort;

/**
 * 
* @ClassName QuickSort.java
* @Description 
* <p>
* 快速排序.
* </p>
* <p>
* TODO 详细描述.
* </p>
* <p>
* TODO 示例代码.
* </p>
*
* @Author wchy.
* 
* @Date 2017年8月23日 下午11:08:40.
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
	* @Description: 快速排序.
	* @param @param left
	* @param @param right 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
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
	* @Description: 划分算法.
	* @param @param left
	* @param @param right
	* @param @param pivot
	* @param @return 设定文件. 
	* @return int 返回类型 .
	* @throws 
	* 		异常.
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
