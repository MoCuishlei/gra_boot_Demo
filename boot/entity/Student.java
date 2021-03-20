package pro.graduation.boot.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="student")
public class Student {
    @Id
    @PrimaryKeyJoinColumn
    private Integer id ;

    private String s_num;
    private String name;
    private String password;
}
