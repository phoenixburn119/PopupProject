package input.model;

public class Thing
{
	private String name;
	private int age;
	private double weight;
	
	public Thing()
	{
		age = -99;
		weight = -.05;
		name = "";
	}
	
	public Thing(String name, int age, double weight)
	{
		this.age = age;
		this.name = name;
		this.weight = weight;
	}
	
	/**
	 * Thee Getters will get the information you want.
	 * @return
	 */
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	/**
	 * The Setters will set the information replacing what you had.yyyyyyyyyyyyyyy
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	/**
	 * The toString method replaces the normal toString with your own.
	 */
 	public String toString()
	{
		String thingInfo = " name: " + name + " age: " + age + " weight: " + weight;
		return thingInfo;
	}
}
