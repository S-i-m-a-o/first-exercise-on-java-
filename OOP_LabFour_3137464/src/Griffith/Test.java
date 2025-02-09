//Guilherme Simao
//3137464

package Griffith;

import java.time.LocalDate;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        // Create test data
        Person p1 = new Person("Joe", "Bloggs", LocalDate.of(1990, 4, 16));
        Person p2 = new Person("Mary", "Murphy", LocalDate.of(1997, 5, 30));
        Person p3 = new Person("Tim", "Robins", LocalDate.of(1998, 1, 6));
        Person p4 = new Person("Anna", "Smith", LocalDate.of(1992, 3, 10));
        Person p5 = new Person("John", "Doe", LocalDate.of(1985, 8, 25));
        Person p6 = new Person("Kate", "Winslet", LocalDate.of(1993, 12, 2));

        // Create FriendGroups
        FriendGroup group1 = new FriendGroup();
        FriendGroup group2 = new FriendGroup();

        // Add friends to groups
        group1.add(p1);
        group1.add(p2);
        group1.add(p3);

        group2.add(p4);
        group2.add(p5);
        group2.add(p6);

        // Test methods
        System.out.println("Group 1:");
        System.out.println(group1);
        System.out.println("Group 2:");
        System.out.println(group2);

        // Test for duplicates
        Map<Person, FriendGroup> map1 = new HashMap<>();
        map1.put(p1, group1);

        Map<Person, FriendGroup> map2 = new HashMap<>();
        map2.put(p4, group2);

        for (Person key : map1.keySet()) {
            if (map2.containsKey(key)) {
                System.out.println("Duplicate person found in both groups: " + key);
            }
        }

        // Exception handling
        try {
            group1.add(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

