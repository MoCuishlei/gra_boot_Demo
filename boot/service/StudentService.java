package pro.graduation.boot.service;

import org.springframework.stereotype.Service;
import pro.graduation.boot.entity.Student;


public interface StudentService {

    Student getStudentByName(String name);

    int registerStudent(String s_num,String name,String password);
}
