package com.wchy.structure.sort.base;

import org.apache.log4j.Logger;

/**
 * 
* @ClassName Sort.java
* @Description 
* <p>
* 排序算法抽象类.
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
* @Date 2017年8月24日 上午12:45:28.
* 
* @param <T>
 */
public abstract class Sort<T> 
{
	/**
	 * 日志对象.
	 */
	private final static Logger LOGGER = Logger.getLogger(Sort.class);
	
	/**
	 * 数组.
	 */
	private T[] arr;
	
	/**
	 * 数据个数.
	 */
	private int size;

	/**
	 * 待操作的数组，提供给子类.
	 * @return
	 */
	protected void setArr(T[] arr) 
	{
		this.arr = arr;
	}

	/**
	 * 保护操作数组的元素个数，仅读.
	 * @return
	 */
	protected int getSize() 
	{
		return size;
	}

	/**
	 * 插入数据到数组，提供子类新增数组元素的能力.
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
	 * 将两指定下标的值进行交换，提供子类交换数组元素位置的能力.
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
	 * 比较两个Number类型的大小，提供子类比较数组元素的能力.
	 * @param a
	 * @param b
	 * @return
	 * 		true:a大于b;false:a小于b.
	 */
	protected abstract boolean compare(T a, T b);
	
	/**
	 * 排序数组，子类可以通过getArr()获取数组引用，然后修改对其进行 .
	 */
	public abstract void sort();
	
	/**
	 * 打印数组结果.
	 */
	public abstract void dispaly();
	
}
