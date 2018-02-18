package com.kiafarhang.quaff.battle;

import java.util.*;
import com.kiafarhang.quaff.*;

public class Battle {
    private Collection<HasBattleStats> sideA;
    private Collection<HasBattleStats> sideB;
    private List<HasBattleStats> turnOrder;
    private boolean isOver;

    public Battle(Collection<HasBattleStats> sideA, Collection<HasBattleStats> sideB) {
        this.isOver = false;
        this.sideA = sideA;
        this.sideB = sideB;
        this.turnOrder = generateTurnOrder(this.sideA, this.sideB);

    }

    private void round() {
        // Iterate through the turnOrder
        for (Iterator<HasBattleStats> it = this.turnOrder.iterator(); it.hasNext();) {
            HasBattleStats combatant = it.next();
            Collection<HasBattleStats> enemies = this.sideA.contains(combatant) ? this.sideB : this.sideA;
            Random random = new Random();

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

        // turnOrder.sort(new AgilityComparator());

        turnOrder.sort(
                (HasBattleStats a, HasBattleStats b) -> b.getCurrentStats().getAGI() - a.getCurrentStats().getAGI());

        return turnOrder;
    }

    // private class AgilityComparator implements Comparator<HasBattleStats> {
    //     @Override
    //     public int compare(HasBattleStats a, HasBattleStats b) {
    //         int agilityA = a.getCurrentStats().getAGI();
    //         int agilityB = b.getCurrentStats().getAGI();
    //         if (agilityA > agilityB) {
    //             return 1;
    //         } else if (agilityA < agilityB) {
    //             return -1;
    //         } else {
    //             return 0;
    //         }
    //     }
    // }
}