
public class MyMapNode<K,V> implements INode<K>
{
	K key;
	V value;
	MyMapNode<K,V> next;
	
	public MyMapNode(K key,V value) 
	{
		this.key=key;
		this.value=value;
		next=null;
	}
	public K getKey() 
	{
		return key;
	}
	public void setKey(K key) {
		this.key=key;
	}
	public INode getNext() 
	{
		return next;
	}
	public void setNext(INode<K> next) 
	{
	this.next=(MyMapNode<K,V>)next;	
	}
	public V getValue()
	{
		return this.value;
	}
	public void setValue(V value)
	{
		this.value=value;
	}
	@Override
	public String toString() {
		return "MyMapNode [key=" + key + ", value=" + value + ", next=" + next + "]";
	}

}