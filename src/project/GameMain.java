package project;

import java.util.ArrayList;
import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		GameConsole gameConsole = new GameConsole();
		
		while(true) {
			
		System.out.println("Yacht Dice");			
		System.out.println("1.게임 실행");		
		System.out.println("2.게임 종료");		
		System.out.println("3.게임 룰 보기");
		
		int choice = scan.nextInt();
		if(choice == 1) {
			gameConsole.Console();
		} else if(choice == 2) {
			System.out.println("게임을 종료 합니다.");
			break;
		} else if(choice == 3) {
			gameConsole.Rule();
		}else {
			System.out.println("잘못된 값을 입력 하였습니다.");
		}
		System.out.println(choice + "선택");
		
		
		}

		
		
		
//		ArrayList<GamePlayer> list = new ArrayList<>();
		

	}

}
