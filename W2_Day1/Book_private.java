package W2_Day1;

import java.util.Scanner;

public class Book_private {

		
	    private String title, author;
			
		public Book_private(String title, String author) {
		this.title = title;
		this.author = author;
		
		}
		public String getTitle() {
			return title;
		}


		public void setTitle(String title) {
			this.title = title;
		}


		public String getAuthor() {
			return author;
		}


		public void setAuthor(String author) {
			this.author = author;
		}
	
		

		public static void main(String[] args) {
									
			Book_private book[] = new Book_private[2]; 
			
			Scanner s = new Scanner(System.in);
			
			// 값을 넣는 부분(객체를 배열에 넣는 부분)
			for (int i = 0; i < book.length; i++) {
				
				System.out.println("제목 >> ");
				String title = s.nextLine();
				
				System.out.println("저자 >> ");
				String author = s.nextLine();
				
				book[i] = new Book_private(title, author);
				
				
			}
			// 값을 출력하는 부분
			for (int i = 0; i < book.length; i++) {
				System.out.println("제목 : " + book[i].getTitle() );
				System.out.println("저자 : " + book[i].getAuthor() );
			}
			
			
			
			String title = s.nextLine();
		}


	

}