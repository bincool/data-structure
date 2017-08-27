package com.wchy.structure.tree.bean;

import com.wchy.structure.common.utils.TimeSn;

/**
 * 
* @ClassName Schedule.java
* @Description 
* <p>
* �ճ̱�bean.
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
* @Date 2017��8��27�� ����8:04:07.
*
 */
public class Schedule 
{
	
	/**
	 * �ճ�ID.
	 */
	private long id;
	
	/**
	 * �ճ̱���.
	 */
	private String title;
	
	/**
	 * �ճ̵ص�.
	 */
	private String location;
	
	/**
	 * �ճ̿�ʼʱ��.
	 */
	private String startDate;
	
	/**
	 * �ճ̽���ʱ��.
	 */
	private String endDate;
	
	public Schedule() 
	{
	}
	
	public Schedule(String title, String location, String startDate, String endDate) 
	{
		this.id = TimeSn.getInstance().getSn();
		this.title = title;
		this.location = location;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	/**
	 * 
	* @Title: getId 
	* @Description: ��ȡ�ճ�ID.
	* @param @return �趨�ļ�. 
	* @return int �������� .
	* @throws 
	* 		�쳣.
	 */
	public long getId() 
	{
		return id;
	}

	/**
	 * 
	* @Title: setId 
	* @Description: �����ճ�ID.
	* @param @param id �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	public void setId(long id) 
	{
		this.id = id;
	}

	/**
	 * 
	* @Title: getTitle 
	* @Description: ��ȡ�ճ̱���.
	* @param @return �趨�ļ�. 
	* @return String �������� .
	* @throws 
	* 		�쳣.
	 */
	public String getTitle() 
	{
		return title;
	}

	/**
	 * 
	* @Title: setTitle 
	* @Description: �����ճ̱���.
	* @param @param title �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	public void setTitle(String title) 
	{
		this.title = title;
	}

	/**
	 * 
	* @Title: getLocation 
	* @Description: ��ȡ�ճ̵ص�.
	* @param @return �趨�ļ�. 
	* @return String �������� .
	* @throws 
	* 		�쳣.
	 */
	public String getLocation() 
	{
		return location;
	}

	/**
	 * 
	* @Title: setLocation 
	* @Description: �����ճ̵ص�.
	* @param @param location �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	public void setLocation(String location) 
	{
		this.location = location;
	}

	/**
	 * 
	* @Title: getStartDate 
	* @Description: ��ȡ�ճ̿�ʼʱ��.
	* @param @return �趨�ļ�. 
	* @return String �������� .
	* @throws 
	* 		�쳣.
	 */
	public String getStartDate() 
	{
		return startDate;
	}

	/**
	 * 
	* @Title: setStartDate 
	* @Description: �����ճ̿�ʼʱ��.
	* @param @param startDate �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	public void setStartDate(String startDate) 
	{
		this.startDate = startDate;
	}

	/**
	 * 
	* @Title: getEndDate 
	* @Description: ��ȡ�ճ̽���ʱ��.
	* @param @return �趨�ļ�. 
	* @return String �������� .
	* @throws 
	* 		�쳣.
	 */
	public String getEndDate() 
	{
		return endDate;
	}

	/**
	 * 
	* @Title: setEndDate 
	* @Description: �����ճ̽���ʱ��.
	* @param @param endDate �趨�ļ�. 
	* @return void �������� .
	* @throws 
	* 		�쳣.
	 */
	public void setEndDate(String endDate) 
	{
		this.endDate = endDate;
	}

	@Override
	public String toString() 
	{
		return "Schedule [id=" + id + ", title=" + title + ", location=" + location + ", startDate=" + startDate
				+ ", endDate=" + endDate + "]";
	}
	
}
