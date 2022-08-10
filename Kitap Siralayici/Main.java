
import java.util.TreeSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class Main{
    public static void main(String[] args) {
        Book b1 = new Book("Hava Kitabi", 645, "ElementAdam", "15.03.246");
        Book b2 = new Book("Su Kitabi", 735, "ElementAdam","15.04.284");
        Book b3 = new Book("Ates Kitabi", 824, "ElementAdam", "15.05.392");
        Book b4 = new Book("Toprak Kitabi", 789, "ElementAdam", "15.06.456");
        Book b5 = new Book("Hayat Kitabi", 1, "ElementAdam", "20.12.2012");

        TreeSet<Book> booksNameSort = new TreeSet<>();
        booksNameSort.add(b1);
        booksNameSort.add(b2);
        booksNameSort.add(b3);
        booksNameSort.add(b4);
        booksNameSort.add(b5);
        System.out.println(b1.compareTo(b5));
        System.out.println(b1.compareTo(b3));

        TreeSet<Book> booksPageNumberSort = new TreeSet<>(new BookPageNumberComparator());

        booksPageNumberSort.add(b1);
        booksPageNumberSort.add(b2);
        booksPageNumberSort.add(b3);
        booksPageNumberSort.add(b4);
        booksPageNumberSort.add(b5);
        for(Book book: booksPageNumberSort){
            System.out.println("Kitap adi: " + book.getName() +
            "----->Sayfa Sayısı: " + book.getPageNumber() +
            " Yazar: " + book.getAuthor() +
            " Yayinlanma Tarihi: " + book.getPublishDate());
        }
        
        
       


        
        



    }
}