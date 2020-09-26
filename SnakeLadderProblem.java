package javapractice;

public class SnakeLadderUC6 {
	public static void main(String[] args) {
		int INITIAL_POSITION=0;
		int No_Play=1;int Snake=2;int Ladder=3;
	    int Final_Position=0;int count=0;
	    while(Final_Position!=100 ) {
			int Dice=((int)Math.floor(Math.random()*60)%6)+1;
			int Pie=((int)Math.floor(Math.random()*30)%3)+1;

	  if(Pie==No_Play) {
		  Final_Position=INITIAL_POSITION;
	  }
	  else if(Pie==Snake){
		  Final_Position=INITIAL_POSITION+Dice;
	  }
	  else {
		  Final_Position=INITIAL_POSITION-Dice;{
			  if(Final_Position<=0) {
				  Final_Position=0;
			  }		  
		  }
	  }
	  
	  count++;
	  if(Final_Position>100) {
		  Final_Position=INITIAL_POSITION;
	  }
	  INITIAL_POSITION=Final_Position;
	  System.out.println("Position of dice after each roll : "+Final_Position);

	  }
	  
	  System.out.println("Total Number of times dice rolled: "+count);

	}
}
