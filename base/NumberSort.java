package com.wchy.structure.sort.base;

import org.apache.log4j.Logger;

/**
 * 
* @ClassName NumberSort.java
* @Description 
* <p>
* 排序算法抽象类-Number子类型都可以排序：byte、short、int、long、double、float.char、boolean不是Number的子类.
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
* @Date 2017年8月24日 上午12:46:05.
* 
* @param <T>
 */
public abstract class NumberSort<T extends Number> extends Sort<Number> 
{
	
	/**
	 * 日志对象.
	 */
	private final static Logger LOGGER = Logger.getLogger(NumberSort.class);
	
	/**
	 * 数组.
	 */
	private Number[] arr;
	
	/**
	 * 构造函数.
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
		
		// 父类和子类指向同一个数组内存区域.
		super.setArr(arr);
	}
	
	/**
	 * 待操作的数组，提供给子类.
	 * @return
	 */
	protected Number[] getArr() 
	{
		return arr;
	}
	
	/**
	 * 比较两个Number类型的大小，提供子类比较数组元素的能力.
	 * @param a
	 * @param b
	 * @return
	 * 		true:a大于b;false:a小于b.
	 */
	protected boolean compare(Number a, Number b) 
	{
		return a.doubleValue() > b.doubleValue();
	}
	
	/**
	 * 
	* @Title: put 
	* @Description: 插入数据，提供给外部插入数据，此处的T约束外部输入类型必须为Number的子类.
	* @param @param element 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	public void put(T element) 
	{
		insert(element);
	}
	
	/**
	 * 打印数组结果.
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
