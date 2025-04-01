import java.util.*;
class Library{
    class Book{
        private String title, author;
        public void setBook(String title, String author){
            this.title = title;
            this.author = author;
        }
        public void getBook(){
            System.out.println("Book: "+title+" Author: "+author);
        }
    }
    public Book createBook(){
        return new Book();
    }
}
public class Practice1 {
    public static void main(String[] args) {
        Library library = new Library();
        Library.Book book = library.createBook();
        book.setBook("JAVA","Manav");
        book.getBook();
    }
}