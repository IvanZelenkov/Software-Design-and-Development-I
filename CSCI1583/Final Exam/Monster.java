/*
You have to fill in the lines - 12 (1 point), 26 (2 points). Total - 3 points*/

public class Monster{
//Monsters are capable of attacking heroes. * They have the following two properties: 
	private int attackPower;
	private String breed; //dragon, goblin, hungry cat, etc.


	//Create a Monster instance with attackPower and breed.​ ​
	public Monster(int attackPower, String breed){
		/*Fill in the box*/
		this.attackPower = attackPower;
		this.breed = breed;
	}


	// Returns the breed of this monster. 
  	public String getBreed(){
		return this.breed; 
	}
	
	/* attack(Hero hero) Performs the Monster​’s​. 
	The hero’s health should be reduced by the monster’s attack power.*/
  	public void attack(Hero hero){
  		
  		System.out.println(breed + " is about to attack "+ hero.getName()); 
  		/*Fill in the box*/
		hero.setHealth(hero.getHealth() - attackPower);
  	}
}