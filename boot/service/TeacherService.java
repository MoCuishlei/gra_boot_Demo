package pro.graduation.boot.service;

import pro.graduation.boot.entity.Teacher;


public interface TeacherService {
    Teacher getTeacherByName(String name);

    int registerTeacher(String t_num,String name,String password);
}
