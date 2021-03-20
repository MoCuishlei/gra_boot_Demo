package pro.graduation.boot.dao;

import org.apache.ibatis.annotations.Mapper;
import pro.graduation.boot.entity.Student;

@Mapper
public interface StudentDao {

    Student getStudentByName(String name);

    int registerStudent(String s_num,String name,String password);
}
