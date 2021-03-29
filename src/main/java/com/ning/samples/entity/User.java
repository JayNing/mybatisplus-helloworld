package com.ning.samples.entity;

import lombok.Data;

/**
 * ClassName: User
 * Description:
 * date: 2021/3/29 15:37
 *
 * @author ningjianjian
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}