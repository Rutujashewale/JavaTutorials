import java.util.*;
class SetOperations{
	public static void main(String args[]){
	
		Set<Integer> set1 = new HashSet<>();
		Integer[] array = new Integer[]{23,245,31,12,45,67,78,34};
		//ArrayList<Integer> list = Arrays.asList(array);
		set1.addAll(Arrays.asList(array));
	
		Set<Integer> set2 = new HashSet<>();
	
		set2.addAll(Arrays.asList(new Integer[] {23,45,23,67,87,98,90}));
	
		System.out.println("Set1: "+set1);
		System.out.println("Set2: "+set2);
		
		Set<Integer> union = new HashSet<>(set1);
		union.addAll(set2);                                 // union of set;
		System.out.println("Union of all set is : " + union);
		
		Set<Integer> intersection = new HashSet<>(set1);
		intersection.retainAll(set2);                      // intersection of set;
		System.out.println("Intersection of all set is : " + intersection);
		
		Set<Integer> difference = new HashSet<>(set1);
		difference.removeAll(set2);
		System.out.println("Difference of all set is: " +difference);
	}
}