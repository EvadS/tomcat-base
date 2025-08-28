package com.se.sample.repository;


import java.util.List;
import java.util.Optional;
import com.se.sample.payload.Task;

public interface TaskManagementRepository {

    void save(Task task);

    List<Task> getAll();

    Optional<Task> get(String taskID);

    void delete(String taskID);
}
