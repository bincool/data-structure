package com.wchy.structure.sort.radix;

import org.junit.Before;

import com.wchy.structure.sort.base.SortTest;

/**
 * 
* @ClassName RadixSortTest.java
* @Description 
* <p>
* �������������.
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
* @Date 2017��8��27�� ����2:29:02.
*
 */
public class RadixSortTest extends SortTest<Integer> 
{
	
	/**
	 * d��ʾλ����1,2,3...
	 */
	private static int d = 2;

	@Before
	public void setUp() throws Exception 
	{
		defalutSize = 16;
		sortApp = new RadixSort(defalutSize, d);
		for (int i = 0; i < defalutSize; i++) 
		{
			sortApp.put((int)(Math.random()*(Math.pow(10, d) - 1)));
		}
	}

}
