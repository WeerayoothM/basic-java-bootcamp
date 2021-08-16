package com.example.hellorest.user;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Users {
    @JsonProperty("")
    private List<JsonMember> users;

    public List<JsonMember> getUsers() {
        return users;
    }

    public void setUsers(List<JsonMember> users) {
        this.users = users;
    }
}
