package com.example.springboot.springdataredis.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author shihongwei
 * @date: 2018/11/6 16:41
 * @desc:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 8655851615465363473L;

    private Long              id;

    private String            username;

    private String            password;

}
