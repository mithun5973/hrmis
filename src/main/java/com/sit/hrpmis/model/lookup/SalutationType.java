package com.sit.hrpmis.model.lookup;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "salutation_types")
public class SalutationType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SALUTATION_TYPE_NO", nullable = false, unique = true)
    private Long salutationTypeNo;


    @Column(name = "SALUTATION")
    private String salutation;


    @Column(name = "GENDER_NO")
    private Long genderNo;
}
