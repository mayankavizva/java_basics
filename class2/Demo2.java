package com.thevarungupta.Day2;

class Book2{
    public String title;
    public String author;
    public int price;

    public Book2(){
        title = "default title";
        author = "default author";
        price = 0;
    }

    public Book2(String t, String a, int p){
        title = t;
        author = a;
        price = p;

    }

    public void display(){
        System.out.println("Book: Title = "+ title+ ", Author = "+ author+ ", Price = "+ price);
    }

}

public class Demo2 {
    public static void main(String[] args) {
        Book2 obj = new Book2("HTML", "Author 1", 2000);
        obj.display();

        Book2 obj2 = new Book2("CSS", "Author 2", 3000);
        obj2.display();

    }
}
