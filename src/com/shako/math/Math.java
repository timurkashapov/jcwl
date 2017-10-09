/** */
class Math {

	/** */
	public static final double PI = 3.14159;

	/** */
	public int pow(int basis, int exp) {

		int result = basis;

		if (basis == 0) {

			result = 0;
		} else if(basis < 0) {

			result = -basis;
		} else if (exp == 0){

			result = 1;
		} else {

			for(int i = 0; i <= exp; i++) {
				result *= basis;
			}
		}

		return result;
	}
} // Math