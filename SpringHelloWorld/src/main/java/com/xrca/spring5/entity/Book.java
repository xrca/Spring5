package com.xrca.spring5.entity;

/**
 * @author xrca
 * @date 2020-05-30 22:10
 */
public class Book {
    private String name;

    public Book() {

    }

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
