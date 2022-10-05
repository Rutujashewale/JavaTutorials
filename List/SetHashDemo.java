import java.util.*;
class SetHashDemo{
	public static void main(String args[]){
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("This");
		hs.add("is");
		hs.add("a");
		hs.add("HashSet");
		hs.add("Demo");
		
		// System.out.println(hs);
		Iterator<String> iterator = hs.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}