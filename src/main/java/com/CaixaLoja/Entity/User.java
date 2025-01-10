package com.CaixaLoja.Entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name ="tb_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID userid;

    @Column(name="username")
    private String username;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;

    @CreationTimestamp
    private Instant creationTimesTemp;

    @UpdateTimestamp
    private Instant updateTimesTemp;

    public UUID getUserid() {
        return userid;
    }

    public void setUserid(UUID userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public Instant getCreationTimesTemp() {
        return creationTimesTemp;
    }

    public void setCreationTimesTemp(Instant creationTimesTemp) {
        this.creationTimesTemp = creationTimesTemp;
    }

    public Instant getUpdateTimesTemp() {
        return updateTimesTemp;
    }

    public void setUpdateTimesTemp(Instant updateTimesTemp) {
        this.updateTimesTemp = updateTimesTemp;
    }

    public User(UUID userid, String username, String email, String password, Instant creationTimesTemp, Instant updateTimesTemp) {
        this.userid = userid;
        this.username = username;
        this.email = email;
        this.password = password;
        this.creationTimesTemp = creationTimesTemp;
        this.updateTimesTemp = updateTimesTemp;
    }
    public User(){}
}
