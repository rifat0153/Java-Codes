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






	public void startFight() {
		
		Random rand = new Random();
		
		
		int playerdice = this.player1.getDice();
		int enemydice = this.player2.getDice();
		
		int playerpoints = 0;
		int enemypoints = 0;
		int hit;

		int mode = 0;
		int round = 1;
		
//		if( this.player1.getType() == "Enemy") {
//			mode = 0;
//		}
//		else {
//			mode = 1;
//		}
		
		
		// Mode will be used to determine who will attack....... Mode == 0 -----> Hero attacks  otherwise Enemy attacks
	
		
		// Fight Continues until loop breaks 
		while(true) {
			
			System.out.println("ROUND :"+ round + " begins");
			System.out.println("\nBegining PXP  :"+ this.pxp);
			System.out.println("Begining EXP  :"+ this.exp);
		

			
			
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
				
				
				// Checking if ENEMY defense is penetrated
				if( playerpoints > enemypoints) {
					
					System.out.println(this.player1.getName() +" strike has gone through and hit "+this.player2.getName());
					
					// Dealing with hero having no weapon
					if( this.player1.getWeapon() != null) {
						for( int i=0; i<this.player1.getWeapon().getPower(); i++) {
							hit = hit + rand.nextInt(6) + 1;
						}
					}
					else {
						hit = rand.nextInt(2) + 2;
					}

					
					System.out.println(" P hitpoints :"+hit);
					exp = exp - hit;
					
					if( exp<0 ) {
						System.out.println(this.player2.getName()+" Lost the Game");
						System.out.println("ROUND :"+ round + " ENDS");
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
				
				// Resetting values
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

				// Checking if HERO defense is penetrated
				if( enemypoints > playerpoints) {
					
					System.out.println(this.player2.getName() +" blow has gone through and hit "+this.player1.getName());
					
					hit = rand.nextInt(14) + 1;			// Enemy Hit point is randomly generated between 0-14
		
					pxp = pxp - hit;
					
					System.out.println(" E hitpoints :"+hit);
					
					if( pxp<0 ) {
						System.out.println(this.player1.getName()+" is DEAD");
						System.out.println("ROUND :"+ round + " ENDS");
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
			
			System.out.println("END PXP  :"+ this.pxp);
			System.out.println("END EXP  :"+ this.exp);
			
			System.out.println("ROUND :"+ round + " ENDS\n\n");
			
			round++;
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
