package com.wchy.structure.sort.partition;

import org.apache.log4j.Logger;

import com.wchy.structure.sort.base.NumberSort;

/**
* @ClassName ArrayPar.java
* @Description 
* <p>
* ���֣������㷨.
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
* @Date 2017��8��23�� ����5:26:25.
* 
* @param <T>
 */
public class ArrayPar<T extends Number> extends NumberSort<T> 
{
	
	/**
	 * ��־����.
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
