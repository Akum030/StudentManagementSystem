package com.sms.student_management_system.service;

import com.sms.student_management_system.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStuent(Student student);

    void deleteStudentById(Long id);
}
