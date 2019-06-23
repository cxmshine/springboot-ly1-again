package cn.itcast.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "t_user")  /*数据库中的表名为users*/
public class User {
    @Id  /*主键*/
    @KeySql(useGeneratedKeys = true)  /*主键自增回显*/
    private Integer id;
    private String username;
    private String password;
}