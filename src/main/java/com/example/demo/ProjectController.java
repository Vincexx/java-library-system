package com.example.demo;

import java.text.ParseException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ProjectController {

    private final EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() throws ParseException {
        return employeeService.listOfEmployees();
    }

    @GetMapping("/authors")
    public String getAllAuthors() {
        return "Get all authors!";
    }

    @GetMapping("/books")
    public String getAllBooks() {
        return "Get all books!";
    }

}
