package com.xrca.spring5.entity;

import lombok.Data;

/**
 * @author xrca
 * @date 2020-05-31 16:41
 */
@Data
public class Employee {
    private String name;

    private String gender;

    private Department department;
}
