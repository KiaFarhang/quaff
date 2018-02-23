package com.kiafarhang.quaff.battle;

import java.util.*;
import com.kiafarhang.quaff.*;

public class Battle {
    private Collection<HasBattleStats> sideA;
    private Collection<HasBattleStats> sideB;
    private boolean isOver;

    public Battle(Collection<HasBattleStats> sideA, Collection<HasBattleStats> sideB) {
        this.isOver = false;
        this.sideA = sideA;
        this.sideB = sideB;

    }

    private void round() {
        List<HasBattleStats> turnOrder = generateTurnOrder(sideA, sideB);

        // Iterate through the turnOrder
        for (Iterator<HasBattleStats> it = turnOrder.iterator(); it.hasNext();) {
            HasBattleStats currentCombatant = it.next();
            if (currentCombatant.getCurrentStats().getHP() > 0) {
                boolean isPlayerSide = this.sideA.contains(currentCombatant);
                if (isPlayerSide) {
                    // Ask who to attack
                } else {
                    HasBattleStats target = findLowestDEF(this.sideA);
                    int damage = AttackFormula.calculateDamage(currentCombatant, target);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(currentCombatant.toString());
                }
            }
            // Collection<HasBattleStats> enemies = this.sideA.contains(combatant) ? this.sideB : this.sideA;
            // Random random = new Random();

        }

        // Get handle on opposing list; get its size
        // Find out whether this combatant is on the player side
        // If on player, prompt for attack (will work on later)
        // If enemy, get current size of opposing list.
    }

    /**
     * Generates a turn order of battle combatants sorted by their agility stat.
     * @param sideA One side of battle combatants
     * @param sideB The other side of battle combatants
     * @return A sorted ArrayList of battle combatants
     */
    static List<HasBattleStats> generateTurnOrder(Collection<HasBattleStats> sideA, Collection<HasBattleStats> sideB) {
        List<HasBattleStats> turnOrder = new ArrayList<HasBattleStats>();
        for (HasBattleStats combatant : sideA) {
            turnOrder.add(combatant);
        }
        for (HasBattleStats combatant : sideB) {
            turnOrder.add(combatant);
        }

        turnOrder.sort(
                (HasBattleStats a, HasBattleStats b) -> b.getCurrentStats().getAGI() - a.getCurrentStats().getAGI());

        return turnOrder;
    }

    /**
     * Finds the item in a collection with the lowest DEF stat. If two objects have the same
     * DEF stat, returns the first of the two to occur in the list.
     * @param list The list of objects with battle stats to search.
     * @return The object in the list with the lowest DEF stat.
     */
    static HasBattleStats findLowestDEF(Collection<HasBattleStats> list) {
        Iterator<HasBattleStats> iterator = list.iterator();
        HasBattleStats lowestDEF = iterator.next();
        while (iterator.hasNext()) {
            HasBattleStats nextObject = iterator.next();
            if (nextObject.getCurrentStats().getDEF() < lowestDEF.getCurrentStats().getDEF()) {
                lowestDEF = nextObject;
            }
        }

        return lowestDEF;
    }
}