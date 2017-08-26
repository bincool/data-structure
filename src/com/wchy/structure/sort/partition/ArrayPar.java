package com.wchy.structure.sort.partition;

import org.apache.log4j.Logger;

import com.wchy.structure.sort.base.NumberSort;

/**
* @ClassName ArrayPar.java
* @Description 
* <p>
* 数字：划分算法.
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
* @Date 2017年8月23日 下午5:26:25.
* 
* @param <T>
 */
public class ArrayPar<T extends Number> extends NumberSort<T> 
{
	
	/**
	 * 日志对象.
	 */
	private final static Logger LOGGER = Logger.getLogger(ArrayPar.class);
	
	
	public ArrayPar() 
	{
		super(10);
	}
	
	public ArrayPar(int initCapacity) 
	{
		super(initCapacity);
	}

	@Override
	public void sort() 
	{
		int size = getSize();
		Number[] arr = getArr();
		Number pivot = arr[size/2];
		int pvoitIndex = partitionIt(0, size - 1, pivot);
		LOGGER.info(pvoitIndex + " numbers is smaller than " + pivot);
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
		int rightPtr = right + 1;
		while (true) 
		{
			while (leftPtr < right && compare(pivot, arr[++leftPtr])) 
			{
			}
			while (rightPtr > left && compare(arr[--rightPtr], pivot)) 
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
		}
		return leftPtr;
	}
	
}
