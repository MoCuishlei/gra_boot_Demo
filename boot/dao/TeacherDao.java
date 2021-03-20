package pro.graduation.boot.dao;

import org.apache.ibatis.annotations.Mapper;
import pro.graduation.boot.entity.Teacher;

@Mapper
public interface TeacherDao {

    Teacher getTeacherByName(String name);

    int registerTeacher(String t_num,String name,String password);
}
