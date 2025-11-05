package com.jonatas.api.todo.api.todo.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;

public class Base implements Serializable {
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "created_by", nullable = false, length = 100)
    private String createdBy;

    @Column(name = "updated_by", nullable = false, length = 100)
    private String updatedBy;
}
