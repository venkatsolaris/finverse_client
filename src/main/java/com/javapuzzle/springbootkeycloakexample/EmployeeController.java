package com.javapuzzle.springbootkeycloakexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/admin/employee")
    @RolesAllowed("admin")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee emp) {
        return ResponseEntity.ok(employeeRepository.save(emp));
    }

    @GetMapping("/user/employees")
    @RolesAllowed({"employee","admin"})
    public ResponseEntity<List<Employee>> getEmployees() {
        return ResponseEntity.ok(employeeRepository.findAll());
    }


    @PostMapping("/admin/createUser")
    @RolesAllowed("admin")
    public String createUser() {
        employeeService.createUser();
        return "User Created";
    }

}
