/* This GameStartUp class creates an object of Potion, an object of Hero and an object of Monster.
If health of the Hero goes below 10, he drinks Potion. The Monster keeps attacking the Hero.
The game tarminates when either the health of the Hero becomes 0 or number of attacks become greater
than 5.

You have to fill in 3 boxes in line no. 13, 16, 28 (2 points each). Total - 6 points
*/

public class GameStartUp{
	public static void main(String[] args){
		Potion spinach = new Potion(100);
		//create an object pop of type Hero with name Popeye, health level 20, and potion spinach 
		/*Fill in the box*/
		Hero pop = new Hero("Popeye",10, spinach);
		
		//create an object bluto of type Monster with the attackPower 10 and breed Human 
		/*Fill in the box*/
		Monster bluto = new Monster(10,"Human");

		int noOfattack = 1;
		
		while(pop.getHealth() > 0 && noOfattack < 6){
			
			System.out.println("pop's current health: " + pop.getHealth());
			System.out.println("Attack no. " + noOfattack);
			bluto.attack(pop); //Monster attack pop

			//if health of pop is less than 10, he drinks the potion
			if(pop.getHealth() < 10)
				/*Fill in the box*/ //pop drinks the potion
				pop.drinkHeldPotion();
			
			if(noOfattack == 5)
				System.out.println("Already 5 attacks..No point of attacking any more");
			noOfattack++;
		}
	}
}