import java.util.Scanner;
public class Book {
String title ;
String author ;
int year ;
float price ;
Scanner in = new Scanner(System.in);

public Book() {
	title = null;
	author = null;
	year = 0;
	price = 0.0f;
}
public Book(String title, String author, int year, float price) {
	this.title = title;
	this.author = author;
	this.year = year;
	this.price = price;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public void Add() {
	System.out.println("Enter  title of book : ");
	 title=in.nextLine();
	 System.out.println("Enter  Author Name : ");
	 author=in.nextLine();
	 System.out.println("Enter  year : ");
	 year=in.nextInt();
	 System.out.println("Enter price : ");
	 price=in.nextFloat();
}

public void Display() {
	System.out.println("Title : " + title + " " + " Author : " +author + " Year : " +year +" " + "  Price : " + price);
}
public void Add1() {
	System.out.println("Enter  title of book : ");
	 title=in.nextLine();
	 System.out.println("Enter  Author Name : ");
	 author=in.nextLine();
	 System.out.println("Enter  year : ");
	 year=in.nextInt();
	 System.out.println("Enter price : ");
	 price=in.nextFloat();
}



	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
      Book [] arr = new Book[1];// any size
      for(int i = 0 ; i < arr.length ; i++) {
    	  arr[i] = new Book();
    	  
      }
  	for(int i=1;i<=arr.length;i++)
	{
		System.out.println("The book number :"+i);
		arr[i-1].Add();
		
	}
	for(int i=1;i<=arr.length;i++)
	{ 
		System.out.println("The book number " +i+" is : " );
		arr[i-1].Display();
	}
}
}
	
		
        