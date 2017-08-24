package com.wchy.structure.sort.quick;

import org.junit.Before;

import com.wchy.structure.sort.base.SortTest;

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
