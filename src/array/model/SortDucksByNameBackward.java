package array.model;

import java.util.Comparator;

public class SortDucksByNameBackward implements Comparator<DebugDuck>
{
	public int compare(DebugDuck firstDuck, DebugDuck secondDuck)
	{
		return -1 * firstDuck.getName().compareTo(secondDuck.getName());
	}
}
