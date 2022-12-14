package com.example.todoapp.model;


import javax.persistence.Embeddable;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

@Embeddable
class Audit {

    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;

    @PrePersist
    void PrePersist(){
        createdOn = LocalDateTime.now();
    }

    @PreUpdate
    void PreMerge(){
        updatedOn = LocalDateTime.now();
    }

}
