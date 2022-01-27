package adapter.books;

public class Client {
    public static void main(String[] args) {
        Book book;
        book= new AdapterBook(new SimpleBook("lord ring", "juan perz"));
        System.out.println(book.getTitleAndAuthor());
    }
}
