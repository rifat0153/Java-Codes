package Mi222ks_assign3;
import java.util.Random;


public class Fight {
	private Player player1;
	private Player player2;
	private int pxp;
	private int exp;
	

	
	public Fight(Player player1, Player player2, int pxp, int exp) {
		super();
		this.player1 = player1;
		this.player2 = player2;
		this.pxp = pxp;
		this.exp = exp;
	}






	public void startFight(int playerdice, int enemydice) {
		
		Random rand = new Random();
		// nocp1 = no of chance for player 1 to attack
		int nocp1 = this.player1.getWeapon().getPower();
		int nocp2 = rand.nextInt(2) + 2;     // getting value 2-4 for enemy damage
	
		
		int playerpoints = 0;
		int enemypoints = 0;
		int hit;

		int mode = 0;
		
//		if( this.player1.getType() == "Enemy") {
//			mode = 0;
//		}
//		else {
//			mode = 1;
//		}
		
		
		// Mode will be used to determine who will attack....... Mode == 0 -----> Hero attacks  otherwise Enemy attacks
	
		
		// Fight Continues until loop breaks 
		while(true) {
			
			System.out.println("\n\nBegining PXP  :"+ this.pxp);
			System.out.println("Begining EXP  :"+ this.exp);
			System.out.println("\n\n");

			
			
			//Player Attacks
			
			playerpoints = 0;
			enemypoints = 0;
			hit = 0;
			
			if( mode == 0) {
				//adding 1 as random returns (0-5), but we need 6 value dice for hero
				
				
				
				for( int i=0; i<playerdice; i++) {
					playerpoints = playerpoints + rand.nextInt(6) + 1;		// 6 sided dice for player
					System.out.println(" P roles :"+playerpoints);
				}
				
				for( int i=0; i<enemydice; i++) {
					enemypoints = enemypoints + rand.nextInt(5) + 1;		// 5 sided dice for enemy
					System.out.println(" E roles :"+enemypoints);
				}
				
				
				
				if( playerpoints > enemypoints) {
					
					System.out.println(this.player1.getName() +" strike has gone through and hit "+this.player2.getName());
					
					
					for( int i=0; i<nocp1; i++) {
						hit = hit + rand.nextInt(6) + 1;
					}
					
					System.out.println(" P hitpoints :"+hit);
					exp = exp - hit;
					
					if( exp<0 ) {
						System.out.println(this.player2.getName()+" Lost the Game");
						break;
					}
					else {
						System.out.println(this.player2.getName()+" took the hit but is still alive");
					}
	
				}
				else {
					System.out.println(this.player1.getName() +" Tries his best but "+this.player2.getName()+" dodges the blow");
				}
	
				
				//Enemy Attacks
				
				playerpoints = 0;
				enemypoints = 0;
				hit = 0;
				

				for( int i=0; i<enemydice; i++) {
					enemypoints = enemypoints + rand.nextInt(5) + 1;		// 5 sided dice for enemy
					System.out.println(" E roles :"+enemypoints);
				}
				
				for( int i=0; i<playerdice; i++) {
					playerpoints = playerpoints + rand.nextInt(6) + 1;		// 6 sided dice for player
					System.out.println(" P roles :"+playerpoints);
				}

				if( enemypoints > playerpoints) {
					
					System.out.println(this.player2.getName() +" blow has gone through and hit "+this.player1.getName());
					
					hit = rand.nextInt(14) + 1;			// Enemy Hit point
		
					pxp = pxp - hit;
					
					System.out.println(" E hitpoints :"+hit);
					
					if( pxp<0 ) {
						System.out.println(this.player1.getName()+" is DEAD");
						break;
					}
					else {
						System.out.println(this.player1.getName()+" takes a powerful blow but is stil alive");
					}
	
				}
				else {
					System.out.println(this.player2.getName() +" Tries his best but "+this.player1.getName()+" dodges the blow");
				}
				
			}
			
			System.out.println("\n\nEND PXP  :"+ this.pxp);
			System.out.println("END EXP  :"+ this.exp);
		}



		
		
	}






	public Player getPlayer1() {
		return player1;
	}






	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}






	public Player getPlayer2() {
		return player2;
	}






	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}






	public int getPxp() {
		return pxp;
	}






	public void setPxp(int pxp) {
		this.pxp = pxp;
	}






	public int getExp() {
		return exp;
	}






	public void setExp(int exp) {
		this.exp = exp;
	}
	
	

	
}
