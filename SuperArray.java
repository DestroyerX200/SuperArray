import java.lang.String;
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
		if (size + 1 > data.length) {
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
	public void resize() {
		String[] oldData = data;
		data = new String[2 * oldData.length];
		for (int i = 0; i < size; i++) {
			data[i] = oldData[i];
		}
	}
}