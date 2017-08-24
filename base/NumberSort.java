package com.wchy.structure.sort.base;

import org.apache.log4j.Logger;

/**
 * 
* @ClassName NumberSort.java
* @Description 
* <p>
* �����㷨������-Number�����Ͷ���������byte��short��int��long��double��float.char��boolean����Number������.
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
* @Date 2017��8��24�� ����12:46:05.
* 
* @param <T>
 */
public abstract class NumberSort<T extends Number> extends Sort<Number> 
{
	
	/**
	 * ��־����.
	 */
	private final static Logger LOGGER = Logger.getLogger(NumberSort.class);
	
	/**
	 * ����.
	 */
	private Number[] arr;
	
	/**
	 * ���캯��.
	 * @param initCapacity
	 */
	protected NumberSort(int initCapacity) 
	{
		if (initCapacity < 1) 
		{
			LOGGER.error("The initCapacity must be greater than 0. This initCapacity is " + initCapacity);
			throw new IllegalArgumentException("The initCapacity must be greater than 0. This initCapacity is " + initCapacity);
		}
		arr = new Number[initCapacity];
		
		// ���������ָ��ͬһ�������ڴ�����.
		super.setArr(arr);
	}
	
	/**
	 * �����������飬�ṩ������.
	 * @return
	 */
	protected Number[] getArr() 
	{
		return arr;
	}
	
	/**
	 * �Ƚ�����Number���͵Ĵ�С���ṩ����Ƚ�����Ԫ�ص�����.
	 * @param a
	 * @param b
	 * @return
	 * 		true:a����b;false:aС��b.
	 */
	protected boolean compare(Number a, Number b) 
	{
		return a.doubleValue() > b.doubleValue();
	}
	
	/**
	 * 
	* @Title: put 
	* @Description: �������ݣ��ṩ���ⲿ�������ݣ��˴���TԼ���ⲿ�������ͱ���ΪNumber������.
	* @param @param element �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	public void put(T element) 
	{
		insert(element);
	}
	
	/**
	 * ��ӡ������.
	 */
	public void dispaly() 
	{
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < getSize(); i++) 
		{
			sb.append(arr[i]).append(" ");
		}
		LOGGER.info(sb);
	}
	
}
