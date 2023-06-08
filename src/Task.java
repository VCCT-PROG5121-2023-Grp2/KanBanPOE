import javax.swing.*;

public class Task {
    private final String taskName;
    private final int taskNumber;
    private final String taskDescription;
    private final String developerFirstName;
    private final String developerLastName;
    private final int taskDuration;
    private final String taskID;
    private WorkerClass.TaskStatus taskStatus; // Add taskStatus field

    public Task(String taskName, int taskNumber, String taskDescription, String developerFirstName, String developerLastName, int taskDuration, String taskID) {
        this.taskName = taskName;
        this.taskNumber = taskNumber;
        this.taskDescription = taskDescription;
        this.developerFirstName = developerFirstName;
        this.developerLastName = developerLastName;
        this.taskDuration = taskDuration;
        this.taskID = taskID;
    }

    public String printTaskDetails() {
        // Add taskStatus to the printTaskDetails method
        return "Task Status: " + taskStatus + "\nDeveloper Details: " + developerFirstName + " " + developerLastName +
                "\nTask Number: " + taskNumber + "\nTask Name: " + taskName +
                "\nTask Description: " + taskDescription + "\nTask ID: " + taskID +
                "\nTask Duration: " + taskDuration + " hours";
    }

    public int getTaskDuration() {
        return taskDuration;
    }

    public WorkerClass.TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(WorkerClass.TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }
}