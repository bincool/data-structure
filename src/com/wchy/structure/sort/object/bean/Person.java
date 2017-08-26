package com.wchy.structure.sort.object.bean;

import com.wchy.structure.common.TimeSn;

/**
 * 
* @ClassName Person.java
* @Description 
* <p>
* 人.
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
* @Date 2017年8月26日 下午7:54:46.
*
 */
public class Person 
{
	
	/**
	 * ID.
	 */
	private long id;
	
	/**
	 * 姓名.
	 */
	private String name;
	
	/**
	 * 性别.
	 */
	private String sex;
	
	/**
	 * 年龄.
	 */
	private int age;
	
	public Person() 
	{
	}
	
	public Person(String name, String sex, int age) 
	{
		/**
		 * 用单例递增种子.
		 */
		this.id = TimeSn.getInstance().getSn();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	/**
	 * 
	* @Title: getId 
	* @Description: 获取ID.
	* @param @return 设定文件. 
	* @return long 返回类型 .
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
	* @Description: 设置ID.
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
	* @Title: getName 
	* @Description: 获取姓名.
	* @param @return 设定文件. 
	* @return String 返回类型 .
	* @throws 
	* 		异常.
	 */
	public String getName() 
	{
		return name;
	}

	/**
	 * 
	* @Title: setName 
	* @Description: 设置姓名
	* @param @param name 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	public void setName(String name) 
	{
		this.name = name;
	}

	/**
	 * 
	* @Title: getSex 
	* @Description: 获取性别.
	* @param @return 设定文件. 
	* @return String 返回类型 .
	* @throws 
	* 		异常.
	 */
	public String getSex() 
	{
		return sex;
	}

	/**
	 * 
	* @Title: setSex 
	* @Description: 设置性别.
	* @param @param sex 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	public void setSex(String sex) 
	{
		this.sex = sex;
	}

	/**
	 * 
	* @Title: getAge 
	* @Description: 获取年龄.
	* @param @return 设定文件. 
	* @return int 返回类型 .
	* @throws 
	* 		异常.
	 */
	public int getAge() 
	{
		return age;
	}

	/**
	 * 
	* @Title: setAge 
	* @Description: 设置年龄.
	* @param @param age 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	public void setAge(int age) 
	{
		this.age = age;
	}

	@Override
	public String toString() 
	{
		return "Person [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	
}
