package com.example.demostudent;

import com.example.demostudent.Entity.Student;
import com.example.demostudent.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/demo")
public class StudentController {
        @Autowired
        StudentRepository studentRepository;
//    @GetMapping("/student")
//    public List<StudentPOJO> hello(){
//        return List.of(new StudentPOJO(
//                1,
//                "Abc",
//                "123"
//        ), new StudentPOJO(
//             2,
//             "ABC",
//             "Week"
//        ));
//    }
//
//    @GetMapping("/{id}")
//    public StudentPOJO get(@PathVariable(name="id") int ids){
//        return new StudentPOJO(
//                ids,
//                "Test",
//                "Test1"
//        );
//    }

    @PostMapping("/student")
    public Student make(@RequestBody Student student){
        return studentRepository.save(student);
    }

    @GetMapping("/student")
    public List<Student> getAll(){
        return studentRepository.findAll();
    }

    @GetMapping("/student/{id}")
    public Student getById(@PathVariable Long id){
        return studentRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/student/{id}")
    public void delete(@PathVariable Long id){
                studentRepository.deleteById(id);

    }

    @GetMapping("/student/find")
    public List<Student> find(String name){
        //return studentRepository.findByRollnoContainingOrAddressContaining(name,name);
        return studentRepository.findByRollContainingOrAddressContaining(name,name);
    }
}
