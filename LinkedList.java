package logicalProgram;
class Node {
	Object data;
	Node next;
	Node(Object data){
		this.data = data;	
	}
}

	public class LinkedList<T> {
		int size =0;
		Node head = null;
		Node tail;
	public void add(T data){
		Node node = new Node(data);
		size++;
		if(head == null){
			head = node;
		
			
		}else{
			Node current = head;
			while(current.next != null){
				current = current.next;
			}
			current.next = node;	
		}
	}
	public void removeAtLast(){
		if(head == null){
			System.out.println("Already Empty");
		}else{
			Node current= head;
			Node prev = null;
			while(current.next!=null){
				prev = current;
				current = current.next;
			}
			prev.next = null;
			size--;
		}
	}
	@SuppressWarnings("unchecked")
	public T index(int pos){
		Node current = head;
		while(pos>0 && current.next!=null){
			current = current.next;
			pos--;
		}
		return (T)current.data;
	}
	public void show(){
		Node current = head;
		while(current!= null){
			System.out.println(current.data);
			current = current.next;
		}
	}
	public int size(){
		return size;
	}
	
}
