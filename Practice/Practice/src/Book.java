////qn 5.create a class called &quot;Book&quot; with attributes for title,
////author, and ISBN, and methods to add and remove books from a collection.
//import java.util.ArrayList;
//import java.util.List;
//
//class Book {
//    private String title;
//    private String author;
//    private String isbn;
//
//    public Book(String title, String author, String isbn) {
//        this.title = title;
//        this.author = author;
//        this.isbn = isbn;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public String getISBN() {
//        return isbn;
//    }
//}
//
//class BookCollection {
//    private List<Book> books;
//
//    public BookCollection() {
//        books = new ArrayList<>();
//    }
//
//    public void addBook(Book book) {
//        books.add(book);
//    }
//
//    public void removeBook(Book book) {
//        books.remove(book);
//    }
//
//    public List<Book> getAllBooks() {
//        return books;
//    }
//}
//
//
//


import java.util.ArrayList;

public class Book{
    private String title;

    private String author;

    private String ISBN;



    private static ArrayList<Book>library = new ArrayList<Book>();
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public static ArrayList<Book> getLibrary() {
        return library;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }



    public static void addBook(Book book) {
        library.add(book);
    }


    public static void removeBook(Book book) {
        library.remove(book);
    }


}
