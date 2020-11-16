package com.hpy.demo.dbTest.modal;

import lombok.Data;

/**
 * @author A51398
 * 实体类定义为业务模型
 */
@Data
public class PersonInfo {
    private String name;
    private Integer id;
    private Integer sex;
    private String address;
}