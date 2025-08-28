package com.se.sample.repository;

import com.se.sample.payload.Task;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class InMemoryTaskManagementRepository implements TaskManagementRepository {

    Map<String, Task> tasks = new HashMap<>();


    @Override
    public void save(Task task) {
        tasks.put(task.getIdentifier(), task);
    }

    @Override
    public List<Task> getAll() {
        return tasks.values().stream()
                .collect(Collectors.toUnmodifiableList());
    }

    @Override
    public Optional<Task> get(String taskID) {
        return Optional.ofNullable(tasks.get(taskID));
    }

    @Override
    public void delete(String taskID) {
        tasks.remove(taskID);
    }
}