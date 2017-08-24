package com.wchy.structure.sort.object.abst;

import org.apache.log4j.Logger;
import com.wchy.structure.sort.base.Sort;
import com.wchy.structure.sort.object.bean.Person;

public abstract class PersonSort<T extends Person> extends Sort<Person> 
{
	
	/**
	 * ��־����.
	 */
	private final static Logger LOGGER = Logger.getLogger(PersonSort.class);
	
	/**
	 * ����.
	 */
	private Person[] arr;
	
	/**
	 * ���캯��.
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
	 * �����������飬�ṩ������-����͸���ָ��ͬһ�������ڴ�.
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
	* @Description: �������ݣ��ṩ���ⲿ��������.
	* @param @param element �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
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
