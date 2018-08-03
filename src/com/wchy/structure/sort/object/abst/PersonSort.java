package com.wchy.structure.sort.object.abst;

import org.apache.log4j.Logger;
import com.wchy.structure.sort.base.Sort;
import com.wchy.structure.sort.object.bean.Person;

/**
 * 
* @ClassName PersonSort.java
* @Description 
* <p>
* 对象排序-抽象类.
* </p>
* <p>
* 详细描述：对person对象及其子类进行排序，按name进行排序.
* </p>
* <p>
* 示例代码.
* </p>
*
* @Author wchy.
* 
* @Date 2017年8月26日 下午7:48:41.
* 
* @param <T>
 */
public abstract class PersonSort<T extends Person> extends Sort<Person> 
{
	
	/**
	 * 日志对象.
	 */
	private final static Logger LOGGER = Logger.getLogger(PersonSort.class);
	
	/**
	 * 数组.
	 */
	private Person[] arr;
	
	/**
	 * 构造函数.
	 * @param initCapacity
	 */
	public PersonSort(int initCapacity) 
	{
		if (initCapacity < 1) 
		{
			LOGGER.error("The initCapacity must be greater than 0. This initCapacity is " + initCapacity);
			throw new IllegalArgumentException("The initCapacity must be greater than 0. This initCapacity is " + initCapacity);
		}
		arr = new Person[initCapacity];
		super.setArr(arr);
	}
	
	/**
	 * 待操作的数组，提供给子类-子类和父类指向同一块数组内存.
	 * @return
	 */
	public Person[] getArr() 
	{
		return arr;
	}

	@Override
	protected boolean compare(Person a, Person b) 
	{
		return a.getName().compareTo(b.getName()) > 0;
	}
	
	/**
	 * 
	* @Title: put 
	* @Description: 插入数据，提供给外部插入数据.
	* @param @param element 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	public void put(T element) 
	{
		insert(element);
	}

	@Override
	public void dispaly() 
	{
		for (int i = 0; i < getSize(); i++) 
		{
			LOGGER.info(arr[i]);
		}
	}

}
