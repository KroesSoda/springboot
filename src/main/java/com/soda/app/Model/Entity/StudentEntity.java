package com.soda.app.Model.Entity;

import com.soda.app.Model.Constance.Enums.GenderEnum;
import com.soda.app.Model.Embeddable.ContactInformation;
import jakarta.persistence.*;
import org.hibernate.Hibernate;

import java.util.Date;
import java.util.Objects;

@Entity
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stu_id")
    private Long id;

    @Column(name = "stu_first_name",nullable = false,unique =true,length = 30)
    private String firstname;

    @Column(name = "stu_last_name",nullable = false,unique = true,length = 30)
    private String lastname;

    @Column(name = "stu_Date",columnDefinition = "timestamptz")
    @Temporal(TemporalType.DATE)
    private Date dob;

    @Transient
    private String fullname;

    @Enumerated(EnumType.STRING)
    private GenderEnum genderenum;

    @Column(columnDefinition = "varchar (50) default 'spring boot'")
    private  String subject;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        StudentEntity that = (StudentEntity) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }


    @Embedded
    private ContactInformation contact;
}
