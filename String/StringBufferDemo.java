class StringBufferDemo{
	public static void main(String args[]){
	
	StringBuffer sb = new StringBuffer("StringBuffer ");
	System.out.println("Capacity of current buffer is :" + sb.capacity());
	//sb.append("Demo");   To concat into above String
	
	sb.replace(6,12,"Demo"); // To replace String at specific Index
	
	sb.reverse(); // to reverse the String
	
	System.out.println(sb);
	}
}