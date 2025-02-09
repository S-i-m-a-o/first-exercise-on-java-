//Guilherme Simao 3137464
package Griffith;

import java.time.LocalDate;
import java.util.ArrayList;

// Singleton class AssignmentSubmission
public class AssignmentSubmission {
    private static AssignmentSubmission instance; // Singleton instance
    private final ArrayList<Assessment> assessments;
    private final DeadLine deadline;

    // Private constructor
    private AssignmentSubmission(DeadLine deadline) {
        if (deadline == null) {
            throw new IllegalArgumentException("Deadline cannot be null.");
        }
        this.deadline = deadline;
        this.assessments = new ArrayList<>();
    }

    // Static method to get the single instance
    public static AssignmentSubmission getInstance(DeadLine deadline) {
        if (instance == null) {
            instance = new AssignmentSubmission(deadline);
        }
        return instance;
    }

    // Getter for assessments
    public ArrayList<Assessment> getAssessments() {
        return assessments;
    }

    // Getter for deadline
    public DeadLine getDeadline() {
        return deadline;
    }

    // Method to submit an assessment
    public void submit(Assessment assessment) {
        if (assessment == null) {
            throw new IllegalArgumentException("Assessment cannot be null.");
        }

        LocalDate currentDate = LocalDate.now();
        Submission newStatus;

        if (assessments.contains(assessment)) {
            // If the assessment already exists, mark as UPDATED or LATE
            newStatus = deadline.beforeDeadline(currentDate) ? Submission.UPDATED : Submission.LATE;
        } else {
            // First submission
            newStatus = deadline.beforeDeadline(currentDate) ? Submission.SUBMITTED : Submission.LATE;
            assessments.add(assessment); // Add the assessment
        }

        // Update the assessment status and timestamp
        assessment.updateStatus(newStatus);
    }

    @Override
    public String toString() {
        return "AssignmentSubmission{" +
                "assessments=" + assessments +
                ", deadline=" + deadline +
                '}';
    }
}