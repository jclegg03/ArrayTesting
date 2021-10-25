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
		stuffWithIntArray();
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
	}
	
	private void stuffWithStringArray()
	{
		
	}
}
