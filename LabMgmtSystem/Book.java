class Book{
	
		int isbn_no,id,noOfPages;
		String name,author,genre;
	
	
	public Book(){
	}
	
	public Book(int id,int isbn_no, int noOfPages,String author,String genre,String name){
		this.isbn_no=isbn_no;
		this.id=id;
		this.noOfPages=noOfPages;
		this.author=author;
		this.genre=genre;
		this.name=name;
	}
	
	public String toString(){
		return this.id+ " " + this.isbn_no + " " + this.noOfPages + " " + this.author + " " + this.genre + " " + this.name;
	}
	
}