public class SuperArray {
	private String[] data;
	private int size;

	public SuperArray() {
		data = new String[10];
		size = 0;
	}
	public int size() {
		return size;
	}
	public boolean add(String element) {
		if (size == data.length) {
			resize();
		}
		data[size] = element;
		size++;
		return true;
	}
	public String get(int index) {
		return data[index];
	}
	public String set(int index, String element) {
		String replacedValue = data[index];
		data[index] = element;
		return replacedValue;
	}
	private void resize() {
		String[] oldData = data;
		data = new String[2 * oldData.length];
		for (int i = 0; i < size; i++) {
			data[i] = oldData[i];
		}
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public void clear() {
		data = new String[10];
		size = 0;
	}
	public String toString() {
		String returnStr = "[";
		if (isEmpty()) {
			return "";
		}
		else {
			returnStr += data[0];
		}
		for (int i = 1; i < size; i++) {
			returnStr += ", " + data[i];
		}
		returnStr += "]";
		return returnStr;
	}
	public boolean contains(String s) {
		for (int i = 0; i < size; i++) {
			if (data[i].equals(s)) {
				return true;
			}
		}
		return false;
	}
	public SuperArray(int initialCapacity) {
		if (initialCapacity < 0) {
			throw new IllegalArgumentException("Initial Capacity " +
				initialCapacity + " cannot be negative, clown.");
		}
		data = new String[initialCapacity];
		size = 0;
	}
	public void add(int index, String element) {
		if ( index < 0 || index >= size() ) {
			throw new IndexOutOfBoundsException("index " + index + 
				" is out of range.");
		}
		if (size == data.length) {
			resize();
		}
		String[] oldData = new String[size];
		for (int i = 0; i < oldData.length; i++) {
			oldData[i] = data[i];
		}
		size++;
		for (int i = 0; i < index; i++) {
			data[i] = oldData[i];
		}
		data[index] = element;
		for (int j = index + 1; j < size; j++) {
			data[j] = oldData[j - 1];
		}
	}
	public String remove(int index) {
		String[] oldData = new String[size];
		for (int i = 0; i < oldData.length; i++) {
			oldData[i] = data[i];
		}
		size--;
		for (int i = 0; i < index; i++) {
			data[i] = oldData[i];
		}
		for (int j = index; j < size; j++) {
			data[j] = oldData[j+1];
		}
		return oldData[index];
	}
	public int indexOf(String s) {
		for (int i = 0; i < size; i++) {
			if ( data[i].equals(s) ) {
				return i;
			}
		}
		return -1;
	}
	public String[] toArray() {
		String[] returnArray = new String[size];
		for (int i = 0; i < size; i++) {
			returnArray[i] = data[i];
		}
		return returnArray;
	}
	public int lastIndexOf(String value) {
		for (int i = size - 1; i >= 0; i--) {
			if (get(i).equals(value)) {
				return i;
			}
		}
		return -1;
	}
	public boolean equals(SuperArray other) {
		if (size != other.size()) {
			return false;
		}
		for (int i = 0; i < size; i++) {
			if ( !data[i].equals(other.get(i)) ) {
				return false;
			}
		}
		return true;
	}
}