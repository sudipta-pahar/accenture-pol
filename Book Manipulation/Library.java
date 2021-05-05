import java.util.*;
public class Library{
    private ArrayList<Book> bookList= new ArrayList<Book>();
    public void setBookList(ArrayList<Book> bookList){
        this.bookList= bookList;
    }
    public ArrayList<Book> getBookList(){
        return bookList;
    }
    public void addBook(Book obj){
        bookList.add(obj);
    }
    public boolean isEmpty(){
        if(bookList.size()==0)
            return true;
        else
            return false;
    }
    public ArrayList<Book> viewAllBooks(){
        ArrayList<Book> obj= new ArrayList<Book>();
        for(int i=0; i<bookList.size(); i++)
            obj.add(bookList.get(i));
        return obj;
    }
    public ArrayList<Book>viewBooksByAuthor(String author){
        ArrayList<Book> obj= new ArrayList<Book>();
        for(int i=0; i<bookList.size(); i++){
            if(bookList.get(i).getAuthor().contains(author)){
                obj.add(bookList.get(i));
            }
        }
        return obj;
    }
    public int countnoofbook(String bname){
        int count=0;
        for(int i=0; i<bookList.size(); i++){
            if(bookList.get(i).getBookName().contains(bname)){
                count++;
            }
        }
        return count;
    }
}