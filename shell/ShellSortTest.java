package com.wchy.structure.sort.shell;

import org.junit.Before;
import com.wchy.structure.sort.base.SortTest;

public class ShellSortTest extends SortTest<Integer>
{
	
	@Before
	public void setUp() throws Exception 
	{
		defalutSize = 11;
		sortApp = new ShellSort<Integer>(defalutSize);
		for(int i = 0; i < defalutSize; i++) 
		{
			sortApp.put((int)(Math.random()*99));
		}
	}

}
