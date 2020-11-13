public class Tester {
	public static void main(String[] args) {
		// SuperArray k = new SuperArray();
		// System.out.println(k.toString());
		// System.out.println(k.size());
		// k.add("lol");
		// System.out.println(k.toString());
		// System.out.println(k.size());

		// System.out.println();

		// k.add("xD");
		// k.add("xd");
		// k.add("haha");
		// System.out.println(k.get(0));
		// System.out.println(k.get(1));
		// System.out.println(k.get(2));
		// System.out.println(k.get(3));

		// System.out.println();

		// System.out.println(k.set(0, "not lol anymore, xd!"));
		// System.out.println(k.set(2, "not xd anymore, lol!"));
		// System.out.println(k.get(0));
		// System.out.println(k.get(1));
		// System.out.println(k.get(2));
		// System.out.println(k.get(3));

		// for (int i = 0; i < 15; i++) {
		// 	k.add("lol");
		// }
		// System.out.println();
		// k.resize();
		// for (int i = 0; i < 15; i++) {
		// 	k.add("lol");
		// }
		// System.out.println(k.size());

		// System.out.println();
		// SuperArray words = new SuperArray();
		// words.add("kani");
		// words.add("uni");
		// words.add("ebi");
		// for (int i = 0; i < 3; i++){
		// 	words.add("kani");
		// 	words.add("uni");
		// 	words.add("ebi");
		// 	System.out.println( words.size() );
		// }

		// System.out.println(words);
		// System.out.println(k);

		// System.out.println();
		// System.out.println(words.contains("kani"));
		// System.out.println(words.contains("xD"));
		
		// SuperArray k = new SuperArray(15);
		// k.add("Apple");
		// k.add("Banana");
		// k.add("Citrus");
		// System.out.println(k);

		// System.out.println();

		// k.add(2, "Kiwi");
		// System.out.println(k);
		// k.add(1, "Heya");
		// System.out.println(k);

		// System.out.println();
		// System.out.println("remove test cases:");
		// System.out.println(k.size());
		// k.add(1, "Heya");
		// System.out.println(k);
		// System.out.println(k.size());
		// k.remove(2);
		// System.out.println(k);
		// System.out.println(k.size());

		// System.out.println();
		// System.out.println("indexOf test cases:");
		// k.add(5, "Heya");
		// System.out.println(k);
		// System.out.println(k.indexOf("Apple"));
		// System.out.println(k.indexOf("Kiwi"));

		// System.out.println();
		// System.out.println("toArray test cases:");
		// System.out.println(k);
		// String[] fruits = k.toArray();
		// System.out.println(fruits[3]);

		// SuperArray multiplesOfTwo = new SuperArray(15);
		// SuperArray multiplesOfThree = new SuperArray(15);

		// for (int i = 0; i < 15; i++) {
		// 	multiplesOfTwo.add(2 * i + "");
		// 	multiplesOfThree.add(3 * i + "");
		// }

		// System.out.println(multiplesOfTwo);
		// System.out.println(multiplesOfThree);

		// System.out.println(Demo.findOverlap(multiplesOfTwo, multiplesOfThree)); // should be SuperArray of multiples of 6

		// SuperArray fruits = new SuperArray();

		// System.out.println();

		// fruits.add("apple");
		// fruits.add("banane");
		// fruits.add("banana");
		// fruits.add("anana");
		// fruits.add("pineapple");
		// fruits.add("apple");
		// fruits.add("banana");
		// fruits.add("apple");
		// System.out.println(fruits.lastIndexOf("apple"));
		// System.out.println(fruits.lastIndexOf("banana"));
		// System.out.println(fruits.lastIndexOf("banane"));
		// System.out.println(fruits.lastIndexOf("Kiwi"));

		// System.out.println();

		// SuperArray numbers = new SuperArray(20);
		// SuperArray nums = new SuperArray(25);
		// for (int i = 0; i < 16; i++) {
		// 	numbers.add(i + "");
		// 	nums.add(i + "");
		// }
		// System.out.println(nums);
		// System.out.println(numbers);
		// System.out.println(nums.equals(numbers));
		// System.out.println(numbers.equals(nums));
		// System.out.println(nums.equals(fruits));

		// System.out.println();

		// SuperArray letters = new SuperArray();
		// SuperArray integers = new SuperArray();

		// letters.add("a"); letters.add("b"); letters.add("c");
		// letters.add("d"); letters.add("e"); letters.add("f");

		// integers.add("0"); integers.add("1"); integers.add("2");
		// integers.add("3");

		// System.out.println(integers);
		// System.out.println(letters);
		// System.out.println(Demo.zip(letters, integers));
		// System.out.println(Demo.zip(integers, letters));

		//SuperArray error = new SuperArray(-4);

		try {SuperArray error = new SuperArray(-4);
		}
		catch (IllegalArgumentException e) {
			System.out.println(e);
		}
		
		// SuperArray g = new SuperArray(10);
		// g.add(2, "error");

		try {SuperArray k = new SuperArray(10);
			k.add(2, "error");
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		}

		try {SuperArray k = new SuperArray(10);
			k.add(-1, "error");
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		}

		try {SuperArray k = new SuperArray(10);
			k.set(3, "error");
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		}

		try {SuperArray k = new SuperArray(10);
			k.set(-1, "error");
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		}

		try {SuperArray k = new SuperArray(10);
			k.get(-1);
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		}

		try {SuperArray k = new SuperArray(10);
			k.get(2);
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		}

		try {SuperArray k = new SuperArray(10);
			k.remove(-1);
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		}

		try {SuperArray k = new SuperArray(10);
			k.remove(2);
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		}

    }
}