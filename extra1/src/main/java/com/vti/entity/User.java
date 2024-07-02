package com.vti.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private int id;
    private String full_name;
    private String email;
    private String password;
    private int exp_in_year;
    private String pro_skill;
    private int id_project;
    private Role role;

    public enum Role {
        MANAGER, EMPLOYEE;
    }

    public void setRole(String role) {this.role = Role.valueOf(role);}
}
