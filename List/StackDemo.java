import java.util.*;

class StackDemo{
	public static void main(String args[]){
	
	
	Stack<String> stack=new Stack<String>();
	
	stack.push("This");
	stack.push("is");
	stack.push("a");
	stack.push("Stack");
	stack.push("demo");
	

	Iterator<String> iterator = stack.iterator();
	
	while(iterator.hasNext()){
		System.out.print(iterator.next()+ " ");
		
	}
	System.out.println();
	
	int position =stack.search("is");
	System.out.println(position);
	
	
	}
	
}