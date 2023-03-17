package W2_Day5;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class 스트림Test2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		FileWriter fout = null;
		int c;
		
		try {
			fout = new FileWriter("D:\\새 폴더\\test.txt");
			
			while(true) {
			
			String line = scanner.nextLine();
			
			if(line.length() == 0)
			
				break;
			
			fout.write(line, 0, line.length());
			
			fout.write("\r\n", 0, 2);	//엔터를 기입하기 위해서 입력한 코드 // \r\n을 입력하면 메모장에서 엔터값을 출력해준다.
			}
			
			fout.close();
			} catch (IOException e) {
			
			System.out.println("입출력 오류");
			}
			
		scanner.close();
		
		
		
	} //엔터 두번을 둘러 마무리한다.
	
	
	
	
	
}
