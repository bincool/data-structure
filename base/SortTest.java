package com.wchy.structure.sort.base;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.wchy.structure.sort.base.NumberSort;

/**
 * 
* @ClassName SortTest.java
* @Description 
* <p>
* 排序测试-抽象类.
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
* @Date 2017年8月23日 下午11:50:21.
* 
* @param <T>
 */
public abstract class SortTest<T extends Number> 
{
	
	protected NumberSort<T> sortApp;
	
	protected static int defalutSize = 20;

	@Before
	public abstract void setUp() throws Exception;

	@After
	public void tearDown() throws Exception 
	{
		sortApp = null;
	}

	@Test
	public void testSort() 
	{
		sortApp.dispaly();
		sortApp.sort();
		sortApp.dispaly();
	}

}
