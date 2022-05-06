package model.effects;

import model.world.Champion;



public class Embrace extends Effect {
	

	public Embrace(int duration) {
		super("Embrace", duration, EffectType.BUFF);
	}
	public void apply(Champion c){
		c.getAppliedEffects().add(this) ;
		int incHP = (int) 0.2 * c.getMaxHP() ;
		c.setCurrentHP(c.getCurrentHP() + incHP); 
		int incM = (int) 0.2 * c.getMana() ;
		c.setMana(c.getMana()+incM) ;
		int incS = (int) 0.2 * c.getSpeed() ;
		c.setSpeed(c.getSpeed()+incS) ;
		int incAD = (int) 0.2 * c.getAttackDamage();
		c.setAttackDamage(c.getAttackDamage() + incAD);
	}
	public void remove(Champion c){
		c.getAppliedEffects().remove(this) ;
		int decS = (int)( c.getSpeed()/1.2) ;
		c.setSpeed(c.getSpeed() - decS) ;
		int decAD = (int)( c.getAttackDamage()/1.2) ;
		c.setMana(c.getAttackDamage() - decAD) ;
		//not finished yet 
	}
}
