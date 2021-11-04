package array.controller;

import java.util.ArrayList;
import array.view.Popup;

public class Controller
{
	private Popup view;
	private String[] sample;
	
	public Controller()
	{
		this.sample = new String[6];
		this.view = new Popup();
//		fillTheArray(sample);
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
//		displayArrayContents(contents);
//		contents[2] = view.askQuestion("What should we replace index 2 with?");
//		displayArrayContents(contents);
	}
	
	public void start()
	{
//		displayArrayContents(sample);
//		stuffWithIntArray();
//		stuffWithStringArray();
//		testMeans();
		transfersDemo();
	}
	
	private void stuffWithIntArray()
	{
		int[] numbers = new int[5];
		
		fillTheArray(numbers);
		
		displayArrayContents(numbers);
		
		view.displayMessage("The value of 5 is at the index: " + indexOf(5, numbers) + ".");
		
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
//		displayArrayContents(inputs);
		view.displayMessage("The biggest word in inputs is: " + findMax(inputs));
	}
	
	/**
	 * Returns the minimum value of a given int array.
	 * @param nums The given int array.
	 * @return The minimum value of that array.
	 */
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
	
	/**
	 * Returns the maximum value from a given int array.
	 * @param nums The given int array.
	 * @return The maximum value of that array.
	 */
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
	
	/**
	 * Returns The first word alphabetically. Uses unicode values so lowercase comes before upper.
	 * @param words The string array being seached.
	 * @return The first word alphabetically.
	 */
	private String findMax(String[] words)
	{
		String max = words[0];
		for(String word : words)
		{
			if(word.compareTo(max) > 0)
			{
				max = word;
			}
		}
		return max;
	}
	
	/**
	 * Returns the last word alphabetically. Uses unicode values so uppercase is below lower.
	 * @param words The string array being searched.
	 * @return The first word alphabetically.
	 */
	private String findMin(String[] words)
	{
		String min = words[0];
		for(String word : words)
		{
			if(word.compareTo(min) < 0)
			{
				min = word;
			}
		}
		return min;
	}
	
	/**
	 * Finds the index of a given number in a given array of numbers.
	 * @param num The number you're looking for.
	 * @param nums They array being searched.
	 * @return The index of the number or -1 if it isn't there.
	 */
	private int indexOf(int num, int[] nums)
	{
		int index = 0;
		while(index < nums.length) 
		{
			if(nums[index] == num) return index+1;
			index++;
		}
		return -1;
	}
	
	private double sigma(double[] nums)
	{
		double sum = 0;
		for(double num : nums)
		{
			sum += num;
		}
		return sum;
	}
	
	private int sigma(int[] nums)
	{
		int sum = 0;
		for(int num : nums)
		{
			sum += num;
		}
		return sum;
	}
	
	private double product(double[] nums)
	{
		double product = 1.0;
		for(double num : nums)
		{
			product *= num;
		}
		return product;
	}
	
	private int product(int[] nums)
	{
		int product = 1;
		for(int num : nums)
		{
			product *= num;
		}
		return product;
	}
	
	private double mean(double[] nums)
	{
		return sigma(nums)/(nums.length);
	}
	
	private double mean(int[] nums)
	{
		return (double) (sigma(nums)/(nums.length));
	}
	
	private void testMeans()
	{
		int[] counters = {1,2,3,4,5,6,7,8,9,10};
		double[] reals = {3.0, 3.1, 3.14, 3.141, 3.1415, 3.14159, 3.141592, 3.1415926};
		view.displayMessage("" + mean(reals));
		view.displayMessage("" + mean(counters));
	}
	
	private String[] toArray(ArrayList<String> list)
	{
		String[] text = new String[list.size()];
		
		for(int index = 0; index < text.length; index++)
		{
			text[index] = list.get(index);
		}
		
		return text;
	}
	
	private ArrayList<String> toList(String[] list)
	{
		ArrayList<String> words = new ArrayList<String>();
		
		for(String str : list)
		{
			words.add(str);
		}
		
		return words;
	}
	
	private void transfersDemo()
	{
		String input = view.askQuestion("Type in a word, or quit to stop");
		ArrayList<String> words = new ArrayList<String>();
		
		words.add(input);
		
		while(! input.toLowerCase().contentEquals("quit"))
		{
			input = view.askQuestion("Type in more words or quit");
			words.add(input);
		}
		
		String[] arrayVersion = toArray(words);
		
		for(int index = 0; index < arrayVersion.length; index++)
		{
			view.displayMessage("The array contains " + arrayVersion[index] + " at the index of " + index + ".\n" +
					"The list has " + words.get(index) + " at the index of " + index + ".");
		}
	}
}
