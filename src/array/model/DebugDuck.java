package array.model;

public class DebugDuck
{
	private String name;
	private int questionCount;
	private String color;
	
	public DebugDuck(String name)
	{
		this.name = name;
		this.questionCount = 0;
		this.color = "white";
	}
	
	public DebugDuck(String name, String color)
	{
		this.name = name;
		this.questionCount = 0;
		this.color = color;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getQuestionCount()
	{
		return this.questionCount;
	}
	
	public String getColor()
	{
		return this.color;
	}
	
	public void setQuestionCount(int questionCount)
	{
		this.questionCount = questionCount;
	}
	
	
}
