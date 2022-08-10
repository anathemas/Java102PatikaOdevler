import java.util.Comparator;

public class Book implements Comparable {
    private String name;
    private int pageNumber;
    private String author;
    private String publishDate;


    public Book(String name, int pageNumber, String author, String publishDate){
    this.name = name;
    this.pageNumber = pageNumber;
    this.author = author;
    this.publishDate = publishDate;
   }

   @Override
public int compareTo(Object o) {
    return 0;
}
    
    public int compareTo(Book o, Book o2) {
        int a = (this.getName()).compareTo(o.getName());
        
        if (a>0){
            System.out.println(o.getName() +"\n" + this.getName());
        } else {
            System.out.println(this.getName() +"\n" + o.getName());
        } 
        return a;
    }

   public String getName() {
    return name;
    }


public void setName(String name) {
    this.name = name;
    }


public int getPageNumber() {
    return pageNumber;
    }   


public void setPageNumber(int pageNumber) {
    this.pageNumber = pageNumber;
    }


public String getAuthor() {
    return author;
    }


public void setAuthor(String author) {
    this.author = author;
    }


public String getPublishDate() {
    return publishDate;
    }


public void setPublishDate(String publishDate) {
    this.publishDate = publishDate;
    }







    
    
}
