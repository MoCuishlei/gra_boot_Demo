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
@Table(name="t_c")
public class T_c {
    @Id
    @PrimaryKeyJoinColumn
    private Integer id;

    private Integer t_id;
    private Integer c_id;
    private String t_name;
    private String c_name;
}
