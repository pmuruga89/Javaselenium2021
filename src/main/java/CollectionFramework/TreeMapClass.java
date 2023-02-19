package CollectionFramework;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {

		TreeMap<Integer, String>tm = new TreeMap<Integer, String>();
		tm.put(500, "krishna");
		tm.put(100, "murugan");
		tm.put(200, "jeeva");
		tm.put(200, "murugan");
		tm.put(300, null);
		tm.put(400, null);
		//tm.put(null, "hair");
		
		System.out.println(tm);
		
		System.out.println(tm.containsKey(500));
		System.out.println(tm.containsValue("krishna"));
		System.out.println(tm.get(100));
		System.out.println(tm.keySet());
		System.out.println(tm.values());
		System.out.println(tm);
		System.out.println(tm.size());
		
		tm.remove(300);
		System.out.println(tm);
		
		tm.putAll(tm);
		System.out.println(tm);
		
		System.out.println("::::::Entry set::::::");
		
		for(Map.Entry<Integer, String>temp:tm.entrySet()) {
			System.out.println(temp.getKey() + "  "+temp.getValue());
		}
		
	}

}
