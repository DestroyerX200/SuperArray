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
		SuperArray k = new SuperArray(15);
		k.add("Apple");
		k.add("Banana");
		k.add("Citrus");
		System.out.println(k);

		System.out.println();

		k.add(2, "Kiwi");
		System.out.println(k);
		k.add(1, "Heya");
		System.out.println(k);

		System.out.println();
		System.out.println("remove test cases:");
		k.add(1, "Heya");
		System.out.println(k);
		k.remove(2);
		System.out.println(k);
    }
}