package com.wchy.structure.sort.bubble;

import org.junit.Before;
import com.wchy.structure.sort.base.SortTest;

/**
 * 
* @ClassName BubbleSortTest.java
* @Description 
* <p>
* 数字：冒泡排序测试类.
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
* @Date 2017年8月26日 下午7:41:05.
*
 */
public class BubbleSortTest extends SortTest<Integer>
{

	@Before
	public void setUp() throws Exception 
	{
		sortApp = new BubbleSort<Integer>(defalutSize);
		for (int i = 0; i < defalutSize; i++) 
		{
			sortApp.put((int)(Math.random()*99));
		}
	}

}
