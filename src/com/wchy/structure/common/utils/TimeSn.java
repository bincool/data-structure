package com.wchy.structure.common.utils;

/**
 * ������-������������.
 * @author bingV
 *
 */
public class TimeSn 
{
	
	/**
	 * ���������������Ӷ���.
	 */
	private static final TimeSn instance = new TimeSn();
	
	/**
	 * ��������.
	 */
	private static long sn = 1000;
	
	/**
	 * �м���������ٶ��������.
	 */
	private static final StringBuffer sb = new StringBuffer();
	
	/**
	 * ��ȡ���������������Ӷ���.
	 * @return
	 */
	public static TimeSn getInstance() 
	{
		return instance;
	}
	
	/**
	 * ��ȡ��������.
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
