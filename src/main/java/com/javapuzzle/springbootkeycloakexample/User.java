package com.javapuzzle.springbootkeycloakexample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int userID;

    @Column(name="username")
    private String userName;

    @Column(name="email")
    private String email;

    @Column(name="name")
    private String name;

    @Column(name="date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name="location")
    private String location;

    @Column(name="privacy_acceptance")
    private boolean privacyAcceptance;

    @Column(name="terms_acceptance")
    private boolean termsAcceptance;

    @Column(name="created_date")
    private LocalDate createdDate;

    @Column(name="updated_date")
    private LocalDate updatedDate;



}
