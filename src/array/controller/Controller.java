package array.controller;

import array.view.Popup;

public class Controller
{
	private Popup view;
	
	public Controller()
	{
		this.view = new Popup();
	}
	
	public void start()
	{
//		stuffWithIntArray();
		stuffWithStringArray();
	}
	
	private void stuffWithIntArray()
	{
		int[] numbers = new int[5];
		
		numbers[4] = 12345;
		numbers[0] = 99999;
		numbers[2] = 1;
		numbers[3] = -4321;
		numbers[1] = 22;
		
		for(int index = 0; index < numbers.length; index++)
		{
			view.displayMessage("The index of " + index + " in the array contains the number: " + numbers[index]);
		}
		
		for(int index = numbers.length - 1; index >= 0; index--)
		{
			view.displayMessage("The index of " + index + " in the array contains the number: " + numbers[index]);
		}
		
		for(int value : numbers)
		{
			view.displayMessage("The current value is: " + value);
		}
		
//		view.displayMessage(numbers.toString());
	}
	
	private void stuffWithStringArray()
	{
		String[] inputs = new String[5];
		for(int index = 0; index < inputs.length; index++)
		{
			inputs[index] = view.askQuestion("Give me a word.");
		}
	}
}
