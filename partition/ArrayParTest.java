package com.wchy.structure.sort.partition;

import org.junit.Before;
import com.wchy.structure.sort.base.SortTest;

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
