

public interface IMap<K,T> {
		public void Insert(K key, T value);
		public String SearchValue(K key, String value);
		public String SearchValue(String value);
		public String Removin(K key, String value);
		public void ShowMapping();
		public void ShowMapping2();
		public int countValues(T value);
		public String getKeyFromValue(T value);
		public String SearchKey(K key);
		
	}

