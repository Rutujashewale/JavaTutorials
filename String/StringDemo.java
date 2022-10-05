class StringDemo{
	public static void main(String args[]){
	
	String s1="String Operations";
	
	System.out.println(s1.length()); //to find total charachers in the defined String 
	
	System.out.println("Length of character at Position:"+ s1.charAt(9));
	
	System.out.println(" substring from the ith  index character to end of string " + s1.substring(6));
	
	String s2 = "Demo ";
	
	System.out.println("Concatinate two strings : " + s1.concat(s2));
	
	System.out.println("Index of Operations is :" + s1.indexOf("Operations"));
	
	System.out.println("Adding new string into string 2: " + s2.concat("Example"));
	}
}