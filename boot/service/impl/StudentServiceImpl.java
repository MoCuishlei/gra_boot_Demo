package pro.graduation.boot.service.impl;

import org.springframework.stereotype.Service;
import pro.graduation.boot.dao.StudentDao;
import pro.graduation.boot.entity.Student;
import pro.graduation.boot.service.StudentService;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    StudentDao studentDao;

    @Override
    public Student getStudentByName(String name) {
        return studentDao.getStudentByName(name);
    }

    @Override
    public int registerStudent(String s_num, String name, String password) {
        return 0;
    }
}
