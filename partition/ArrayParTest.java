package com.wchy.structure.sort.partition;

import org.junit.Before;
import com.wchy.structure.sort.base.SortTest;

/**
 * 
* @ClassName ArrayParTest.java
* @Description 
* <p>
* ���֣������㷨������.
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
* @Date 2017��8��26�� ����7:44:08.
*
 */
public class ArrayParTest extends SortTest<Integer>
{

	@Before
	public void setUp() throws Exception 
	{
		defalutSize = 16;
		sortApp = new ArrayPar<Integer>(defalutSize);
		for (int i = 0; i < defalutSize; i++) 
		{
			sortApp.put((int)(Math.random()*99));
		}
	}

}
