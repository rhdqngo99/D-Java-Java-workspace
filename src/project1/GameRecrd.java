package project1;

public class GameRecrd {
	
	private int recrd;
	
	public GameRecrd() {}

	public GameRecrd(int recrd) {
		super();
		this.recrd = recrd;
	}

	public int getRecrd() {
		return recrd;
	}

	public void setRecrd(int recrd) {
		this.recrd = recrd;
	}

	@Override
	public String toString() {
		return "GameRecrd [recrd=" + recrd + "]";
	}
	
}