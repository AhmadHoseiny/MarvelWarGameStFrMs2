package model.world;

import java.util.ArrayList;
import model.effects.*;

public class Hero extends Champion {

	public Hero(String name, int maxHP, int maxMana, int actions, int speed, int attackRange, int attackDamage) {
		super(name, maxHP, maxMana, actions, speed, attackRange, attackDamage);

	}
	public void useLeaderAbility(ArrayList<Champion> targets) {
		for(Champion c : targets) {
			ArrayList<Effect> curE = c.getAppliedEffects();
			for(Effect e : curE) {
				if(e.getType().equals(EffectType.DEBUFF)) {
					curE.remove(e);
				}		
			}
			Effect newE = new Embrace(2);
			newE.apply(c);
		}
	}
	
}
