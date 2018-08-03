package com.wchy.structure.sort.quick;

import org.junit.Before;

import com.wchy.structure.sort.base.SortTest;

/**
 * 
* @ClassName QuickSortTest.java
* @Description 
* <p>
* 数字：快速排序测试类.
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
* @Date 2017年8月26日 下午7:46:24.
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
