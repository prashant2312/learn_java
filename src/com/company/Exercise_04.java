package com.company;


import java.util.Objects;
import java.util.Scanner;

class Library{
    String [] books={"God Of War","Devil May Cry","PrinceOf Persia","Total Over Dose"};
    String[] showAvailableBooks(){
        return books;
    }
    Scanner sc=new Scanner(System.in);
    void issueBooks(){
        int ch;
        for(int i=0;i<books.length;i++){
            System.out.println(i+1+" - "+books[i]);
        }
        System.out.println("Enter your choice");
        ch=sc.nextInt();
        System.out.println("You have selected "+books[ch-1]);
        System.out.println("Now remaining books are");
        for (String book : books) {
            if (Objects.equals(books[ch - 1], book)) {
                continue;
            }
            System.out.println(book);
        }
    }
    void returnBooks(){
        System.out.println("You have return the book");
    }
}

public class Exercise_04 {
    public static void main(String[] args) {
//        You have  to implement a liberary using java class liberary
//        Methods:issueBooks(),returnBook(),showAvailableBook()
//        propertiews Array to store available books,issued books
        Library lib=new Library();
        lib.issueBooks();
    }
}
