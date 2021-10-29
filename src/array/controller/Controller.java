package array.controller;

import array.view.Popup;

public class Controller
{
	private Popup view;
	private String[] sample;
	
	public Controller()
	{
		this.sample = new String[6];
		this.view = new Popup();
		fillTheArray(sample);
	}
	
	private void fillTheArray(int[] nums)
	{
		for(int index = 0; index < nums.length; index++)
		{
			try
			{
				nums[index] = Integer.parseInt(view.askQuestion("What number should go in the array?"));
			}
			catch(java.lang.NumberFormatException e)
			{
				nums[index] = 0;
			}
		}
	}
	
	private void fillTheArray(String[] words)
	{
		for(int index = 0; index < words.length; index++)
		{
			words[index] = view.askQuestion("What should go in the array?");
		}
	}
	
	private void displayArrayContents(int[] nums)
	{
		for(int num : nums)
		{
			view.displayMessage("The current number is: " + num);
		}
	}
	
	private void displayArrayContents(String[] words)
	{
		for(String word : words)
		{
			view.displayMessage(word);
		}
	}
	
	public void start(String[] contents)
	{
		displayArrayContents(contents);
		contents[2] = view.askQuestion("What should we replace index 2 with?");
		displayArrayContents(contents);
	}
	
	public void start()
	{
		displayArrayContents(sample);
		stuffWithIntArray();
		stuffWithStringArray();
	}
	
	private void stuffWithIntArray()
	{
		int[] numbers = new int[5];
		
		fillTheArray(numbers);
		
		displayArrayContents(numbers);
		
//		for(int index = numbers.length - 1; index >= 0; index--)
//		{
//			view.displayMessage("The index of " + index + " in the array contains the number: " + numbers[index]);
//		}
//		
//		for(int value : numbers)
//		{
//			view.displayMessage("The current value is: " + value);
//		}
		
//		view.displayMessage(numbers.toString());
	}
	
	private void stuffWithStringArray()
	{
		String[] inputs = new String[5];
		fillTheArray(inputs);
		displayArrayContents(inputs);
	}
	
	private int findMin(int[] nums)
	{
		int min = Integer.MAX_VALUE;
		for(int num : nums)
		{
			if(num<min)
			{
				min = num;
			}
		}
		return min;
	}
	
	private int findMax(int[] nums)
	{
		int max;
		if(nums.length > 0)
		{
			max = nums[0];
			for(int i = 1; i < nums.length; i++)
			{
				if(nums[i] > max)
				{
					max = nums[i];
				}
			}
		}
		else
		{
			max = Integer.MIN_VALUE;
		}
		return max;
	}
}
