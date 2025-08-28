package com.se.sample.repository;

import com.se.sample.Task;

import java.util.List;
import java.util.Optional;

public class MemoryTaskRepository implements TaskManagementRepository {


    @Override
    public void save(Task task) {

    }

    @Override
    public List<Task> getAll() {
        return List.of();
    }

    @Override
    public Optional<Task> get(String taskID) {
        return Optional.empty();
    }

    @Override
    public void delete(String taskID) {

    }
}
