package javapractice;

public class SnakeLadderUC7 {
		public static void main(String[] args) {
			int Player1_INITIAL_POSITION=0;
			  int Player2_INITIAL_POSITION=0;
			  int No_Play=1;int Ladder=2;int Snake=3;
			  int Player1_Final_Position=0;int count=0;
			  int Player2_Final_Position=0; //int Final_Position=0;
		 while(Player1_Final_Position!=100 &&Player2_Final_Position!=100 ) {
				int DiceP1=((int)Math.floor(Math.random()*60)%6)+1;
				int PieP1=((int)Math.floor(Math.random()*30)%3)+1;

		  if(PieP1==No_Play) {
			  Player1_Final_Position=Player1_INITIAL_POSITION;
		  }
		  else if(PieP1==Ladder){
			  Player1_Final_Position=Player1_INITIAL_POSITION+DiceP1;
			int Dice1=((int)Math.floor(Math.random()*60)%6)+1;
			Player1_Final_Position=Player1_INITIAL_POSITION+Dice1;

		  }
		  else {
			  Player1_Final_Position=Player1_INITIAL_POSITION-DiceP1;{
				  if(Player1_Final_Position<=0) {
					  Player1_Final_Position=0;
				  }		  
			  }
		  }
		  
		  
		  if(Player1_Final_Position>100) {
			  Player1_Final_Position=Player1_INITIAL_POSITION;
		  }
		  Player1_INITIAL_POSITION=Player1_Final_Position;
		  System.out.println("Position of dice of Player 1 after"+count+"th roll : "+Player1_Final_Position);
		  //player 2 code
		  
		  int DiceP2=((int)Math.floor(Math.random()*60)%6)+1;
			int PieP2=((int)Math.floor(Math.random()*30)%3)+1;
			if(PieP2==No_Play) {
				  Player2_Final_Position=Player2_INITIAL_POSITION;
			  }
			  else if(PieP2==Ladder){
				  Player2_Final_Position=Player2_INITIAL_POSITION+DiceP1;
				int Dice2=((int)Math.floor(Math.random()*60)%6)+1;
				Player2_Final_Position=Player2_INITIAL_POSITION+Dice2;

			  }
			  else {
				  Player2_Final_Position=Player2_INITIAL_POSITION-DiceP1;{
					  if(Player2_Final_Position<=0) {
						  Player2_Final_Position=0;
					  }		  
				  }
			  }
			if(Player2_Final_Position>100) {
				  Player2_Final_Position=Player2_INITIAL_POSITION;
			  }
			  Player2_INITIAL_POSITION=Player2_Final_Position;
			  System.out.println("Position of dice of Player 2 after"+count+"th roll : "+Player2_Final_Position);
		 count++; 
		 }
  System.out.println("Total count "+count);
  System.out.println(Player1_Final_Position);
  System.out.println(Player2_Final_Position);
	if(Player1_Final_Position>Player2_Final_Position) {
		  System.out.println("Player 1 won the game");

	}
	else {
		  System.out.println("Player 2 won the game");
		
	}
	}
}
