package array.model;

public class DebugDuck implements Comparable <DebugDuck>
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
	
	public int compareTo(DebugDuck compared)
	{
		int result = 0;
		
		if(this.equals(compared) || this.getQuestionCount() == compared.getQuestionCount())
		{
			return result;
		}
		else if(this.getQuestionCount() < compared.getQuestionCount())
		{
			result = -1;
		}
		else
		{
			result = 1;
		}
		
		return result;
	}
}
