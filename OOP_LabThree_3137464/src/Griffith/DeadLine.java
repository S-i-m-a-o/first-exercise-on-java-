//Guilherme Simao 3137464
package Griffith;

import java.time.LocalDate;

//Imutable Class Deadline
public final class DeadLine {
 private final LocalDate date;

 // Construtor
 public DeadLine(LocalDate date) {
     if (date == null) {
         throw new IllegalArgumentException("Date cannot be null");
     }
     this.date = date;
 }

 // Getter
 public LocalDate getDate() {
     return date;
 }

 //Method to check if date is before deadline
 public boolean beforeDeadline(LocalDate time) {
     if (time == null) {
         throw new IllegalArgumentException("Time cannot be null");
     }
     return time.isBefore(date);
 }

 @Override
 public String toString() {
     return "Deadline: " + date;
 }
}

//Enum Submission with 4 states 
enum Submission {
 NO_SUBMISSION, 
 SUBMITTED,     
 UPDATED,      
 LATE          
}
