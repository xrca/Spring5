package com.xrca.spring5.entity;

/**
 * @author xrca
 * @date 2020-05-30 22:19
 */
public class Order {
    private String name;

    private String address;

    public Order() {

    }

    public Order(String orderName, String orderAddress) {
        this.name = orderName;
        this.address = orderAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
