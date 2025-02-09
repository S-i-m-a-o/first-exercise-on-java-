//Guilherme Simao 3137464
package Griffith;

import java.time.LocalDate;


//Class Assessment
class Assessment {
    private final String title;
    private final String content;
    private Submission status;
    private final LocalDate timeStamp;

    // Constructor
    public Assessment(String title, String content, LocalDate timeStamp) {
        if (title == null || content == null || timeStamp == null) {
            throw new IllegalArgumentException("Title, content, and timestamp cannot be null");
        }
        this.title = title;
        this.content = content;
        this.status = Submission.NO_SUBMISSION;
        this.timeStamp = timeStamp;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Submission getStatus() {
        return status;
    }

    public LocalDate getTimeStamp() {
        return timeStamp;
    }

    // Method to update submission status
    public void updateStatus(Submission newStatus) {
        if (newStatus == null) {
            throw new IllegalArgumentException("Status cannot be null");
        }
        this.status = newStatus;
    }

    @Override
    public String toString() {
        return "Assessment{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", status=" + status +
                ", timeStamp=" + timeStamp +
                '}';
    }
}
  		 


