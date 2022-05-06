package model.effects;

import model.world.Champion;

public class Shield extends Effect {
	
	static int temp = 0; 
	
	public Shield( int duration) {
		super("Shield", duration, EffectType.BUFF);
		
	}
	public void apply(Champion c){
		c.getAppliedEffects().add(this);
		temp = c.getSpeed();
		int incsp = (int) (c.getSpeed() + c.getSpeed()*0.02);
		c.setSpeed(incsp);
		// not finished yet 
	}
	public void remove(Champion c){
		c.getAppliedEffects().remove(this);
		c.setSpeed(temp);
		//not finished yet 
	}
}
