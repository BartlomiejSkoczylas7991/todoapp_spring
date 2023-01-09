package com.example.todoapp.logic;

import com.example.todoapp.model.TaskGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class TempService{
    @Autowired
    void temp(TaskGroupRepository repository){
        repository.findAll();
        //
    }
}