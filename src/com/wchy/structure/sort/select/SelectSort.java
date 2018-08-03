package com.wchy.structure.sort.select;

import com.wchy.structure.sort.base.NumberSort;

/**
 * 
* @ClassName SelectSort.java
* @Description 
* <p>
* 数字：选择排序.
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
* @Date 2017年8月26日 下午7:46:51.
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
