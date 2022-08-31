import java.util.*;
class PriorityQueueDemo{
	public static void main(String[] args){
	
	//PriorityQueue<Integer> pQueue=new PriorityQueueDemo<Integer>();
	 PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
	
	pQueue.add(20);
	pQueue.add(34);
	pQueue.add(4);
	pQueue.add(14);
	pQueue.add(54);
	pQueue.add(234);
	
	System.out.println("Queue before removing specific element from Queue :" + pQueue);
	
	System.out.println("Element removed :" + pQueue.remove());
	
	System.out.println("Queue after removing specific element from Queue :" + pQueue);
	
//	System.out.println("specific element: " + pQueue.remove(20));
	
	pQueue.remove(20);
	System.out.println("Element removed : ");
	System.out.println("Queue after removing specific element from Queue :" + pQueue);
	
	
	}
}