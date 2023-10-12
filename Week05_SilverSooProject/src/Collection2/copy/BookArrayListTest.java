package Collection2.copy;

import java.util.Scanner;

public class BookArrayListTest {
	
	public static void main(String[] args) {
		BookArrayList bookArrayList = new BookArrayList();
		
		Book b1 = new Book(0001, "파우스트");
		Book b2 = new Book(0002, "황무지");
		Book b3 = new Book(0003, "변신");
		Book b4 = new Book(0004, "픽션들");
		Book b5 = new Book(0005, "톨스토이");
		
		bookArrayList.addBook(b1);
		bookArrayList.addBook(b2);
		bookArrayList.addBook(b3);
		bookArrayList.addBook(b4);
		bookArrayList.addBook(b5);
		
		bookArrayList.showAllBook();
	
		Scanner s = new Scanner(System.in);
		System.out.println("도서를 추가할 위치를 입력: ");
		int insertIndex = s.nextInt();
		System.out.print("책 ID 입력: ");
		int bookId = s.nextInt();
		s.nextLine();
		System.out.println("책 제목 입력: ");
		String title = s.nextLine();
		
		Book newBook = new Book(bookId, title);
		bookArrayList.insertBook(insertIndex, newBook);
		
		bookArrayList.showAllBook();
		
		s.close();
	}

}
