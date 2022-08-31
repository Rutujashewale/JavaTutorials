import java.util.*;
class DequeInsertionDemo{
	
	public static void main(String args[]){
	
	 ArrayDeque<Integer> dQueue = new ArrayDeque<Integer>();
	
	dQueue.add(10);
	dQueue.add(34);
	dQueue.add(45);
	dQueue.add(223);
	dQueue.add(687);
	dQueue.add(234);
	
	System.out.println(dQueue);
	
	dQueue.addFirst(1);
	dQueue.addFirst(2);
	dQueue.addFirst(3);
	dQueue.addFirst(4);
	
	
	System.out.println(dQueue);
	
	dQueue.addLast(500);
	dQueue.addLast(600);
	dQueue.addLast(700);
	
	System.out.println(dQueue);
	
	}
}