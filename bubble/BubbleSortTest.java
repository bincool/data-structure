package com.wchy.structure.sort.bubble;

import org.junit.Before;
import com.wchy.structure.sort.base.SortTest;

/**
 * 
* @ClassName BubbleSortTest.java
* @Description 
* <p>
* ���֣�ð�����������.
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
* @Date 2017��8��26�� ����7:41:05.
*
 */
public class BubbleSortTest extends SortTest<Integer>
{

	@Before
	public void setUp() throws Exception 
	{
		sortApp = new BubbleSort<Integer>(defalutSize);
		for (int i = 0; i < defalutSize; i++) 
		{
			sortApp.put((int)(Math.random()*99));
		}
	}

}
