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
}
