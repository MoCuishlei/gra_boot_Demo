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
@Table(name="c_s")
public class C_s {
    @Id
    @PrimaryKeyJoinColumn
    private Integer id;

    private Integer c_id;
    private Integer s_id;
}
