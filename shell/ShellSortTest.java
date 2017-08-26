package com.wchy.structure.sort.shell;

import org.junit.Before;
import com.wchy.structure.sort.base.SortTest;

/**
 * 
* @ClassName ShellSortTest.java
* @Description 
* <p>
* 数字：希尔排序测试类.
* </p>
* <p>
* 详细描述.
* </p>
* <p>
* 示例代码.
* </p>
*
* @Author wchy.
* 
* @Date 2017年8月26日 下午7:48:09.
*
 */
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
