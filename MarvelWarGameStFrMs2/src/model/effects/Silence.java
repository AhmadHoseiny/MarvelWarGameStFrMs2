package model.effects;

import model.world.Champion;

public class Silence extends Effect {

	public Silence( int duration) {
		super("Silence", duration, EffectType.DEBUFF);
		
	}
	public void apply(Champion c){
		
		// not finished yet 
	}
	public void remove(Champion c){
		
		//not finished yet 
	}
}
