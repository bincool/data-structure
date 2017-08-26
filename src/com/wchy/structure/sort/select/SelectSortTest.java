package com.wchy.structure.sort.select;

import org.junit.Before;
import com.wchy.structure.sort.base.SortTest;

/**
 * 
* @ClassName SelectSortTest.java
* @Description 
* <p>
* 数字：选择排序测试类.
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
* @Date 2017年8月26日 下午7:47:21.
*
 */
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
