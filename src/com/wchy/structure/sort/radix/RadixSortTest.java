package com.wchy.structure.sort.radix;

import org.junit.Before;

import com.wchy.structure.sort.base.SortTest;

/**
 * 
* @ClassName RadixSortTest.java
* @Description 
* <p>
* 基数排序测试类.
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
* @Date 2017年8月27日 下午2:29:02.
*
 */
public class RadixSortTest extends SortTest<Integer> 
{
	
	/**
	 * d表示位数：1,2,3...
	 */
	private static int d = 2;

	@Before
	public void setUp() throws Exception 
	{
		defalutSize = 16;
		sortApp = new RadixSort(defalutSize, d);
		for (int i = 0; i < defalutSize; i++) 
		{
			sortApp.put((int)(Math.random()*(Math.pow(10, d) - 1)));
		}
	}

}
