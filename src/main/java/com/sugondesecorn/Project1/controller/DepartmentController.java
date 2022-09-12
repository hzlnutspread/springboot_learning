package com.sugondesecorn.Project1.controller;

import com.sugondesecorn.Project1.entity.Department;
import com.sugondesecorn.Project1.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

//    Do this to get spring to automatically to inject the DepartmentService interface object without needing to instantiate it
    @Autowired
    private DepartmentService departmentService;

//    Need to pass in the entire json object too in the request body
    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }
}
