package pro.graduation.boot.service.impl;

import org.springframework.stereotype.Service;
import pro.graduation.boot.dao.TeacherDao;
import pro.graduation.boot.entity.Teacher;
import pro.graduation.boot.service.TeacherService;

import javax.annotation.Resource;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Resource
    TeacherDao teacherDao;

    @Override
    public Teacher getTeacherByName(String name) {
        return teacherDao.getTeacherByName(name);
    }

    @Override
    public int registerTeacher(String t_num, String name, String password) {
        return 0;
    }
}
