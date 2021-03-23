/*Fill in the missing portions of the following code example. 
The code example consists of three classes that could be used in a text-based adventure game.

Specification for Hero objects of our game. In this game, a Hero is a
pacifist. They don’t fight back -- they just drink potions to stay healthy! 

You have to fill in the boxes in line no. - 17, 24, 30, 40, 54, 55, 59 (3 points each).Total - 21 points
*/

public class Hero {
/* Properties of Hero objects. Have health, name, and can carry a Potion.*/
  private String name;
  private int health;
  private Potion flask;
	
	//Constructor sets up an instance of Hero
	public Hero( /* Fill in the box*/ String name, int health, Potion flask) {
		this.name = name; 
		this.health = health; 
		this.flask = flask;
	}

	//getName() Returns the name of this Hero
	public /* Fill in the box*/ String getName() {
		return this.name; 
	}

	//Returns a reference to the Potion object held by this Hero
   public Potion getFlask(){
		/*Fill in the box*/
	   return this.flask = flask;
   }

   public int getHealth(){
  		return health;
  	}

  /*setHealth(int newHealth) Changes the health of the Hero
	newHealth must be greater than or equal to 0. If it isn’t, set the hero’s health to 0. */
  public void setHealth(int newHealth){
  	/*Fill in the box*/
	  if (newHealth >= 0) {
		  this.health = newHealth;
	  }
	  else {
		  this.health = 0;
	  }
  }

  // This setter method changes the Potion this Hero is holding.*/
	public void setPotion(Potion flask){
		this.flask = flask;
	}

	/* drinkHeldPotion() should have the hero try to consume their Potion object. 
	* Specifically, if the hero is holding a potion, have this hero drink it by 
	increasing the Hero’s health by their held potion’s “healthBoost” property, 
	then discard it. If the hero is not holding a potion, print out:
 	“no potion is at hand!”*/
	public void drinkHeldPotion(){ 
		if(this.getFlask() != /*Fill the box*/ flask ){
			this.setHealth(this.health+ flask.getHealthBoost()/*Fill the box*/);
   			this.flask = null; // the potion has been drunk! Throw it away!
		} 
		else{
			/*Fill in the box*/
			System.out.println("no potion is at hand!");
		} 
	}

}












