package testleaf;

public class Library {
     public String addBook(String bookTitle) {
    	 System.out.println("Book added successfully");
    	 return bookTitle;
     }
	public void issueBook() {
	  System.out.println("Book issued successfully");
	}
	public static void main(String[]args) {
		Library myLibrary = new Library();
		String addedBook = myLibrary.addBook("Java Programming");
        System.out.println("Added Book: " + addedBook);
        myLibrary.issueBook();
		
	}

}
