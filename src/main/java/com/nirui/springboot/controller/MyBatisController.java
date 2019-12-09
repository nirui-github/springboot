package com.nirui.springboot.controller;

import com.nirui.springboot.entity.T_booktype;
import com.nirui.springboot.service.T_bookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyBatisController {
    @Autowired
    private T_bookTypeService t_bookTypeService;
    @GetMapping("/spring/t")
    public Object t_bookType() {
        return t_bookTypeService.getAll();
    }
    @GetMapping("/spring/t_bookType1")
    public Object t_bookTypeq() {
        return t_bookTypeService.selectList();
    }
    @GetMapping("/spring/update")
    public Object update() {
        return t_bookTypeService.updateByPrimaryKey();
    }
    //restful风格路径
    // /spring/restful/106/计算机/计算机排序
    // @PathVariable("id") String id把地址里对应的值读入到对应类型的变量
    @GetMapping("/spring/restful/{id}/{typename}/{typedesc}")
    public Object restful(@PathVariable("id") String id,
                          @PathVariable("typename") String typename,
                          @PathVariable("typedesc") String typedesc) {
        T_booktype t_booktype = new T_booktype();
        t_booktype.setId(id);
        t_booktype.setBooktypename(typename);
        t_booktype.setBooktypedesc(typedesc);
        return t_booktype;
    }
}
