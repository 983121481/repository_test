package com.tmin.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author
 * @date 2021-01-21 16:32
 */
@Data
@Entity
@Table(name = "users")
public class User implements Serializable {
    private static final long serialVersionUID = -2811134687378990361L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String password;

    private Date birthday;

}
