package model.abilities;

import model.effects.*;
import java.util.ArrayList;
import model.world.Damageable;
import model.world.* ;
public class CrowdControlAbility extends Ability {
	private Effect effect;

	public CrowdControlAbility(String name, int cost, int baseCoolDown, int castRadius, AreaOfEffect area, int required,
			Effect effect) {
		super(name, cost, baseCoolDown, castRadius, area, required);
		this.effect = effect;

	}

	public Effect getEffect() {
		return effect;
	}
	public void execute(ArrayList<Damageable> targets) {
		for(Damageable da : targets){
			if(da instanceof Champion){
				Champion c = (Champion) da ;
				Effect e = this.getEffect() ;
				e.apply(c);
				c.setMana(c.getMana() - this.getManaCost());
				c.setCurrentActionPoints(c.getCurrentActionPoints() - this.getRequiredActionPoints());
			}
			
		}
	}

}
