package com.example.Studbackend;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api//StudentDeatils")
public class StudentController{

    @Autowired

    private StudentService service;

    @PostMapping("/post")
    public @ResponseBody ResponseEntity<?> post(@RequestBody Student bean,UriComponentsBuilder ucb ){
        System.out.println("controller");
        service.save(bean);
        HttpHeaders headers = new HttpHeaders();
    //  headers.setLocation(ucb.path("/get/{rollno}").buildAndExpand(bean.getname()).toUri());

        return new ResponseEntity<>(headers, HttpStatus.CREATED);

    }
     @GetMapping("/get")
  public @ResponseBody ResponseEntity<List<Student>> all() {
      System.out.println("get Method");
      return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
  }

  @GetMapping("/get/{rollno}")
  public @ResponseBody ResponseEntity<?> getById(@PathVariable Integer rollno) {
    //   System.out.println("get by rollno " + rollno);


      Student result = service.find(rollno);
      //System.out.println(bookCategory);
      return new ResponseEntity<>(result, HttpStatus.OK);

  }
    @DeleteMapping("/delete/{rollno}")
    public @ResponseBody ResponseEntity<?> delete(@PathVariable Integer rollno){
        service.delete(rollno);
        return new ResponseEntity<>(HttpStatus.OK);
    }

     @PutMapping("/put/{rollno}")
  public ResponseEntity<?> update(@PathVariable Number rollno, @RequestBody Student bean) {
      System.out.println("update");
        // service.updateDetails(rollno,bean);
      service.save(bean);
      return new ResponseEntity<>(bean, HttpStatus.OK);
  }


}