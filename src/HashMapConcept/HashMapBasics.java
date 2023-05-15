package HashMapConcept;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasics {

	public static void main(String[] args) {
		
		//does not maintain order and no indexing
		//stores values - key <K,v>
		//key can not be duplicate
		
		Map<String, String> capitalMap = new HashMap<String, String>();
		
		capitalMap.put("India", "New Delhi");
		capitalMap.put("USA", "Washington DC");
		capitalMap.put("UK", "London");
		
		System.out.println(capitalMap.get("India"));

	}

}
