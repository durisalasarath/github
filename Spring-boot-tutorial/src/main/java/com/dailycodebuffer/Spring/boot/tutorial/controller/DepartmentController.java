package com.dailycodebuffer.Spring.boot.tutorial.controller;

import com.dailycodebuffer.Spring.boot.tutorial.entity.Department;
import com.dailycodebuffer.Spring.boot.tutorial.error.DepartmentNotFoundException;
import com.dailycodebuffer.Spring.boot.tutorial.service.DepartmentService;
import com.dailycodebuffer.Spring.boot.tutorial.service.DepartmentServiceImpl;
import jakarta.validation.Valid;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.PanelUI;
import java.util.List;
import java.util.logging.Logger;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


  //  private final Logger LOG = (Logger) LoggerFactory.getLogger(DepartmentController.class);


    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
       // LOG.info("Inside  saveDepartment of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
       // LOG.info("Inside  fetchDepartmentList of DepartmentController");
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "Department deleted successfully!!";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId,
                                       @RequestBody Department department){
        return departmentService.updateDepartment(departmentId,department);

    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
        return departmentService.fetchDepartmentByName(departmentName);
    }
}
