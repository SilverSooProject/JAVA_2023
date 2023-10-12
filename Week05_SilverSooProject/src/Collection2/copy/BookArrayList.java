package Collection2.copy;

import java.util.ArrayList;


public class BookArrayList {
	private ArrayList<Book> arrayList;
	
	public BookArrayList() {
		arrayList=new ArrayList<Book>();
	}
	
	public void addBook(Book b) {
		arrayList.add(b);
	}
	
	public boolean removeBook(int BookId) {
		for(int i=0;i<arrayList.size();i++) {
			Book book = arrayList.get(i);
			int tempId = book.getBookId();
			if(tempId == BookId) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(BookId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void insertBook(int index, Book b) {
		arrayList.add(index, b);
	}
	
	public void showAllBook() {
		for(Book b:arrayList) {
			System.out.println(b);
		}
		System.out.println();
	}

}
