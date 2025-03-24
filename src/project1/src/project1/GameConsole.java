package project1;

import java.util.Scanner;

// controller
public class GameConsole {
	
	public void Console(){
		
		Scanner scan = new Scanner(System.in);
		
		// 유저 설정
		System.out.println("플레이어1의 이름을 설정 해주세요.");
		GamePlayer pl1 = new GamePlayer();
		pl1.setPlName(scan.next());
		System.out.println("플레이어2의 이름을 설정 해주세요.");
		GamePlayer pl2 = new GamePlayer();
		pl2.setPlName(scan.next());
		
		System.out.println("플레이어1 이름: " + pl1.getPlName());
		System.out.println("플레이어2 이름: " + pl2.getPlName());
		
		// 주사위 굴리기
		GameDice gameDice = new GameDice();
	    gameDice.rollDice();
	    gameDice.printDice(); 
	    
	    //점수 계산 부분
	    GameScoreboard scoreboard = new GameScoreboard();
	    scoreboard.recordUpperSection("0", 0);
	    scoreboard.displayScoreboard();
	
	}
	
	public void Rule(){
		System.out.println("룰설명 하는중 ");
	}

}
