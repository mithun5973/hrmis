package com.sit.hrpmis.model.lookup;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "gen_nationalities")
public class Nationality {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "NATIONALITY_NO", nullable = false, unique = true)
    private Long nationalityNo;


    @Column(name = "NATIONALITY")
    private String nationality;
}
