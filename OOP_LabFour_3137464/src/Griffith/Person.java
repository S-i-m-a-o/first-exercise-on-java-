//Guilherme Simao
//3137464

package Griffith;

import java.time.LocalDate;
import java.util.*;

final class Person implements Comparable<Person> {
    private final String surname;
    private final String firstname;
    private final LocalDate dateOfBirth;

    Person(String firstname, String surname, LocalDate dateOfBirth) {
        this.firstname = firstname;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public String getSurname() {
        return surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return firstname + " " + surname + " " + dateOfBirth;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Person person = (Person) other;
        return firstname.equals(person.firstname) &&
               surname.equals(person.surname) &&
               dateOfBirth.equals(person.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, surname, dateOfBirth);
    }

    @Override
    public int compareTo(Person person) {
        return this.firstname.compareTo(person.firstname);
    }
}

