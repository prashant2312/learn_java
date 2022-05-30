package com.company;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

class Book{
    public String name,author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String
    toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class MyLibrary{
    public ArrayList<Book> books;
    public MyLibrary(ArrayList<Book> books) {
        for(Book b:books){
            this.books=books;
        }
    }
    public void addBooks(Book book){
        this.books.add(book);
        System.out.println("Book has been added to the library");
    }
    public void issuedBook(Book book,String issued_to){
        this.books.remove(book);
        System.out.println("Book has been added to your library "+issued_to);
    }
    public void returnBook(Book b){
        System.out.println("Book has been returned");
        this.books.add(b);
    }
}

public class Exercise7 {
    public static void main(String[] args) {
/*        Library management system which is capable of issuing books to the student
*          Books should have info like 1-Book name
* 2-Author
* 3-Issued to
* 4-Issued on
*
* User should be able to add books
* should be able to return books
* Issue books
* Assume that all the users are registered with their name with central database
*
* */

ArrayList<Book> bk=new ArrayList<>();
bk.add(new Book("Algorithms1","CLRS1"));
bk.add(new Book("Algorithms2","CLRS2"));
MyLibrary l=new MyLibrary(bk);
l.addBooks(new Book("AlgoA","Gamers"));
        System.out.println(l.books);
    }
}
