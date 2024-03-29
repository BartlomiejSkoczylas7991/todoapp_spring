package com.example.todoapp.model;


import java.util.List;
import java.util.Optional;

public interface ProjectRepository {
    List<Project> findAll();

    Optional<Project> findById(Integer Id);

    Project save(Project entity);
}
