package model.abilities;

import java.util.ArrayList;
import model.world.Damageable;
import model.world.* ;
public class DamagingAbility extends Ability {
	
	private int damageAmount;
	public DamagingAbility(String name, int cost, int baseCoolDown, int castRadius, AreaOfEffect area,int required,int damageAmount) {
		super(name, cost, baseCoolDown, castRadius, area,required);
		this.damageAmount=damageAmount;
	}
	public int getDamageAmount() {
		return damageAmount;
	}
	public void setDamageAmount(int damageAmount) {
		this.damageAmount = damageAmount;
	}
	
	public void execute(ArrayList<Damageable> targets) {
		for(Damageable da : targets){
			da.setCurrentHP(da.getCurrentHP()-this.getDamageAmount());
			if(da instanceof Champion){
				Champion c = (Champion) da ;
				c.setMana(c.getMana() - this.getManaCost()) ;
				c.setCurrentActionPoints(c.getCurrentActionPoints() - this.getRequiredActionPoints());
			}
			
		}
	}

}
