import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;


class Book {  
int id,quantity;  
String name;  
  
public Book(int id, int quantity, String name) {
	super();
	this.id = id;
	this.quantity = quantity;
	this.name = name;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Book [id=" + id + ", quantity=" + quantity + ", name=" + name + "]";
}


}

class SortQuantity implements Comparator<Book>{
	@Override
	public int compare(Book b1, Book b2) {
		return (b1.getQuantity() - b2.getQuantity());
	}
}

public class SortHashSet{
public static void main(String[] args) {  
    HashSet<Book> set=new HashSet<Book>();  
     
    //Adding Books to HashSet  
    set.add(new Book(101,8,"Harry Potter"));  
    set.add(new Book(102,4,"Champak"));  
    set.add(new Book(103,6, "Hardy Boys")); 
    System.out.println(set);
    
    List<Book> list = new ArrayList<Book>(set);
    Collections.sort(list, new SortQuantity());
    
     
    System.out.println(list);
}  
}