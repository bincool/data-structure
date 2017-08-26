package com.wchy.structure.sort.bubble;

import com.wchy.structure.sort.base.NumberSort;

/**
 * 
* @ClassName BubbleSort.java
* @Description 
* <p>
* 数字：冒泡排序.
* </p>
* <p>
* 详细描述.
* </p>
* <p>
* 示例代码.
* </p>
*
* @Author wchy.
* 
* @Date 2017年8月26日 下午7:40:37.
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
		
		// 冒泡排序，外层循环1~size-1;内层循环0-size-2
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
