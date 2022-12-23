package uz.abdukarim.Likopchik.webRest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.abdukarim.Likopchik.model.Student;

import java.sql.Struct;

@RestController
@RequestMapping("/api")
public class StudentResponse {

    @GetMapping("students")
    public ResponseEntity sayHello(){
        return ResponseEntity.ok("Hello");
    }

    @PostMapping("/students")
    public ResponseEntity addStudents(@RequestBody Student student){
        return ResponseEntity.ok(student);
    }

    @PutMapping("/students")
    public ResponseEntity update(@RequestBody Student student){
        return ResponseEntity.ok(student);
    }

    @PutMapping("/students/{id}") // path variable with use { id }, request param ?
    public ResponseEntity updateSecond(@PathVariable long id,
                                       @RequestBody Student student){
        return ResponseEntity.ok(student);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity getId(@PathVariable long id){
        return ResponseEntity.ok(null);
    }

    @PatchMapping("/student/{id}")
    public ResponseEntity updatePatch(@PathVariable long id,
                                      @RequestBody Student student){
        return ResponseEntity.ok("Bajarildi!");
    }



}
