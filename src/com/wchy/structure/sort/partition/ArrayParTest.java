package com.wchy.structure.sort.partition;

import org.junit.Before;
import com.wchy.structure.sort.base.SortTest;

/**
 * 
* @ClassName ArrayParTest.java
* @Description 
* <p>
* 数字：划分算法测试类.
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
* @Date 2017年8月26日 下午7:44:08.
*
 */
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
