package W2_Day1;

import java.util.Scanner;

public class Book {
		
		String title, author;
			
		public Book(String title, String author) {
		this.title = title;
		this.author = author;
		
		}
		

		public static void main(String[] args) {
									
			Book book[] = new Book[2]; 
			
			Scanner s = new Scanner(System.in);
			
			// 값을 넣는 부분(객체를 배열에 넣는 부분)
			for (int i = 0; i < book.length; i++) {
				
				System.out.println("제목 >> ");
				String title = s.nextLine();
				
				System.out.println("저자 >> ");
				String author = s.nextLine();
				
				book[i] = new Book(title, author);
				
				
			}
			// 값을 출력하는 부분
			for (int i = 0; i < book.length; i++) {
				System.out.println("제목 : " + book[i].title );
				System.out.println("저자 : " + book[i].author );
			}
			
			
			
			String title = s.nextLine();
		}
	

}
