package com.xrca.aop.dao;

/**
 * @author xrca
 * @description 动态代理，接口方式
 * @date 2020-07-19 15:07
 */
public interface UserDao {
    int add(int a, int b);

    int plus(int a, int b);
}
