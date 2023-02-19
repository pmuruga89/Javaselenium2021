package CollectionFramework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMapClass {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1700, "muruan");
		hm.put(100, "muruan");
		hm.put(200, "mathi");
		hm.put(300, "jeeva");
		hm.put(300, "anil");
		hm.put(300, "hari");
		
		hm.put(null, "Null1");
		hm.put(null, "Null2");
		hm.put(400, null);
		hm.put(400, null);
		
		System.out.println(hm);
		
		System.out.println(hm.containsKey(100));
		System.out.println(hm.containsValue("hari"));
		hm.putAll(hm);
		System.out.println(hm);
		System.out.println(hm.get(100));
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
		
		System.out.println("Entery set iteration");
		for(Map.Entry<Integer, String> temp:hm.entrySet()) {
			
			System.out.println(temp.getKey());
			System.out.println(temp.getValue());
		}
		
		System.out.println("-----------");
		
		System.out.println(hm.keySet());
		HashSet<String>hs = new HashSet<String>();

		System.out.println(hm.values());
		
		for(Object ob:hm.keySet()) {
			System.out.println(ob);
			
			if(hm.containsValue(hm.get(ob))){
				
			}
		}
	}

}
