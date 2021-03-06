package com.wchy.structure.sort.object.insertsort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.wchy.structure.sort.object.abst.PersonSort;
import com.wchy.structure.sort.object.bean.OldPerson;
import com.wchy.structure.sort.object.bean.Person;

/**
 * 
* @ClassName PersonInsertSortTest.java
* @Description 
* <p>
* �ˣ��������������.
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
* @Date 2017��8��26�� ����8:01:58.
*
 */
public class PersonInsertSortTest 
{

	private PersonSort<Person> personSort;

	@Before
	public void setUp() throws Exception 
	{
		personSort = new PersonInsertSort<Person>(100);
	}
	
	@After
	public void tearDown() throws Exception 
	{
		personSort = null;
	}

	@Test
	public void testSort() 
	{
		personSort.put(new Person("Patty", "M", 24));
		personSort.put(new OldPerson("Doc", "M", 59, "600.00"));
		personSort.put(new Person("Lorraine", "F", 37));
		personSort.put(new Person("Paul", "M", 37));
		personSort.put(new Person("Tom", "M", 43));
		personSort.put(new Person("Sato", "M", 21));
		personSort.put(new Person("Henry", "M", 29));
		personSort.put(new OldPerson("Jose", "M", 72, "800.00"));
		personSort.put(new Person("Minh", "M", 22));
		personSort.put(new Person("Lucinda", "F", 18));
		
		personSort.dispaly();
		personSort.sort();
		personSort.dispaly();
	}

}
