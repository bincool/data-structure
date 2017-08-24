package com.wchy.structure.sort.object.insertsort;

import org.apache.log4j.Logger;

import com.wchy.structure.sort.object.abst.PersonSort;
import com.wchy.structure.sort.object.bean.Person;

public class PersonInsertSort<T extends Person> extends PersonSort<T> 
{
	
	/**
	 * ��־����.
	 */
	private final static Logger LOGGER = Logger.getLogger(PersonSort.class);

	public PersonInsertSort() 
	{
		super(10);
	}
	
	public PersonInsertSort(int initCapacity) 
	{
		super(initCapacity);
	}

	@Override
	public void sort() 
	{
		LOGGER.info("Begin to run the method of sort.");
		
		Person[] arr = this.getArr();
		int length = this.getSize();
		
		int i,j;
		for (i = 1; i < length; i++) 
		{
			j = i;
			Person current = arr[i];
			while (j > 0 && compare(arr[j - 1], current)) 
			{
				// �ƶ�λ�ã�����д��arr[j--] = arr[j - 1]������arr[2] = arr[1-1]
				// arr[j] = arr[j - 1];
				// --j;
				arr[j--] = arr[j];
			}
			arr[j] = current;
		}
		
		LOGGER.info("End to run the method of sort.");
	}

}
