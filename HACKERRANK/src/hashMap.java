import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashMap {
	public static void main(String[] args) 
	{
		Map<String, Integer> map=new HashMap<String,Integer>();
		map.put("a", 2);
		map.put("b", 3);
		map.put("e", 1);
		map.put("d", 4);
		System.out.println(map);
		Set<Entry<String, Integer>> str=map.entrySet();
		for(Entry<String, Integer>ent:str)
		{
			String key=ent.getKey();
			Integer value=ent.getValue();
			
			System.out.println(key+" "+value);
		}
		/*for (Map.Entry<String, Integer>mp:map.entrySet())
			
		{
			System.out.println(mp.getKey()+" "+mp.getValue());
		}
		*/
		
		
		
		/*
		 * 
		 * 
		Map<Integer, String>map=new HashMap<Integer,String>();
		map.put(8, "Raja");
		map.put(2, "baba");
		map.put(1, "chanda");
		map.put(143, "babita");
		for(Map.Entry<Integer,String>mp:map.entrySet()) 
		{
			System.out.println(mp.getValue()+" "+mp.getKey());
		}
*/
	}
}
