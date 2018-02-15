package com.kiafarhang.quaff.battle;

import java.util.*;
import com.kiafarhang.quaff.*;

public class Battle {
    private Collection<HasBattleStats> sideA;
    private Collection<HasBattleStats> sideB;
    private List<HasBattleStats> turnOrder;

    public Battle(Collection<HasBattleStats> sideA, Collection<HasBattleStats> sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        List<HasBattleStats> turnOrder = new ArrayList<HasBattleStats>();
        for (HasBattleStats combatant : sideA) {
            turnOrder.add(combatant);
        }
        for (HasBattleStats combatant : sideB) {
            turnOrder.add(combatant);
        }

        turnOrder.sort(new AgilityComparator());

        // turnOrder.sort((a, b) -> a.getCurrentStats().getAGI() < b.getCurrentStats() ? -1 : a.getCurrentStats().getAGI() == b.getCurrentStats().getAGI() ? 0 : 1)

    }

    private class AgilityComparator implements Comparator<HasBattleStats> {
        @Override
        public int compare(HasBattleStats a, HasBattleStats b) {
            int agilityA = a.getCurrentStats().getAGI();
            int agilityB = b.getCurrentStats().getAGI();
            if (agilityA > agilityB) {
                return 1;
            } else if (agilityA < agilityB) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}