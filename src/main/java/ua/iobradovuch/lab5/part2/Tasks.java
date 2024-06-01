package ua.iobradovuch.lab5.part2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tasks {
    private List<String> tasks;

    public void addTask(String task) {
        this.tasks.add(task);
    }

    public void removeTask(String task) {
        this.tasks.remove(task);
    }

    public void displayTasks() {
        System.out.println("Tasks: " + this.tasks);
    }
}