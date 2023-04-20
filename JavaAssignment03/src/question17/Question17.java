package question17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Question17 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		Iterator<Integer> iterator = list.iterator();

		while (iterator.hasNext()) {
		    Integer element = iterator.next();
		    list.remove(element); // throws ConcurrentModificationException
		}



	}

}
