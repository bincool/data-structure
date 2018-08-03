package com.wchy.structure.sort.object.bean;

/**
 * 
* @ClassName OldPerson.java
* @Description 
* <p>
* 老人.
* </p>
* <p>
* 详细描述：老人，继承于person，多了退休金.
* </p>
* <p>
* 示例代码.
* </p>
*
* @Author wchy.
* 
* @Date 2017年8月26日 下午7:49:46.
*
 */
public class OldPerson extends Person 
{
	
	/**
	 * 退休金.
	 */
	private String pension;
	
	public OldPerson() 
	{
	}
	
	public OldPerson(String name, String sex, int age, String pension) 
	{
		super(name, sex, age);
		this.pension = pension;
	}

	/**
	 * 
	* @Title: getPension 
	* @Description: 获取退休金.
	* @param @return 设定文件. 
	* @return String 返回类型 .
	* @throws 
	* 		异常.
	 */
	public String getPension() 
	{
		return pension;
	}

	/**
	 * 
	* @Title: setPension 
	* @Description: 设置退休金.
	* @param @param pension 设定文件. 
	* @return void 返回类型 .
	* @throws 
	* 		异常.
	 */
	public void setPension(String pension) 
	{
		this.pension = pension;
	}

	@Override
	public String toString() 
	{
		return "OldPerson [id=" + this.getId() + ", name=" + this.getName() + ", sex=" + this.getSex() + ", age=" + this.getAge() + ", pension=" + this.getPension() + "]";
	}

}
