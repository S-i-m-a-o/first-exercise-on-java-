//Guilherme Simao
//3137464

package Griffith;

import java.time.LocalDate;
import java.util.*;

class FriendGroup {
    private final Set<Person> friends = new HashSet<>();

    public void add(Person person) {
        if (person == null) {
            throw new IllegalArgumentException("Person cannot be null.");
        }
        friends.add(person);
    }

    public boolean search(Person person) {
        if (person == null) {
            throw new IllegalArgumentException("Person cannot be null.");
        }
        return friends.contains(person);
    }

    public Set<Person> getAll() {
        return new HashSet<>(friends);
    }

    public Set<Person> getAllBySurname(String surname) {
        Set<Person> result = new HashSet<>();
        for (Person person : friends) {
            if (person.getSurname().equals(surname)) {
                result.add(person);
            }
        }
        return result;
    }

    public Set<Person> getAllByFirstname(String firstname) {
        Set<Person> result = new HashSet<>();
        for (Person person : friends) {
            if (person.getFirstname().equals(firstname)) {
                result.add(person);
            }
        }
        return result;
    }

    public Set<Person> getAllByDateOfBirth(LocalDate date) {
        Set<Person> result = new HashSet<>();
        for (Person person : friends) {
            if (person.getDateOfBirth().equals(date)) {
                result.add(person);
            }
        }
        return result;
    }

    public boolean remove(Person person) {
        return friends.remove(person);
    }

    public List<Person> sort() {
        List<Person> sortedList = new ArrayList<>(friends);
        Collections.sort(sortedList);
        return sortedList;
    }

    public List<Person> sort(Comparator<Person> comparator) {
        List<Person> sortedList = new ArrayList<>(friends);
        sortedList.sort(comparator);
        return sortedList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Person person : friends) {
            sb.append(person.toString()).append("\n");
        }
        return sb.toString();
    }
}
