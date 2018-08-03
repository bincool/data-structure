package com.wchy.structure.sort.insert;

import com.wchy.structure.sort.base.NumberSort;

/**
 * 
* @ClassName InsertSort.java
* @Description 
* <p>
* 数字：插入排序.
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
* @Date 2017年8月26日 下午7:42:23.
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
				// 移动位置，不能写成arr[j--] = arr[j - 1]，否则arr[2] = arr[1-1]
				// arr[j] = arr[j - 1];
				// --j;
				arr[j--] = arr[j];
			}
			arr[j] = current;
		}
	}

}
