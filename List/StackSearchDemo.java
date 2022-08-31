import java.util.*;

class StackSearchDemo{
	public static void main(String args[]){
	
	
	 Stack<String> stack=new Stack<String>();
	
	stack.push("This");
	stack.push("is");
	stack.push("a");
	
	stack.push("Stack");
	stack.push("demo");

	System.out.println("String in Stack is :" + stack);
	
	// System.out.println(" Searching a position of specific string in stack :" + stack.search("is"));
	//String removeElement=stack.remove("Stack");
	boolean rem_ele = stack.remove("demo");
	//System.out.println("popping element from stack :" + stack.remove("Stack"));
	
	System.out.println("Popping element : " + rem_ele);
	System.out.println("Re-displaying Stack :" + stack);
	
	}
	
}