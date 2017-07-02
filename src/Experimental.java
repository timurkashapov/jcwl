import java.util.Arrays;
import java.util.TreeSet;

class Experimental {



	public static void main(String[] args) {



		String[] array = {"A", "B", "C", "B", "E"};

		System.out.println(getWords(array));
	}



	/**
	*
	* Возвращаем список в виде отсортированной последовательности.
	* Return the "list" in the "tree set" view.
	*
	* @param array source data store in linear array.
	*
	*/
	public static TreeSet<String> getWords(String[] array) {
		return new TreeSet<String>(Arrays.asList(array));
	}
}