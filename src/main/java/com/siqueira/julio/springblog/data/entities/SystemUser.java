package com.siqueira.julio.springblog.data.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
@Entity
@Table(name = "users", indexes = {@Index(name = "idx_user_email", columnList = "email")})
public class SystemUser extends AbstractEntity<Long> implements Serializable {

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @JsonIgnore
    @Column(name = "password", nullable = false)
    private String password;

    @ManyToMany
    @JoinTable(
            name = "usuarios_tem_perfis",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")}
    )
    private List<Role> roles;

    @Column(name = "active", nullable = false, columnDefinition = "TINYINT(1)")
    private boolean active;

    @Column(name = "verifier_code", length = 6)
    private String verifierCode;

    public SystemUser() {
        super();
    }

    public SystemUser(Long id) {
        super.setId(id);
    }

    // adiciona papeis a lista
    public void addRole(RoleType type) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(new Role(type.getCod()));
    }

    public SystemUser(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getVerifierCode() {
        return verifierCode;
    }

    public void setVerifierCode(String verifierCode) {
        this.verifierCode = verifierCode;
    }
}