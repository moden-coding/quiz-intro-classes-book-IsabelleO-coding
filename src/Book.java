public class Book {

    private String title;

    private String author;

    private int yearPublished;

    private boolean isAvailable;

 

    public Book(String name, String author, int publishingDate) {

        this.title = name;

        this.author = author;

        this.yearPublished = publishingDate;

        this.isAvailable = true;

    }

 

    public String toString() {

        return ("Title: " + this.title + ", Author: " + this.author + ", Year Published: " + this.yearPublished

                + ", Available: " + this.isAvailable);

    }

 

    public void borrowBook() {

        if (isAvailable == false) {

            System.out.println("Book is not available");

        }

        if (isAvailable == true) {

            this.isAvailable = false;

            System.out.println("Book borrowed");

        }

    }

 

    public void returnBook() {

        if (isAvailable == false) {

            this.isAvailable = true;

            System.out.println("Book returned");

        }

    }

}

