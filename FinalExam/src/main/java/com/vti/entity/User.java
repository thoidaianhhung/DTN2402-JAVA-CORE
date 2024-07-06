package com.vti.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private int expInYear;
    private String proSkill;
    private int projectId;
    private Role role;

    public enum Role {
        MANAGER, EMPLOYEE;
    }
    public void setRole(String role) {this.role = Role.valueOf(role);}
}
