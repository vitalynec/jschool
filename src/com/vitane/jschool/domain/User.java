package com.vitane.jschool.domain;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate birthDay;
    private String login;
    private String password;
    private String about;
    private String adress;
    private List<Role> roleList;

    public void addRole(Role role) {
        roleList.add(role);
    }

    public boolean isAdmin() {
        return roleList.contains(Role.ADMIN);
    }
}
