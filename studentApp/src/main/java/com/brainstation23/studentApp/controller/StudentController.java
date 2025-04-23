package com.brainstation23.studentApp.controller;

import com.brainstation23.studentApp.model.Student;
import com.brainstation23.studentApp.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public String showAllStudents(Model model) {
        model.addAttribute("students", service.findAll());
        return "home";
    }

    @GetMapping("/add")
    public String addStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "add";
    }

    @PostMapping("/add")
    public String addStudent(@ModelAttribute Student student) {
        service.save(student);
        return "redirect:/students";
    }

    @GetMapping("/update/{id}")
    public String updateStudentForm(@PathVariable int id, Model model) {
        model.addAttribute("student", service.findById(id));
        return "update";
    }

    @PostMapping("/update")
    public String updateStudent(@ModelAttribute Student student) {
        service.update(student);
        return "redirect:/students";
    }

    @GetMapping("/{id}")
    public String detail(@PathVariable int id, Model model) {
        model.addAttribute("student", service.findById(id));
        return "details";
    }

    @PostMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        service.deleteById(id);
        return "redirect:/students";
    }
}
