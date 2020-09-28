package com.ualr.simpletasklist.model;

import com.ualr.simpletasklist.MainActivity;

import java.util.HashMap;
import java.util.Map;
import java.lang.StringBuilder;

public class TaskList {

    private Map<Integer, Task> taskList;
    private int id;

    public TaskList(Map<Integer, Task> taskList) {
        this.taskList = taskList;
        this.id = id;
    }

    public TaskList() {
        taskList = new HashMap<>();
        id = 0;
    }

    public Map<Integer, Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(Map<Integer, Task> taskList) {
        this.taskList = taskList;
    }

    public void add(String taskDescription) {
        if(!taskDescription.isEmpty()) taskList.put(id++, new Task(taskDescription, false));
    }

    public void delete(int id) {
        taskList.remove(id);
    }

    public void markDone(int id) {
        taskList.get(id).setTaskDone(true);
    }

    public String toString(){
        StringBuilder out = new StringBuilder();
        for(int i = 0; i < taskList.size(); i++) {
            if(taskList.get(i) == null) continue;
            out.append( i + " - " + taskList.get(i).taskDescription);
            if(taskList.get(i).taskDone) out.append(" Done\n");
            else out.append("\n");
        }
        return out.toString();
    }

// TODO 03. Define TaskList's attributes. The class will have just one attribute to store all
    //  the tasks created by the user.

    // TIP. We need a data structure able to dynamically grow and shrink. That's why we'll use a HashMap.
    // where keys will be integer values and the mapped values will be a task object

    // TODO 04. Define the class constructor and the corresponding getters and setters.

    // TODO 06.03. Define a new method called "add" that, given a task description, will create a
    //  new task and add it to the task list.

    // TODO 06.04. Define a new "toString" method that provides a formatted string with all the tasks in the task list.
    // Format: 1 line per task. Each line should start with the id number of the task, then a dash, and the task description right after that.
    // If the task is marked as done, "Done" should be included at the end of the line

    // TODO 07.03. Define a new method called "delete" that, given a task id, will delete the
    //  corresponding task from the task list.

    // TODO 08.03. Define a new method called "markDone" that, given a task id, will mark the
    //  corresponding task as done.

}
