package com.xrca.aop.dao;

/**
 * @author xrca
 * @description 动态代理，接口方式
 * @date 2020-07-19 15:07
 */
public class UserDaoImpl implements UserDao {

    @Override
    public int add(int a, int b) {
        System.out.println("正在计算...");
        return a + b;
    }

    @Override
    public int plus(int a, int b) {
        System.out.println("正在计算...");
        return a * b;
    }
}
