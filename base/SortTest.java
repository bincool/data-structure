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
* �����������-������.
* </p>
* <p>
* ��ϸ����.
* </p>
* <p>
* ʾ������.
* </p>
*
* @Author wchy.
* 
* @Date 2017��8��23�� ����11:50:21.
* 
* @param <T>
 */
public abstract class SortTest<T extends Number> 
{
	
	// ��������ӿ�.
	protected NumberSort<T> sortApp;
	
	// �����������Ĭ�ϴ�С.
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
