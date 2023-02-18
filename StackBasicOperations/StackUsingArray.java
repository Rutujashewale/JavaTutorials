
public class StackUsingArray {
	
	static final int max=5;
	int top;
	int[] a=new int[max];
	
	boolean isEmpty() {
		return (top<0);
		
	}
	
	 StackUsingArray() {
		top = -1;
	}
	
	 boolean push(int data) {
		 if(top >= (max-1)) {
			 System.out.println("Stack is overflow:");
			 return false;
		 }
		 else {
			 a[++top] = data;
			 System.out.println("Pushed elements are:");
			 System.out.println(data);
			 return true;
		 }
	 }
	 
	 int pop() {
		 if(top < 0) {
			 System.out.println("Stack is underflow");
			 return 0;
		 }
		 else {
			 int data = a[top --];
			 return data;
		 }
	 }
	
	 int peek() {
		 if(top < 0) {
			 System.out.println("Stack is underflow");
			 return 0;
		 }
		 else {
			 int data = a[top];
			 return data;
		 }
		 
	 }
	 
	 void printStack() {
		 for(int i=top;i> -1;i--) {
			 System.out.println(a[i]);
		 }
	 }
	public static void main(String[] args) {
		
		StackUsingArray stackOperations = new StackUsingArray();
		stackOperations.push(1);
		stackOperations.push(2);
		stackOperations.push(3);
		stackOperations.push(4);
		stackOperations.push(5);
		
		System.out.println(stackOperations.pop() + "popped from the stack:");
	
		
		System.out.println(stackOperations.peek() + "is the peek(top) element:");
		
		System.out.print("Elements present in stack are :");
		stackOperations.printStack();
		
		
	}
}
