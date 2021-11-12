package array.controller;

import java.util.ArrayList;
import array.view.Popup;
import java.util.Arrays;
import array.model.DebugDuck;

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
	
	private void insertionSort(String[] data)
	{
		for(int outer = 1; outer < data.length; outer++)
		{
			String testedString = data[outer];
			int inner = outer - 1;
			
			while(inner >= 0 && testedString.compareTo(data[inner]) < 0)
			{
				data[inner + 1] = data[inner];
				inner--;
			}
			data[inner + 1] = testedString;
		}
	}
	
	private void selectionSort(int[] data)
	{
		int length = data.length;
		
		for(int outer = 0; outer < length; outer++)
		{
			int minIndex = outer;
			for(int inner = outer + 1; inner < length; inner++)
			{
				if(data[inner] < data[minIndex])
				{
					minIndex = inner;
				}
			}
			if(minIndex != outer)
			{
				swapItems(minIndex, outer, data);
			}
		}
	}
	
	private void sortingDemo()
	{
		int[] sample = new int[25];
		for(int index = 0; index < sample.length; index++)
		{
			sample[index] = (int) (Math.random() * 2048);
		}
		String unsorted  =convertArrayToText(sample);
		selectionSort(sample);
		String sorted  =convertArrayToText(sample);
		
		view.displayMessage("Unsorted:\n" + unsorted + "\nSorted:\n" + sorted);
		
		String[] strings = new String[9];
		String source = "defenstration";
		for(int index = 0; index < strings.length; index++)
		{
			String data = "";
			int number = (int) (Math.random() * 1234);
			int randomIndex = (int) (Math.random() * source.length());
			data += source.substring(randomIndex);
			data += " " + number;
			strings[index] = data;
		}
		unsorted = convertArrayToText(strings);
		insertionSort(strings);
		sorted = convertArrayToText(strings);
		view.displayMessage(unsorted + "\n" + sorted);
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
//		transfersDemo();
//		reversingData();
//		sortingDemo();
		advancedSortingDemo();
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
		
		arrayVersion[0] = "Deom of Objects";
		
		view.displayMessage("The array has " + arrayVersion[0] + " at index of 0.\n"
				+ "The list has " + words.get(0) + " at the index of 0");
		
		String text = "Hello ";
		words.add(text);
		
		arrayVersion = toArray(words);
		
		text += " there!";
		
		view.displayMessage("The final value in the array is " + arrayVersion[arrayVersion.length - 1] + ".\n"
				+ "The final value in the list is " + words.get(words.size() - 1) + ".");
	}
	
	private void reversingData()
	{
		String sentence = "\"Hello there.\" -General Kenobi";
		String palindrome = "Able was I ere I saw Elba";
		
		String[] sentenceArray = sentence.split(" ");
		String[] reversedSentence = reverseIt(sentenceArray);
		
		for(int i = 0; i < sentenceArray.length; i++)
		{
			view.displayMessage("Original: " + sentenceArray[i] +
					"\nReversed: " + reversedSentence[i]);
		}
		
		String[] reversedPalindrome = reverseIt(palindrome.split(""));
		String reversed = "";
		for(String letter : reversedPalindrome)
		{
			reversed += letter;
		}
		view.displayMessage(palindrome + "\n" + reversed);
	}
	
	private String[] reverseIt(String[] source)
	{
		String[] reversed = new String[source.length];
		
		for(int i = source.length - 1; i >= 0; i--)
		{
			reversed[source.length - 1 - i] = source[i];
		}
		
		return reversed;
	}
	
	private void swapItems(int minIndex, int outerIndex, int[] source)
	{
		int tempSwap = source[minIndex];
		source[minIndex] = source[outerIndex];
		source[outerIndex] = tempSwap;
	}
	
	private String convertArrayToText(int[] data)
	{
		String contents = "Array contents:\n";
		if(data.length < 30)
		{
			for(int value : data)
			{
				contents += value + " ";
			}
		}
		return contents;
	}
	
	private String convertArrayToText(String[] data)
	{
		String contents = "ArrayContents:\n";
		if(data.length < 10)
		{
			for(String value : data)
			{
				contents += value + " ";
			}
		}
		return contents;
	}
	
	private String parseTime(long time)
	{
		String parsed = time + " elapsed nanoseconds?\n";
		parsed += time / 60_000_000_000l + " minutes\n";
		time %= 60_000_000_000l;
		parsed += time / 1_000_000_000l + " seconds\n";
		time %= 1_000_000_000l;
		parsed += time / 1_000_000l + " milliseconds\n";
		time %= 1_000_000l;
		parsed += time / 1_000l + " microseconds\n";
		time %= 1_000l;
		parsed += time + " nanoseconds.";
		
		return parsed;
	}
	
	private void advancedSortingDemo()
	{
		int[] data = new int[500_000];
		int[] slowSortData = new int [500_000];
		for(int index = 0; index < data.length; index++)
		{
			int value = (int) (Math.random() * 100_000);
			data[index] = value;
			slowSortData[index] = value;
		}
		
		String unsortedNums = "";
		String sortedNums = "";
		
		for(int index = 0; index < 10; index++)
		{
			unsortedNums += data[index] + " ";
		}
		
		long fastSortTime = System.nanoTime();
		Arrays.sort(data);
		fastSortTime -= System.nanoTime();
		
		long slowSortTime = System.nanoTime();
		selectionSort(slowSortData);
		slowSortTime -= System.nanoTime();
		
		String parsedTime = parseTime(fastSortTime);
		String parsedSlowTime = parseTime(slowSortTime);
		
		view.displayMessage("fast:\n" + parsedTime + "\nslow:\n" + parsedSlowTime);
		
		for(int index = 0; index < 10;index++)
		{
			sortedNums += data[index] + " ";
		}
		view.displayMessage("See, it is sorted!\n" +
		"Unsorted:\n" + unsortedNums + "\nSorted:\n" + sortedNums);
		
		DebugDuck[] ducks = new DebugDuck[500_000];
		for(int index = 0; index < ducks.length; index ++)
		{
			DebugDuck tempDuck = new DebugDuck("Duck #" + index);
			tempDuck.setQuestionCount((int) (Math.random() * 1_000));
			ducks[index] = tempDuck;
		}
		
		String unsortedNames = "";
		String sortedNames = "";
		for(int index = 0; index < 20; index++)
		{
			unsortedNames += ducks[index].getName() + " ";
		}
		long duckSortingTime = System.nanoTime();
		Arrays.sort(ducks);
		duckSortingTime -= System.nanoTime();
		
		for(int index = 0; index < 20; index++)
		{
			sortedNames += ducks[index].getName() + " ";
		}
		
		String duckTime = parseTime(duckSortingTime);
		
		view.displayMessage(duckTime);
		view.displayMessage("Unsorted:\n" + unsortedNames + "\nSorted:\n" + sortedNames);
	}
}
