package com.sit.hrpmis.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by md. mithu sarker on 20/03/2022.
 */

@Data
@Entity
@Table(name = "thana")
public class Thana {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="thana_id", nullable=false, unique=true)
    private Long thanaId;

    @Column(name = "THANA_NAME")
    private String thanaName;

    @Column(name = "SHORT_NAME")
    private String shortName;


    @Column(name = "district_id")
    private Long district;


    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_by")
    private String updateBy;

    @Column(name = "updated_on")
    private Date updateOn;


}
