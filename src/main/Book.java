package main;

public class Book {
    private String bookName;
    private String authorName;
    private String isbn;
    Book(String bookName,String authorName,String isbn){
        this.bookName = bookName;
        this.authorName = authorName;
        this.isbn = isbn;
    }
    @Override
    public String toString(){
        return "-----------------------------\n"+"Book Name:\t"+bookName+"\nAuthor Name:\t"+authorName+"\nISBN:\t"+isbn+"\n-----------------------------\n";
    }
}

