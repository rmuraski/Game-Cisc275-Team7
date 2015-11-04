package team7.game;

public class User {
	String name;
	int score;
	boolean highScore;
	
	public boolean isHighScore(){
		return highScore;
	}
	public int getScore(){
		return score;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setScore(int score){
		this.score=score;
	}
	public void setHighScore(boolean isHighScore){
		this.highScore=isHighScore;
	}
	User(String name){
		setName(name);
		setScore(0);
		setHighScore(false);
	}
}
