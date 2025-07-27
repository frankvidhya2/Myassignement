package testleaf;

public class LibraryManagement {
    
	public static void main(String[] args) {
		Library myLibrary = new Library();
		String addedBook = myLibrary.addBook("python");
        System.out.println("Added Book: " + addedBook);
        myLibrary.issueBook();

	}

}
