# Spring5 框架

## 1、主要内容
### 1.1、Spring框架概述
Spring是轻量级的开源JavaEE框架  

Spring可以解决企业应用开发的复杂性  

Spring有两个核心部分：IOC和AOP  
&emsp;&emsp;&emsp;IOC：控制反转，把创建对象的过程交给Spring管理  
&emsp;&emsp;&emsp;AOP：面向切面，不修改源代码的情况下，进行功能增强  

Spring特点：  
&emsp;&emsp;方便解耦，简化开发  
&emsp;&emsp;Aop编程支持  
&emsp;&emsp;方便程序测试  
&emsp;&emsp;方便和其他框架进行整合  
&emsp;&emsp;方便进行事务操作  
&emsp;&emsp;降低API开发难度  

Spring下载地址：
https://repo.spring.io/release/org/springframework/sprin
### 1.2、IOC容器

### 1.2.1、IOC底层原理
IOC概念与原理：  
&emsp;&emsp;控制反转，把对象创建和对象之间的调用过程，交给Spring进行管理  
&emsp;&emsp;使用IOC容器的目的：为了降低耦合度    
&emsp;&emsp;入门案例就是IOC的实现   

IOC过程：  
第一步：XML配置文件，配置创建的对象
```java
<bean id="stuDao" class="com.xrca.dao.StudentDao" ></bean>
```
第二步：有service类和dao类
```java
public class StudentFactory {
    public static StudentDao getStuDao() {
        String classValue = "com.xrca.dao.StudentDao"; // xml解析
        Class clazz = Class.forName(classValue); //反射
        return (StudentDao) clazz.newInstance(); 
    }
}
```

IOC底层技术：  
&emsp;&emsp;XML解析、工厂模式、反射

### 1.2.2、IOC接口（BeanFactory）  
IOC思想基于IOC容器完成实现，IOC容器底层就是对象工厂  

Spring提供了IOC容器的两种实现方式：（两个接口）  
BeanFactory：IOC容器基本实现，是Spring内部的使用接口，不提倡开发人员进行使用，加载配置文件的时候不会创建对象，在获取对象（使用）的时候才会去创建对象。  
ApplicationContext：BeanFactory接口的子接口，提供更多强大的功能，一般由开发人员进行使用，加载配置文件的时候就会把对象进行创建。
  

### 1.2.3、IOC操作Bean管理（基于XML）  
什么是Bean管理：  
&emsp;&emsp;Bean管理指的是两个操作：Spring创建对象、Spring注入属性  

Bean管理操作有两种方式：基于XML配置文件方式实现、基于注解方式实现。  

+ 1、基于XML方式创建对象  
```java
<bean id="user" class="com.xrca.Spring5.User"></bean>
```
在Spring配置文件中，使用Bean标签，标签里面添加相应属性，就可以实现对象创建  
在bean标签里有很多属性，介绍常用的属性  
+ （1）id属性：唯一标识
+ （2）class属性：类全路径（包类路径）  
+ （3）创建对象的时候，默认执行无参构造方法完成对象创建

+ 2、基于XML方式注入属性
DI：依赖注入，就是注入属性  
第一种注入方式：使用set方法进行注入
  
第二种注入方式：使用有参构造方法进行注入


IOC操作Bean管理（FactoryBean）
1、Spring有两种类型Bean，一种普通Bean，另一种工厂Bean（FactoryBean）

2、普通Bean：在配置文中定义Bean类型就是返回类型

3、工厂bean：在配置文件定义Bean类型可以和返回类型不一样
第一步：创建类，让这个类作为工厂bean，实现接口FactoryBean
第二部：实现接口里面的方法，在实现的方法中定义返回的bean类型


Bean的作用域：
1、在Spring里面，设置创建Bean实例是单实例还是多实例

2、在Spring里面，创建的bean默认是单实例对象

3、设置单实例还是多实例
（1）、在Spring配置文件bean标签里面的scope

Bean的生命周期：
（1）、从创建到销毁的过程

bean生命周期
（1）通过构造器创建bean实例（无参构造器）
（2）为bean的属性设置值和对其他bean引用（调用set方法）
（3）后置处理器：把bean实例传递给bean后置处理器方法
（4）调用bean的初始化的方法（需要进行配置）
（5）后置处理器：把bean实例传递给bean后置处理器方法
（6）bean可以使用了（对象获取到了）
（7）当容器关闭时候，调用bean的销毁方法（需要进行配置销毁的方法）

### 1.3、AOP

### 1.4、JDBCTemplate

### 1.5、事务管理

### 1.6、Spring5新特性

