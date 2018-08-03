package com.wchy.structure.common.utils;

/**
 * 单例类-生产递增种子.
 * @author bingV
 *
 */
public class TimeSn 
{
	
	/**
	 * 单例生产递增种子对象.
	 */
	private static final TimeSn instance = new TimeSn();
	
	/**
	 * 递增种子.
	 */
	private static long sn = 1000;
	
	/**
	 * 中间变量，减少对象的声明.
	 */
	private static final StringBuffer sb = new StringBuffer();
	
	/**
	 * 获取单例生产递增种子对象.
	 * @return
	 */
	public static TimeSn getInstance() 
	{
		return instance;
	}
	
	/**
	 * 获取递增种子.
	 * @return
	 */
	public long getSn() 
	{
		sb.delete(0, sb.length());
		sb.append(System.currentTimeMillis());
		sb.append(sn);
		if (sn == 10000) 
		{
			sn = 1000;
		} 
		else 
		{
			sn++;
		}
		return Long.parseLong(sb.toString());
	}

}
