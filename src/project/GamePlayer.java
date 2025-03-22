package project;

import java.util.ArrayList;

public class GamePlayer {
	
	private String plNum; // 플레이너 넘버 (1p,2p)
	private String PlName; // 플레이어 이름
	private int score;    // 점수
	private ArrayList<GameRecrd> Recrd = new ArrayList<>(); //점수 기록표
	private int bonus;    // 보너스
	private int total;    // 총 합계
	
	public GamePlayer() {}

	public GamePlayer(String plNum, String plName, int score, ArrayList<GameRecrd> recrd, int bonus, int total) {
		super();
		this.plNum = plNum;
		PlName = plName;
		this.score = score;
		Recrd = recrd;
		this.bonus = bonus;
		this.total = total;
	}
	

	public String getPlNum() {
		return plNum;
	}

	public void setPlNum(String plNum) {
		this.plNum = plNum;
	}

	public String getPlName() {
		return PlName;
	}

	public void setPlName(String plName) {
		PlName = plName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public ArrayList<GameRecrd> getRecrd() {
		return Recrd;
	}

	public void setRecrd(ArrayList<GameRecrd> recrd) {
		Recrd = recrd;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "GamePlayer [plNum=" + plNum + ", PlName=" + PlName + ", score=" + score + ", Recrd=" + Recrd
				+ ", bonus=" + bonus + ", total=" + total + "]";
	}
	

}
