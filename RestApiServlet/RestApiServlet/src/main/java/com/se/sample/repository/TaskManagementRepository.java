package com.se.sample.repository;


import com.se.sample.Task;

import java.util.List;
import java.util.Optional;

public interface TaskManagementRepository {

    void save(Task task);

    List<Task> getAll();

    Optional<Task> get(String taskID);

    void delete(String taskID);
}