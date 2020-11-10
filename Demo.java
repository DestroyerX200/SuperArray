public class Demo {
public static void removeDuplicates(SuperArray s) {
	for (int i = 0; i < s.size(); i++) {
		for (int j = i + 1; j < s.size();) {
			if ( s.get(i).equals(s.get(j)) ) {
				s.remove(j);
			}
			else {
				j++;
			}
		}
	}
}
public static SuperArray findOverlap(SuperArray a, SuperArray b) {
	removeDuplicates(a);
	removeDuplicates(b);
	SuperArray overlaps = new SuperArray(a.size() + b.size());
	for (int i = 0; i < a.size(); i++) {
		if (b.indexOf(a.get(i)) != -1) {
			overlaps.add(a.get(i));
		}
	}
	return overlaps;
}
public static void main(String[]args){
	SuperArray words = new SuperArray();
	//grouped to save vertical space
	words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");     
	words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
	words.add("una");    words.add("ebi");     words.add("toro"); 

	System.out.println(words);
	removeDuplicates(words);
	System.out.println(words); }
}
// public static SuperArray findOverlap(SuperArray a, SuperArray b) {
// 	for (int i = 0; i < a.size(); i++) {
// 		for (int j = 0; j < b.size(); j++) {

// 		}
// 	}
// }