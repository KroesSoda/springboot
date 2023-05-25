package com.soda.app.Model.Entity;

import com.soda.app.Model.Embeddable.GeneralInfo;
import jakarta.persistence.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Entity
public class TeacherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private GeneralInfo generalInfoTeacher;

    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "firstname",column = @Column(name = "Teacher_Firstname")),
            @AttributeOverride(name = "lastname",column = @Column(name = "Teachar_Lastname")),
            @AttributeOverride(name = "phone",column = @Column(name = "Teacher_Phone")),
            @AttributeOverride(name = "address",column = @Column(name = "Teacher_Address"))
    })


    private  GeneralInfo generalInfoEmpployee;




    public Long getIdId() {
        return id;
    }

    public GeneralInfo getGeneralInfoTeacher() {
        return generalInfoTeacher;
    }



    @Embedded

    @AttributeOverrides(value = {
          @AttributeOverride(name = "firstname", column = @Column(name = "EmpFirstName", length = 23)),
            @AttributeOverride(name = "lastname",column = @Column(name = "EmpLastName")),
            @AttributeOverride(name = "Phone",column = @Column(name = "EmpPhone" ,length = 25)),
            @AttributeOverride(name = "address", column = @Column(name = "EmpAddress", length = 30))

    })


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TeacherEntity that = (TeacherEntity) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
