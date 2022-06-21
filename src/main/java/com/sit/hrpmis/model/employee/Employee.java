package com.sit.hrpmis.model.employee;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EMPLOYEE_NO", nullable = false, unique = true)
    private Long employeeNo;

    @Column(name = "EMPLOYEE_ID")
    private String employeeId;


    @Column(name = "SALUTATION_TYPE_NO")
    private Long salutationTypeNo;


    @Column(name = "FIRST_NAME")
    private String firstName;


    @Column(name = "LAST_NAME")
    private String lastName;


    @Column(name = "DISPLAY_NAME")
    private String displayName;


    @Column(name = "EMPLOYEE_TYPE_NO")
    private Long employeeTypeNo;


    @Column(name = "DATE_OF_BIRTH")
    private Date dateOfBirth;


    @Column(name = "NATIONAL_ID")
    private String nationalId;


    @Column(name = "CONTACT_NUMBER")
    private String contactNumber;


    @Column(name = "EMERGENCY_CONTACT_NUMBER")
    private String emergencyContactNumber;


    @Column(name = "PERSONAL_EMAIL")
    private String personalEmail;


    @Column(name = "OFFICIAL_EMAIL")
    private String officialEmail;


    @Column(name = "NATIONALITY_NO")
    private Long nationalityNo;


    @Column(name = "HOME_DISTRICT_NO")
    private Long homeDistrictNo;


    @Column(name = "RELIGION_NO")
    private Long religionNo;


    @Column(name = "GENDER_NO")
    private Long genderNo;


    @Column(name = "BLOOD_GROUP_NO")
    private Long bloodGroupNo;


    @Column(name = "DESIGNATION_NO")
    private Long designationNo;


    @Column(name = "DEPARTMENT_NO")
    private Long departmentNo;


    @Column(name = "GRADE_NO")
    private Long gradeNo;


    @Column(name = "SECTION_NO")
    private Long sectionNo;


    @Column(name = "BIRTH_PLACE_NO")
    private Long birthPlaceNo;


    @Column(name = "MARITAL_STATUS_NO")
    private Long maritalStatusNo;


    @Column(name = "DATE_OF_JOINING")
    private Date dateOfJoining;


    @Column(name = "DEPARTURE_DATE")
    private Date departureDate;


    @Column(name = "DATE_OF_PERMANENT")
    private Date dateOfPermanent;


    @Column(name = "SALARY_UNIT_NO")
    private Long salaryUnitNo;


    @Column(name = "CURRENT_BASIC")
    private Double currentBasic;


    @Column(name = "GROSS_SALARY")
    private Double grossSalary;


    @Column(name = "IN_TIME")
    private String inTime;


    @Column(name = "OUT_TIME")
    private String outTime;


    @Column(name = "SERVICE_STATUS_TYPE_NO")
    private Long serviceStatusTypeNo;


    @Column(name = "JOB_LOCATION")
    private String jobLocation;


    @Column(name = "EMPLOYEE_PHOTO")
    private String employeePhoto;


    @Column(name = "CREATED_ON")
    private Date createdOn;


    @Column(name = "CREATED_BY")
    private Long createdBy;


    @Column(name = "UPDATE_ON")
    private Date updateOn;


    @Column(name = "UPDATE_BY")
    private Long updateBy;
}
