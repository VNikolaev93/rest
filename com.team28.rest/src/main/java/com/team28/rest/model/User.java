package com.team28.rest.model;

import org.springframework.data.annotation.Id;

import java.util.List;

public class User {

    @Id private final Long id;
    private final String name;
    private final String email;
    private final List<Long> interests;

    public User(Long id, String name, String email, List<Long> interests) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.interests = interests;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Long> getInterests() {
        return interests;
    }
}
