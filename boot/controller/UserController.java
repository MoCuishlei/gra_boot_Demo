package pro.graduation.boot.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pro.graduation.boot.entity.Student;
import pro.graduation.boot.entity.Teacher;
import pro.graduation.boot.service.StudentService;
import pro.graduation.boot.service.TeacherService;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.ws.rs.PathParam;
import java.sql.SQLException;
import java.util.Map;

@Controller()
@RequestMapping("/login")
public class UserController {
    @Resource
    StudentService studentService;
    @Resource
    TeacherService teacherService;

    @GetMapping(value = "student")
    public String login_s() {
        return "login/student";
    }

    @PostMapping(value = "student")
    public String login_s_p(@RequestParam("username") String username,
                            @RequestParam("password") String password, HttpSession session, ModelMap map) {
        Student student = null;
        try {
            student = studentService.getStudentByName(username);

        } catch (Exception e) {
            e.printStackTrace();
        }
        if (student != null) {
            if(student.getPassword().equals(password)){
                session.setAttribute("id", student.getS_num());
                session.setAttribute("identity","s");
                session.setAttribute("name",student.getName());
                return "/login/Suivez-moi/Main";
            }else {
                map.addAttribute("msg", "用户名密码错误");
                return "/login/student";
            }
        } else {
            map.addAttribute("msg", "用户名密码错误");
            return "/login/student";
        }
    }

    @PostMapping(value = "teacher")
    public String login_t_p(@RequestParam("username") String username,
                          @RequestParam("password") String password, HttpSession session, ModelMap map) {
        Teacher teacher = null;
        try{
            teacher = teacherService.getTeacherByName(username);
        }catch (Exception e){
            e.printStackTrace();
        }
        if(teacher != null){
            if(teacher.getPassword().equals(password)) {
                session.setAttribute("id",teacher.getT_num());
                session.setAttribute("identity","t");
                session.setAttribute("username",teacher.getName());
                return "/login/Suivez-moi/Main";
            }else {
                map.addAttribute("msg", "用户名密码错误");
                return "/login/teacher";
            }
        }else{
            map.addAttribute("msg", "用户名密码错误");
            return "/login/teacher";

        }
    }

    @GetMapping(value = "teacher")
    public String login_t() {
        return "/login/teacher";
    }

}
