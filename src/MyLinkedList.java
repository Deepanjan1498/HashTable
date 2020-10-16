
/**
 * @author Mentalist
 *
 * @param <K>
 */
public class MyLinkedList<K> 
{
	public INode<K> head;
	public INode<K> tail;
	public int size=0;
	public MyLinkedList()
	{
		this.head=null;
		this.tail=null;
	}
	public void add(INode<K> newNode) 
	{
    if(this.tail==null)
		this.tail=newNode;
    if(this.head==null)
		this.head=newNode;
    else
    	{
    	INode<K> temporaryNode=this.head;
    	this.head=newNode;
    	this.head.setNext(temporaryNode);
    	}
    size++;
	}
	public void append(INode<K> newNode) 
	{
    if(this.tail==null)
		this.tail=newNode;
    if(this.head==null)
		this.head=newNode;
    else
    	{
    	this.tail.setNext(newNode);
    	this.tail=newNode;
    	}
    size++;
	}
	public void insert(INode<K> myNode,INode<K> newNode)
	{
		INode<K> tempNode=myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
		size++;
	}
	public INode<K> pop()
	{
		INode<K> temporaryNode=this.head;
		this.head=head.getNext();
		size--;
		return temporaryNode;
		
	}
	public INode<K> popLast()
	{
		INode<K> temporaryNode=head;
		while(!temporaryNode.getNext().equals(tail))
			temporaryNode =temporaryNode.getNext();
		this.tail=temporaryNode;
		temporaryNode=temporaryNode.getNext();
		tail.setNext(null);
		size--;
		return temporaryNode;
	}
	public INode<K> searchLinkedListAndInsertNode(K key, INode<K> newNode) {
		INode<K> temporaryNode = head;
		while (temporaryNode != null && temporaryNode.getNext() != null) {
			if (temporaryNode.getKey().equals(key)) {
				break;
			} else
				temporaryNode = temporaryNode.getNext();
		}
		INode<K> tempNode = temporaryNode.getNext();
		temporaryNode.setNext(newNode);
		newNode.setNext(tempNode);
		size++;
		return temporaryNode;
	}
	public INode<K> searchLinkedListAndDeleteNode(K key) {
		INode<K> tempNode = head;
		while(tempNode!=null&&tempNode.getNext()!=null) {
			if(tempNode.getNext().getKey().equals(key)) {
				break;
			}
			else 
				tempNode = tempNode.getNext();	
		}
		tempNode.setNext(tempNode.getNext().getNext());
		size--;
		return tempNode;
	}
	public INode<K> search(K key)
	{
		INode<K> tempNode = head;
		while(tempNode!=null&&tempNode.getNext()!=null) 
		{
			if(tempNode.getKey().equals(key)) 
			{
				return tempNode;
			}
			else 
				tempNode = tempNode.getNext();	
		}
		return null;
	}
	public int size()
	{
		return size;
	}
	public void printMyNode()
	{
		System.out.println("MyNodes: "+head);
	}
	@Override
	public String toString()
	{
		return "MyLinkedListNodes{"+head+'}';
	}
}