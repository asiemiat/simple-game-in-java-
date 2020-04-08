class Quiz{
	Player p1;
	Player p2;
	Player p3;
	
	public void startgame(){
		
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		int typep1 = 0;
		int typep2 = 0; 
		int typep3 = 0;
		
		boolean p1shot = false;
		boolean p2shot = false; 
		boolean p3shot = false; 
		
		int guessedNumber = (int) (Math.random() * 10);
        System.out.println("I think about number from 0 to 9...");		
		
		while(true){
			
			System.out.println("You should select the number: " + guessedNumber);
			
			p1.shoot();
			p2.shoot();
			p3.shoot();
			
			typep1 = p1.number;
			System.out.println("Player 1 select number: " + typep1);
			
			typep2 = p2.number;
			System.out.println("Player 2 select number: " + typep2);
			
			typep1 = p3.number;
			System.out.println("Player 3 select number: " + typep3);
			
			if(typep1 == guessedNumber){
				p1shot = true;
			}
			
			if(typep2 == guessedNumber){
				p2shot = true;
			}
			
			if(typep3 == guessedNumber){
				p3shot = true;
			}
			
			if(p1shot || p2shot || p3shot){
				
				System.out.println("We have winner !");
				System.out.println("Was the player first selected correctly? " + p1shot);
				System.out.println("Was the player second selected correctly " + p2shot);
				System.out.println("Was the player third selected correctly? " + p3shot);
				System.out.println("End of game");
				break;
			}
			else{
				
				System.out.println("Players will have to try again");
			}
			
		}
		
	}
	
}

class Player{
	int number = 0;
	
	public void shoot(){
		
		number = (int) (Math.random() * 10);
		System.out.println("I select a number: " + number);
		
	}
}

class GameStarter{
	
	public static void main(String[] args){
		
		Quiz game = new Quiz();
		game.startgame();
		
		
	}
		
}
