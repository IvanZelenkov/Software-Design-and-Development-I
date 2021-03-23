/* A potion has a healthBoost property. healthBoost is 
how much health should be restored when the potion is consumed.

Nothing to fill in this file

*/


public class Potion{

    private int healthBoost;
	  
	public Potion(int healthBoost){ 
	  		this.healthBoost = healthBoost;
    }
    public int getHealthBoost(){
			return this.healthBoost; 
	}
}