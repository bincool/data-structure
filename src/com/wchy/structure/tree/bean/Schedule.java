package com.wchy.structure.tree.bean;

import com.wchy.structure.common.utils.TimeSn;

/**
 * 
* @ClassName Schedule.java
* @Description 
* <p>
* 日程表bean.
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
* @Date 2017年8月27日 下午8:04:07.
*
 */
public class Schedule 
{
	
	/**
	 * 日程ID.
	 */
	private long id;
	
	/**
	 * 日程标题.
	 */
	private String title;
	
	/**
	 * 日程地点.
	 */
	private String location;
	
	/**
	 * 日程开始时间.
	 */
	private String startDate;
	
	/**
	 * 日程结束时间.
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
	* @Description: 获取日程ID.
	* @param @return 设定文件. 
	* @return int 返回类型 .
	* @throws 
	* 		异常.
	 */
	public long getId() 
	{
		return id;
	}

	/**
	 * 
	* @Title: setId 
	* @Description: 设置日程ID.
	* @param @param id 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	public void setId(long id) 
	{
		this.id = id;
	}

	/**
	 * 
	* @Title: getTitle 
	* @Description: 获取日程标题.
	* @param @return 设定文件. 
	* @return String 返回类型 .
	* @throws 
	* 		异常.
	 */
	public String getTitle() 
	{
		return title;
	}

	/**
	 * 
	* @Title: setTitle 
	* @Description: 设置日程标题.
	* @param @param title 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	public void setTitle(String title) 
	{
		this.title = title;
	}

	/**
	 * 
	* @Title: getLocation 
	* @Description: 获取日程地点.
	* @param @return 设定文件. 
	* @return String 返回类型 .
	* @throws 
	* 		异常.
	 */
	public String getLocation() 
	{
		return location;
	}

	/**
	 * 
	* @Title: setLocation 
	* @Description: 设置日程地点.
	* @param @param location 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	public void setLocation(String location) 
	{
		this.location = location;
	}

	/**
	 * 
	* @Title: getStartDate 
	* @Description: 获取日程开始时间.
	* @param @return 设定文件. 
	* @return String 返回类型 .
	* @throws 
	* 		异常.
	 */
	public String getStartDate() 
	{
		return startDate;
	}

	/**
	 * 
	* @Title: setStartDate 
	* @Description: 设置日程开始时间.
	* @param @param startDate 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	public void setStartDate(String startDate) 
	{
		this.startDate = startDate;
	}

	/**
	 * 
	* @Title: getEndDate 
	* @Description: 获取日程结束时间.
	* @param @return 设定文件. 
	* @return String 返回类型 .
	* @throws 
	* 		异常.
	 */
	public String getEndDate() 
	{
		return endDate;
	}

	/**
	 * 
	* @Title: setEndDate 
	* @Description: 设置日程结束时间.
	* @param @param endDate 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
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
