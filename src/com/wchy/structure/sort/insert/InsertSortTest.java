package com.wchy.structure.sort.insert;

import org.junit.Before;

import com.wchy.structure.sort.base.SortTest;

/**
 * 
* @ClassName InsertSortTest.java
* @Description 
* <p>
* 数字：插入排序测试类.
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
* @Date 2017年8月26日 下午7:42:52.
*
 */
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
