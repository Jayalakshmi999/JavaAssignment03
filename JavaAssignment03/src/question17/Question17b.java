package question17;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Question17b {

	public static void main(String[] args) {
		List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		Iterator<Integer> iterator = list.iterator();

		while (iterator.hasNext()) {
		    Integer element = iterator.next();
		    list.remove(element); // does not throw ConcurrentModificationException
		}

	}

}
