class ThrowDemo{
	String content;
	
	void data(String content){
	this.content=content;
	
	if(content.isEmpty()){
		throw new NullPointerException("Content is empty: ");
	}else{
		System.out.println("Content :" + content);
	}
}
	public static void main(String args[]){
	ThrowDemo t=new ThrowDemo();
	t.data("Rutuja ");
	}
}