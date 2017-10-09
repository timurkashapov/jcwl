// java.util
import java.util.HashSet;
import java.util.ArrayList;

// java.math
import java.math.BigDecimal;

/** */
class Fibonacci {

	/** */
	public static void main(String[] args) {

		getFibonacciSequence(30);

	} // main()


	/**
	* Получить последовательность Фибоначчи.
	*
	* @param c количество элементов последовательности.
	* @return HashSet<BigDecimal> последовательность значений элементов последовательности Фибоначчи.
	*/
	private static final HashSet<Double> getFibonacciSequence(final int c) {

		HashSet<Double> sequence = new HashSet<>();
		ArrayList<Integer> elem  = new ArrayList<>();

		double
			a   = 1.0,
			b   = 1.0,
			f   = 0.0;

		for(int i = 1; i <= c ; i++) {
			
			f = (a + b) / a;

			b = a + b;
			a = a + b;

			// elem.add( (int) b);
			// sequence.add(f);

			// System.out.printf("[%d] [%d] %.10f = %d/%d\n", i, elem.get(i - 1) , f, (int) a, (int) b);
		}

		return sequence;

	} // getFibonacciSequence()
} // Fibonacci