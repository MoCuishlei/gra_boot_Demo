package pro.graduation.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="c_c")
public class C_c {
    @Id
    @PrimaryKeyJoinColumn()
    private Integer id;
    private Integer course_id;

    private Integer category_id;
}
