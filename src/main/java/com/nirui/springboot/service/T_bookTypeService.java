package com.nirui.springboot.service;

import com.nirui.springboot.entity.T_booktype;

import java.util.List;

public interface T_bookTypeService {
    public List<T_booktype>getAll();
    public List<T_booktype>selectList();
    public int updateByPrimaryKey();
}
