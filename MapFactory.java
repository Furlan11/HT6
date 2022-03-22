import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapFactory {

	public Map crear(int valor) {
		
		switch(valor) {
		case 1:{
			//HashMap
			return new TreeMap<String, ArrayList<String>> ();
		}
		case 2:{
			
			return new  LinkedHashMap<String, ArrayList<String>>();
		}
		case 3:{
			//TreeMap
			return new HashMap<String, ArrayList<String>>();
		}
		default:{
			return null;
		}
		}
		
		
		
	
		
		
	}
}
