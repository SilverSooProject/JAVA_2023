package Generic;

class Container2<K, V>{
	private K k;
	private V v;
	
	public K getKey() {
		return this.k;
	}
	public V getValue() {
		return this.v;
	}
	public void set(K k, V v) {
		this.k=k;
		this.v=v;
	}
}

public class Week05_02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Container2<String, String> c1 = new Container2<String, String>();
		c1.set("홍길동", "도적");
		String name1 = c1.getKey();
		String job = c1.getValue();
		
		Container2<String, Integer> c2 = new Container2<String, Integer>();
		c2.set("홍길동", 35);
		String name2 = c2.getKey();
		int age = c2.getValue();
		

	}

}
