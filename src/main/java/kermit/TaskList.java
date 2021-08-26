package kermit;

import kermit.tasks.Task;

import java.util.ArrayList;
import java.util.List;

/**
 * kermit.command.ToDo list stores items
 */
public class TaskList extends ArrayList<Task> {

    /**
     * kermit.command.ToDo constructor
     */
    public TaskList() {
        super();
    }

    public TaskList(List<Task> taskArr) {
        super(taskArr);
    }

    public Task completeTask(int index) {
        Task task = super.get(index);
        task.markAsComplete();
        return task;
    }

    public Task deleteTask(int index) {
        Task task = super.get(index);
        super.remove(index);
        return task;
    }

    /**
     * @return String representation of todo list
     */
    @Override
    public String toString() {
        String stringifiedList = "";
        for (int i = 0; i < super.size(); i++) {
            stringifiedList += (i + 1) + ". " + super.get(i).toString();
            // After last item should not have line break
            if (i < super.size() - 1) {
                stringifiedList += "\n";
            }
        }
        return stringifiedList;
    }
}