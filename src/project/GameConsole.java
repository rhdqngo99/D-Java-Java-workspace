package project;

import java.util.Scanner;

public class GameConsole {
	
	public void Console(){
		
		Scanner scan = new Scanner(System.in);
		
		GamePlayer pl1 = new GamePlayer();
		GamePlayer pl2 = new GamePlayer();
		System.out.println("플레이어 이름을 설정 해주세요.");
		pl1.setPlName(scan.next());
		pl2.setPlName(scan.next());
		System.out.println("플레이어1 의 이름은 :" + pl1.getPlName());
		System.out.println("플레이어2 의 이름은 :" + pl2.getPlName());
		
		
		
		
		
		
		
		
	
	}
	
	public void Rule(){
		System.out.println("룰설명 하는중 ");
	}

}
