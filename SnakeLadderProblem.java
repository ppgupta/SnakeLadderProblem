package javapractice;

 public class SnakeLadderUC4 {
public static void main(String[] args) {
	int INITIAL_POSITION=0;
	
int No_Play=1;int Snake=2;int Ladder=3;
  int Final_Position=0;
  while(Final_Position!=100 ) {
		int Dice=((int)Math.floor(Math.random()*60)%6)+1;
		int Pie=((int)Math.floor(Math.random()*30)%3)+1;

  if(Pie==No_Play) {
	  Final_Position=INITIAL_POSITION;
	  INITIAL_POSITION=Final_Position;
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
  if(Final_Position>100) {
	  Final_Position=INITIAL_POSITION;
  }

  INITIAL_POSITION=Final_Position;

  }

}
}