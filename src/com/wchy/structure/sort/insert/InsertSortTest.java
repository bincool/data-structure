package com.wchy.structure.sort.insert;

import org.junit.Before;

import com.wchy.structure.sort.base.SortTest;

/**
 * 
* @ClassName InsertSortTest.java
* @Description 
* <p>
* ���֣��������������.
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
* @Date 2017��8��26�� ����7:42:52.
*
 */
public class InsertSortTest extends SortTest<Integer>
{

	@Before
	public void setUp() throws Exception 
	{
		defalutSize = 10;
		sortApp = new InsertSort<Integer>();
		for (int i = 0; i < defalutSize; i++) 
		{
			sortApp.put((int)(Math.random()*99));
		}
	}

}
