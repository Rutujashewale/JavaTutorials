import java.io.*;
import java.util.*;

class ListDemo{
	public static void main(String args[]){
		int i;
		ArrayList<Integer> li=new ArrayList<>();
	
		for( i=0;i<8;i++){
			li.add(i);
		}
		System.out.println("List of elements:" +li);

		li.remove(4);
	
		System.out.println("List of elements:" +li);
	

	}
}
