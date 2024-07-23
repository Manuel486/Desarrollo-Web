package com.manuel.springboot.app.springbootcrud.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.manuel.springboot.app.springbootcrud.validation.ExistByUsername;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @ExistByUsername
    @Column(unique = true)
    @NotBlank
    @Size(min = 4,max = 12)
    private String username;


    @NotBlank
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY) // Le damos acceso solamente cuando se escribe, no cuando se lee, solo cuando se deserializa
    // Otra alternativa
//    @JsonIgnore // Ignora completanebte tanto para leer como escribir, no me permitiria guardar
    private String password;

    @ManyToMany
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(name= "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"),
            uniqueConstraints = { @UniqueConstraint(columnNames = {"user_id","roles_id"}) }
    )
    private List<Role> roles;

    private Boolean enabled;


    @Transient  // No es un atributo que este mapeado a la base de datos
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private boolean admin;

    @PrePersist
    public void prePersist() {
        if(enabled == null) enabled = true;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
