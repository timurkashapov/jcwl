/**
*
* ДИНАМИЧЕСКИЙ ЛИНЕЙНЫЙ МАССИВ.
* DYNAMIC LINEAR ARRAY.
*
*
* Динамический линейный массив.
* Реализовывает:
* - вставка элемента в конец массива.
* - вставка элемента по индексу со  смещением массива.
* - получение элемента по индексу.
* - удаление последнего элемента.
* - удаление элемента по индексу со смещение массива.
*
*
* Dynamic linear array.
* It implements:
* - add element to array end.
* - insert element by index with offset of array.
* - get element by index.
* - remove last element in array.
* - remove element by index with offset of array.
*
*/
public class DArray {

	/**
	* Основной статический массив для хранения данных. 
	* Basic static array for data storage. 
	*/
	private Object[] data;

	/**
	* Базовая длина статического массива.
	* Basic length of static array.
	*/
	private final int BASIC_LENGTH = 8;

	/**
	* Текущая длина статического массива.
	* Current length of static array. 
	*/
	private int length;

	/**
	* Текущий размер динамического массива.
	* Current size of dynamic array.
	*/
	private int size;

	/**
	* Конструктор инициализации.
	* Constructor of initializes.
	*/
	public DArray() {

		data = new Object[BASIC_LENGTH];
		length = BASIC_LENGTH;
		// TO-DO
	} // DArray()

	/**
	* Конструктор инициализации массива фиксированной длины.
	* Constructor of initializes the array with fixed length.
	*
	* @param fixedLength length of array.
	*/
	public DArray(int fixedLength) {


		data = new Object[fixedLength];
		length = fixedLength;
	} // DArray()

	/**
	*
	* Вставка элемента в конец массива.
	* add element to array end.
	*
	* @param item element for adding.
	*
	*/
	public void add(Object item) {

		// Проверяем размерность массива на возможность добавления элемента.
		if (length > size + 1) {

			data[size] = item;
			size++;

		} else {

			// Создаем новый массив для оперативного копирования данных.
			Object[] newSArray = new Object[length + BASIC_LENGTH];

			// Копируем данные старого массива в новый массив.
			for(int i = 0; i < length; i++) {
				newSArray[i] = data[i];
			} // for i

			// добавляем элемент в конец нового массива.
			newSArray[length + 1] = item;

			// увеличиваем значение длины нового массива.
			length += BASIC_LENGTH;

			// увеличиваем значение текущего количества элементов в массиве.
			size++;

			// Заменяем ссылку старого массива на новый.
			data = newSArray;
			// обнуляем ссылку на оперативный "новый массив".
			newSArray = null;
		}

	} // add(Object item)

	/**
	*
	* TESTING
	*
	*/
	public static void main(String[] atgs) {

		DArray boolets = new DArray();

		boolets.add(new Object());
		boolets.add(new Object());
		boolets.add(new Object());
		boolets.add(new Object());
		boolets.add(new Object());

		System.out.println( boolets.toString() );

	} // main()

	/** */
	@Override
	public String toString() {

		StringBuilder out = new StringBuilder();

		for(int i = 0; i < size; i++) {
			out.append(data[i]).append("\n");
		}
		return out.toString();

	} // toString()

} // DArray