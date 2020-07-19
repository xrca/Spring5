package com.xrca.spring5.autowrie;

import com.xrca.spring5.bean.BIOS;
import com.xrca.spring5.bean.CPU;
import com.xrca.spring5.bean.GPU;
import com.xrca.spring5.bean.Keyborad;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Getter
public class Computer {

    // 根据属性类型进行自动装配
    @Autowired
    private CPU cpu;

    // 根据属性名称进行注入，需要和@Autowired一起使用
    @Autowired
    @Qualifier(value = "GPU")
    private GPU gpu;

    // 可以根据类型注入，可以根据名称注入
    @Resource
    private Keyborad keyborad;

    @Resource(name = "bios")
    private BIOS bios;

    @Value(value = "Laptop")
    private String name;

}
