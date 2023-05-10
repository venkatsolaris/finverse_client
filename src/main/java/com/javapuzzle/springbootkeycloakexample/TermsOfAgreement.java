package com.javapuzzle.springbootkeycloakexample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="terms_of_agreement")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class TermsOfAgreement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int userID;

    @Column(name="agreement_text")
    private String agreementText;


    @Column(name="created_date")
    private LocalDate createdDate;

    @Column(name="updated_date")
    private LocalDate updatedDate;
}
