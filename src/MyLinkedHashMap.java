
import java.util.ArrayList;
import java.util.*;

/**
 * @author Mentalist
 *
 * @param <K>
 * @param <V>
 */
/**
 * @author Mentalist
 *
 * @param <K>
 * @param <V>
 */
public class MyLinkedHashMap<K,V> 
{
	private final int numOfBuckets;
	ArrayList<MyLinkedList<K>> myBucketArray;
	public MyLinkedHashMap()
	{
		this.numOfBuckets=10;
		this.myBucketArray=new ArrayList<>(numOfBuckets);
		for(int i=0;i<numOfBuckets;i++)
		this.myBucketArray.add(null);
	}
	private int getBucketIndex(K key)
	{
		int hashCode=Math.abs(key.hashCode());
		int index=hashCode%numOfBuckets;
		return index;
	}
	public V get(K key)
	{
		int index=this.getBucketIndex(key);
		MyLinkedList<K> myLinkedList=this.myBucketArray.get(index);
		if(myLinkedList==null)
			return null;
		MyMapNode<K, V> myMapNode=(MyMapNode<K,V>) myLinkedList.search(key);
		return (myMapNode==null)? null:myMapNode.getValue();
	}
	public void add(K key,V value)
	{
		int index=this.getBucketIndex(key);
		MyLinkedList<K> myLinkedList=this.myBucketArray.get(index);
		if(myLinkedList==null)
		{
			myLinkedList=new MyLinkedList<>();
			this.myBucketArray.set(index,myLinkedList);
		}
		MyMapNode<K, V> myMapNode=(MyMapNode<K,V>) myLinkedList.search(key);
		if(myMapNode==null)
		{
			myMapNode= new MyMapNode<>(key,value);
			myLinkedList.append(myMapNode);
		}
		else
			myMapNode.setValue(value);
	}
	public K remove(K key)
	{
		int index=this.getBucketIndex(key);
		MyLinkedList<K> myLinkedList=this.myBucketArray.get(index);
		if(myLinkedList==null)
		{
			return null;
		}
		MyMapNode<K, V> nodeWhichIsDeleted = (MyMapNode<K, V>) myLinkedList.nodeDeletion(key);
		return (nodeWhichIsDeleted == null) ? null : nodeWhichIsDeleted.getKey();
	}
	
	@Override
	public String toString()
	{
		return "MyLinkedHashMap{"+myBucketArray+'}';
	}
}