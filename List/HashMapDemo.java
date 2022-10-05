import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
class  HashMapDemo{
	public static void main(String args[]){
		HashMap<Integer,String> hm = new HashMap<>();

		hm.put(1,"ABC");
		hm.put(2,"PQR");
		hm.put(3,"XYZ");
		
		HashMap<Integer,List<String>> map = new HashMap<>();
		List<String> l1 = new ArrayList<String>();
		List<String> l2 = new ArrayList<String>();
		l1.add("AAA");
		l1.add("BB");
		l1.add("CCC");
		l1.add("DDD");
		l2.add("111");
		l2.add("222");
		l2.add("333");
		l2.add("444");
		map.put(1,l1);
		System.out.println(map);
		map.put(1,l2);
		System.out.println(map);
		map.put(2,l1);
		map.put(3,l2);
		System.out.println(map);
		System.out.println("Size of the HashMap :" + hm.size());
		System.out.println(hm);
		
		hm.put(3,"Rutuja");
		System.out.println(hm);
		
		
		if(hm.containsKey(2)){
			String a = hm.get(2);
			System.out.println("value for key 2 is :" + a);
		}
	}
}