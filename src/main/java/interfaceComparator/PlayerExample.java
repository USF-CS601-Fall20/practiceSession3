package interfaceComparator;

import java.util.*;

// Create two Comparator classes: one that compares players by batting average
// (scores within eps = 0.01 are considered equal)
// and one that compares players by name
// Use each of them to sort the list of players
public class PlayerExample {
    public static void main(String[] args) {
        Player p1 = new Player("A", 0.367);
        Player p2 = new Player("B", 0.312);
        Player p3 = new Player("C", 0.389);

        List<Player> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        // Call the sorting method
        // Todo
    }
}
