package com.cydeo.controller;

import com.cydeo.dto.AddressDTO;
import com.cydeo.dto.StudentDTO;
import com.cydeo.dto.TeacherDTO;
import com.cydeo.dto.ResponseWrapper;
import com.cydeo.entity.Address;
import com.cydeo.service.AddressService;
import com.cydeo.service.ParentService;
import com.cydeo.service.StudentService;
import com.cydeo.service.TeacherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController: Spring will know that these endpoints will be API endpoints.
//it will by default deserialize and serialize the content; java to json, json to java
@RestController
public class SchoolController {

    private final TeacherService teacherService;
    private final StudentService studentService;
    private final ParentService parentService;
    private final AddressService addressService;

    public SchoolController(TeacherService teacherService, StudentService studentService, ParentService parentService, AddressService addressService) {
        this.teacherService = teacherService;
        this.studentService = studentService;
        this.parentService = parentService;
        this.addressService = addressService;
    }

    @GetMapping("/teachers")
    public List<TeacherDTO> allTeachers(){
        return teacherService.findAll();
        //Spring is smart enough to take these TeacherDTOs and serialize from java to json (Jackson)
    }

    /* create an endpoint for students where json response includes;
    "Students are successfully retrieved." message
    code:200
    success:true
    and student data */

    @GetMapping("/students")
    public ResponseEntity<ResponseWrapper> readAllStudents(){
        List<StudentDTO> studentDTOList = studentService.findAll();
        return ResponseEntity.ok(new ResponseWrapper("Students are successfully retrieved.",studentDTOList));
    }

    /* create a parents endpoint where status code is 202
    additional header has "Parent", "Returned"
    and following body structure:
    "Parents are successfully retrieved." message
    code:202
    success:true
    and parent data
    */

    @GetMapping("/parents")
    public ResponseEntity<ResponseWrapper> readAllParents(){
        ResponseWrapper responseWrapper = new ResponseWrapper(true,"Parents are successfully retrieved.",
                HttpStatus.ACCEPTED.value(),parentService.findAll());
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("Parent","Returned")
                .body(responseWrapper);
    }

    /* create endpoint for individual address information
    /address/1
    return status code 200
    "address .. is successfully retrieved." message
    success true
    and address information
    */

    @GetMapping("/address/{id}")
    public ResponseEntity<ResponseWrapper> getAddress(@PathVariable("id") Long id) throws Exception {
        AddressDTO addressDTO = addressService.findById(id);
        return ResponseEntity.ok(new ResponseWrapper("Address " + id + " is successfully retrieved",addressDTO));
    }

    /* create an endpoint to update individual address information.
    return updated address directly.
    consume temperature information from https://weatherstack.com/product based on the city
    */

    @PutMapping("/address/{id}")
    public AddressDTO updateAddress(@PathVariable("id") Long id, @RequestBody AddressDTO addressDTO) throws Exception {
        addressDTO.setId(id);
        AddressDTO updatedAddress = addressService.update(addressDTO);
        return updatedAddress;
    }










}
