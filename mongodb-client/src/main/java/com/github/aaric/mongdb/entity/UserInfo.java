package com.github.aaric.mongdb.entity;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;

import java.io.Serializable;

/**
 * 用户信息
 *
 * @author Aaric, created on 2020-02-29T22:25.
 * @version 0.1.0-SNAPSHOT
 */
@Data
@Accessors(chain = true)
public class UserInfo implements Serializable {

    @Id
    private Integer id;
    @Indexed(direction = IndexDirection.ASCENDING)
    private String username;
    private String email;
    private Integer age;
    private Double salary;
}
