package com.soda.app.Controller;

import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @GetMapping
    public String GetTeacher(@RequestParam Long id,@RequestParam String name){
        return "Teacher Id : "+id+"And Name: "+name;
    }

    @GetMapping("/student")
    public String GetStudent(
            @RequestParam(value = "id",required = false) Long StudenttId,
            @RequestParam("name") String StudentName ,
            @RequestParam("sex") String  StudentSex
            ){
        if(StudenttId==null){
            StudenttId = (long) Math.floor(Math.random()*100000);
        }
        return "Student Id : "+StudenttId+" Student Name : "+StudentName+" Student Sex: "+StudentSex;

    }


    @GetMapping("/student/one")
    public String GetStudentOne(
            @RequestParam(value = "id",required = false) Optional<Long> StudentId,
            @RequestParam("name") String StudentName ,
            @RequestParam("sex") String  StudentSex
    ){
       Long getId = StudentId.orElse((long)Math.floor(Math.random()*10000));

        return "Student Id : "+getId+" Student Name : "+StudentName+" Student Sex: "+StudentSex;

    }
}
