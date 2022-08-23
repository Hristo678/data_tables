package com.example.data_tables.Entities;

import java.util.List;

public class CopyUsersBindingModel {

    private List<CopyUser> users;

    public CopyUsersBindingModel() {
    }

    public CopyUsersBindingModel(List<CopyUser> users) {
        this.users = users;
    }

    public List<CopyUser> getUsers() {
        return users;
    }

    public void setUsers(List<CopyUser> users) {
        this.users = users;
    }
}
