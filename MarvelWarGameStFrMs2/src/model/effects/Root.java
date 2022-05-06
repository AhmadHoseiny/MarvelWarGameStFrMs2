package model.effects;

import java.util.ArrayList;

import model.abilities.Ability;
import model.abilities.DamagingAbility;
import model.abilities.HealingAbility;
import model.world.Champion;

public class Root extends Effect {

	public Root( int duration) {
		super("Root", duration, EffectType.DEBUFF);
		
	}
	public void apply(Champion c){
		
		// not finished yet 
	}
	public void remove(Champion c){
		
		//not finished yet 
	}
}
