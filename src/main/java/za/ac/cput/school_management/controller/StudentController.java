package za.ac.cput.school_management.controller;

/*
 *  Author:BS Brady Sheldon 219053715
 *  Student
 *  June Assignment
 * i tried but failed:')
 * */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.school_management.domain.Student;
import za.ac.cput.school_management.service.StudentServiceImp;

import java.util.List;


@RestController
@RequestMapping("country")
public class StudentController {
    private StudentServiceImp StudentService;

    @Autowired public StudentController(StudentServiceImp StudentService){
        this.StudentService =StudentService;
    }
    @PostMapping("save")
    public ResponseEntity<Student> save(Student student){
        Student save = StudentService.save(student);
        return ResponseEntity.ok(save);
    }
    @GetMapping("read/{StudentID}")
    public  ResponseEntity<Student> read(@PathVariable String StudentID) {
        Student student = this.StudentService.read(StudentID).orElseThrow(
                ()->new ResponseStatusException(HttpStatus.NOT_FOUND));
        return  ResponseEntity.ok(student);
    }
    @GetMapping("readCountryName")
    public ResponseEntity<Student> findByStudent_IDOrderByLastName( @PathVariable String getStudentID) {
        Student student = this.StudentService.findByStudent_IDOrderByLastName(getStudentID);
        return ResponseEntity.ok(student);
    }
    @DeleteMapping("Delete")
    public ResponseEntity<Void> delete(Student student){
        this.StudentService.delete(student);
        return ResponseEntity.noContent().build();

    }
    @GetMapping("all")
    public ResponseEntity <List<Student>> findAll(){
        List<Student> studentList = this.StudentService.findAll();
        return ResponseEntity.ok(studentList);
    }
}
