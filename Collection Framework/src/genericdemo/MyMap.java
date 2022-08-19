package genericdemo;

public class MyMap<K,V>{
   private K key;
   private V value;
   
   K keyArray[];
   V valueArray[];
public K getKey() {
	return key;
}
public void setKey(K key) {
	this.key = key;
}
public V getValue() {
	return value;
}
public void setValue(V value) {
	this.value = value;
}
   
   
}
