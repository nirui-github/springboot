package com.nirui.springboot.entity;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.annotations.Mapper;

@Getter
@Setter
@ToString
public class TUser implements Serializable {
    private Integer id;

    private String username;

    private String password;

    private static final long serialVersionUID = 1L;
}