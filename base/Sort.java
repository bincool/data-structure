package com.wchy.structure.sort.base;

import org.apache.log4j.Logger;

/**
 * 
* @ClassName Sort.java
* @Description 
* <p>
* �����㷨������.
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
* @Date 2017��8��24�� ����12:45:28.
* 
* @param <T>
 */
public abstract class Sort<T> 
{
	/**
	 * ��־����.
	 */
	private final static Logger LOGGER = Logger.getLogger(Sort.class);
	
	/**
	 * ����.
	 */
	private T[] arr;
	
	/**
	 * ���ݸ���.
	 */
	private int size;

	/**
	 * �����������飬�ṩ������.
	 * @return
	 */
	protected void setArr(T[] arr) 
	{
		this.arr = arr;
	}

	/**
	 * �������������Ԫ�ظ���������.
	 * @return
	 */
	protected int getSize() 
	{
		return size;
	}

	/**
	 * �������ݵ����飬�ṩ������������Ԫ�ص�����.
	 * @param element
	 */
	protected void insert(T element) 
	{
		if (size == arr.length) 
		{
			String exceptionMsg = "The arr is full. The maxSize is " + arr.length;
			LOGGER.error(exceptionMsg);
			throw new RuntimeException(exceptionMsg);
		}
		arr[size++] = element;
	}
	
	/**
	 * ����ָ���±��ֵ���н������ṩ���ཻ������Ԫ��λ�õ�����.
	 * @param indexLeft
	 * @param indexRight
	 */
	protected void swap(int indexLeft, int indexRight) 
	{
		T temp = arr[indexLeft];
		arr[indexLeft] = arr[indexRight];
		arr[indexRight] = temp;
	}
	
	/**
	 * �Ƚ�����Number���͵Ĵ�С���ṩ����Ƚ�����Ԫ�ص�����.
	 * @param a
	 * @param b
	 * @return
	 * 		true:a����b;false:aС��b.
	 */
	protected abstract boolean compare(T a, T b);
	
	/**
	 * �������飬�������ͨ��getArr()��ȡ�������ã�Ȼ���޸Ķ������ .
	 */
	public abstract void sort();
	
	/**
	 * ��ӡ������.
	 */
	public abstract void dispaly();
	
}
