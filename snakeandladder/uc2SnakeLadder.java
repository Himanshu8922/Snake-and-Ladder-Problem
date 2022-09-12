package snakeandladder;

public class uc2SnakeLadder {
	
	static int position=0;
    public static void main(String[] args) {
       
       int diceNumber=(int) Math.floor(Math.random()*10)%6 + 1;
       System.out.println("Dice Number is: " +diceNumber);
       }

}
