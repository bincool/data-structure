package com.wchy.structure.sort.object.bean;

public class OldPerson extends Person 
{
	
	private String pension;
	
	public OldPerson() 
	{
	}
	
	public OldPerson(String name, String sex, int age, String pension) 
	{
		super(name, sex, age);
		this.pension = pension;
	}

	public String getPension() 
	{
		return pension;
	}

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
