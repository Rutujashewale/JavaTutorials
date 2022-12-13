package com.rutuja.lib.entity;
public class Book{
	
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
	public int getIsbn_no() {
		return isbn_no;
	}

	public void setIsbn_no(int isbn_no) {
		this.isbn_no = isbn_no;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String toString(){
		return this.id+ " " + this.isbn_no + " " + this.noOfPages + " " + this.author + " " + this.genre + " " + this.name;
	}
	
}