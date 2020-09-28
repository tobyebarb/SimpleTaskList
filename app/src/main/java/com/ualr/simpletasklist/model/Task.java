package com.ualr.simpletasklist.model;

public class Task {

    String taskDescription;
    boolean taskDone;

    public Task(String taskDescription, boolean taskDone) {
        this.taskDescription = taskDescription;
        this.taskDone = taskDone;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public boolean isTaskDone() {
        return taskDone;
    }

    public void setTaskDone(boolean taskDone) {
        this.taskDone = taskDone;
    }
// TODO 01. Define two attributes for the Task class: one to store the task description and a second one that
    //  indicates whether the task is done or not

    // TODO 02. Define the class constructor and the corresponding getters and setters.

}
