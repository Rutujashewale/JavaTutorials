
enum color{
	Red,
	Green,
	Blue;
	White;
	Black;
	Pink;
}

class EnumKeyword{
	
	Color color;
	
	public EnumKeyword(Color color) { this.color = color; }
	
	 public void colourIsLike()
	{
		switch(colour){
			case Red:
				System.out.println("Red is good clr");
			break;
			
			case Black:
				System.out.println("Blk is clr");
			break;
			
			case White:
				System.out.println("White is clr of peace");
			break;
			
			default:
				System.out.println("Other colors:");
			break;
		
	}
}
	public static void main(String args[]){
	
	String str = "White";
        EnumKeyword ew= new EnumKeyword(color.valueOf(str));
        ew.colourIsLike();
    }
	
	}