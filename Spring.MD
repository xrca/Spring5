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

IOC底层技术：  
&emsp;&emsp;XML解析、工厂模式、反射

### 1.2.2、IOC接口（BeanFactory）  
IOC思想基于IOC容器完成实现，IOC容器底层就是对象工厂  

Spring提供了IOC容器的两种实现方式：（两个接口）  
BeanFactory：IOC容器基本实现，是Spring内部的使用接口，不提供开发人员进行使用，加载配置文件的时候不会创建对象，在获取对象（使用）的时候才会去创建对象。  
ApplicationContext：BeanFactory接口的子接口，提供更多强大的功能，一般由开发人员进行使用，加载配置文件的时候就会把对象进行创建。  

### 1.2.3、IOC操作Bean管理（基于XML）

### 1.3、AOP

### 1.4、JDBCTemplate

### 1.5、事务管理

### 1.6、Spring5新特性

