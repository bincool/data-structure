package com.wchy.structure.sort.insert;

import org.junit.Before;

import com.wchy.structure.sort.base.SortTest;

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
