package com.company.;

import java.util.Arrays;

public class Book {

    protected String title;
    protected String[] authors;
    protected String ISBN;
    protected String category;
    protected String bookLabel;
    protected String bookID;
    protected String issuedUserID;

    public Book(String title, String[] authors, String ISBN, String category) {
        this.title = title;
        this.authors = new String[authors.length];
        for (int i = 0; i < authors.length; i++) {
            this.authors[i] = authors[i];
        }
        this.ISBN = ISBN;
        this.category = category;
    }

    public static boolean validateInfo(Book book) {
        // Book title's max length is 255 characters
        if (book.title.length() > 255) {
            System.out.println("Book title is too long (Longer than 255 characters). So can't process.");
            return false;
        }

        // Each author name can be a max of 255 characters
        for (String author: book.authors) {
            if (author.length() > 255) {
                System.out.println("Author, " + author + " name is too long (Longer than 255 characters). So can't process.");
                return false;
            }
        }
        // ISBN number should be of 10 characters
        if (book.ISBN.length() != 10 ) {
            System.out.println("Please enter the valid ISBN NUMBER");
            return false;
        }
        // book id should be of 8 characters
//        if (book.bookID.length() != 8) {
//            System.out.println("Please enter the valid BookID");
//            return false;
//        }
//        // userID should be of 6 characters
//        if (book.issuedUserID.length() != 6) {
//            System.out.println("Please enter the valid USERID");
//            return false;
//        }


        return true;
    }


    public void setBookLabel(String label) {
        bookLabel = label;
    }

    public void setBookID(String id) {
        bookID = id;
    }

    public String getTitle() {
        return title;
    }
    public String getISBN() { return ISBN; }
    public String getCategory() { return category; }
    public String getBookLabel() { return bookLabel; }

    public String getAuthorsAsString() {
        return Arrays.toString(authors);
    }
}
