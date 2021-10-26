package com.thevarungupta.Day2;

class Book{
    public String title;
    public String author;
    public int price;

    public void printBookInfo(){
        System.out.println("Book : Title =  "+ title +", Author = "+ author+ ", Price = "+ price);
    }
}

public class Demo1 {
    public static void main(String[] args) {
       // create object
        Book book1 = new Book();
        book1.title = "Java";
        book1.author = "Author 1";
        book1.price = 1000;

        book1.printBookInfo();

        //System.out.println("Book : Title =  "+ book1.title +", Author = "+ book1.author+ ", Price = "+ book1.price);

        Book book2 = new Book();
        book2.title  ="HTML";
        book2.author = "Author 2";
        book2.price = 2000;

        //System.out.println("Book : Title =  "+ book2.title +", Author = "+ book2.author+ ", Price = "+ book2.price);
        book2.printBookInfo();
    }
}
