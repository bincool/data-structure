package com.wchy.structure.sort.select;

import org.junit.Before;
import com.wchy.structure.sort.base.SortTest;

public class SelectSortTest extends SortTest<Float>
{

	@Before
	public void setUp() throws Exception 
	{
		sortApp = new SelectSort<Float>();
		for (int i = 0; i < defalutSize/2; i++) 
		{
			sortApp.put((float)(Math.random()*99));
		}
	}

}
