package com.wchy.structure.sort.quick;

import org.junit.Before;

import com.wchy.structure.sort.base.SortTest;

/**
 * 
* @ClassName QuickSortTest.java
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
* @Date 2017��8��26�� ����7:46:24.
*
 */
public class QuickSortTest extends SortTest<Integer>
{

	@Before
	public void setUp() throws Exception 
	{
		defalutSize = 16;
		sortApp = new QuickSort<Integer>(defalutSize);
		for (int i = 0; i < defalutSize; i++) 
		{
			sortApp.put((int)(Math.random()*99));
		}
	}

}
