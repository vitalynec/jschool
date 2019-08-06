package com.vitane.jschool.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    @Temporal(TemporalType.DATE)
    private LocalDate birthDay;
    private String login;
    private String password;
    private String about;
    private String adress;
    private List<Role> roleList;

    public void addRole(Role role) {
        roleList.add(role);
    }

    @Transient
    public boolean isAdmin() {
        return roleList.contains(Role.ADMIN);
    }
}
