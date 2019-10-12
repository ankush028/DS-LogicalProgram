package logicalProgram;

public class Stack<T> {
	LinkedList<Object> l = new LinkedList<>();
	int top =0;
	public void push(T data){
		if(top ==-1){
			System.out.println("Stack is overflow");
		}else{
			
			l.add(data);
			top++;
		}
	}
	@SuppressWarnings("unchecked")
	public T pop(){
		top--;
		T data = (T)l.index(top);
		
		return (T)data;
	}
	
	public void show(){
		for(int i=0;i<top;i++){
			System.out.println(l.index(i));
		}
	}
	public boolean isEmpty(){
		if(top ==0){
			return true;
		}
		return false;
	}
	@SuppressWarnings("unchecked")
	public T peek(){
		
		T data = (T) l.index(top);
		return data;
	}
	public int size(){
		return top;
	}
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(40);
		s.push(30);
		s.pop();
		System.out.println("Peek of Stack"+s.peek());
		
		System.out.println(s.isEmpty());
		s.show();
		
	}

}
