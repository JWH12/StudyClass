package day3;

import java.util.Random;
import java.util.Scanner;

public class Ex_3_가위바위보 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // 플레이어
				int p;

				// 컴퓨터
				int c;

				// 가위 바위 보 담기
				String ps = "";
				String cs = "";

				// 승 패
				int win = 0;
				int lose = 0;

				// 진행 여부
				boolean con = true;

				Scanner sc = new Scanner(System.in);
				Random ran = new Random();

				while (con) {
					System.out.println("가위(0), 바위(1), 보(2) 입력 : ");
					p = sc.nextInt(); // 사용자 입력
					c = ran.nextInt(3); // 컴퓨터

					if (p >= 0 && p < 3) {
						// 가위 바위 보 문자 담기 (player)
						switch (p) {
							case 0:
								ps = "가위";
								break;
							case 1:
								ps = "바위";
								break;
							case 2:
								ps = "보";
								break;
						}

						// 가위 바위 보 문자 담기 (컴퓨터)
						switch (c) {
							case 0:
								cs = "가위";
								break;
							case 1:
								cs = "바위";
								break;
							case 2:
								cs = "보";
								break;
						}

						System.out.println("Player : " + ps);
						System.out.println("컴퓨터 : " + cs);

						// 이겼을 때
						if ((p == 0 && c == 2) || (p == 1 && c == 0) || (p == 2 && c == 1)) {
							System.out.println("Player Win");
							win++; // 승 수
						}
						// 졋을 때 (컴퓨터가 이겼을 때)
						else if ((p == 0 && c == 1) || (p == 1 && c == 2) || (p == 2 && c == 0)) {
							System.out.println("Computer Win");
							lose++; // 패 수
						}
						// 비겼을 때
						else {
							System.out.println("비겼습니다.");
						}

						// 전적 출력
						System.out.println("Player ==> " + win + "승 " + lose + "패 ");

						// 진행 여부
						while (con) {
							System.out.println("재대결(1), 종료(2)");
							int input = sc.nextInt();

							// 종료
							if (input == 2) {
								System.out.println("종료되었습니다.");
								con = false;
							}
							// 1, 2 외에 다른 수 입력
							else if (input != 1){
								System.out.println("잘못입력하셨습니다. 1(재대결), 2(종료) 중 입력해주세요.");
							}
							// 1 (재대결) 입력
							else {
								break;
							}
						}

					} else {
						System.out.println("0 ~ 2 사이의 숫자를 입력해주세요.");
					}
				}
			}
		

	}


