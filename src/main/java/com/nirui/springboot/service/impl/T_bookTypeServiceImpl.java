package com.nirui.springboot.service.impl;

import com.nirui.springboot.entity.T_booktype;
import com.nirui.springboot.mapper.T_booktypeMapper;
import com.nirui.springboot.service.T_bookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.ibatis.session.SqlSession;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class T_bookTypeServiceImpl implements T_bookTypeService {

    @Autowired
    private T_booktypeMapper t_booktypeMapper;
    @Autowired
    private SqlSession sqlSession;
    @Override
    public List<T_booktype> getAll() {
        return t_booktypeMapper.getAll();
    }
    @Override
    public List<T_booktype> selectList() {

        List<T_booktype> list = this.sqlSession.selectList("com.nirui.springboot.mapper.T_booktypeMapper.getAll");
        return list;
    }
    @Override
    @Transactional//开启事务，只有事务完全成功才对数据库操作
    public int updateByPrimaryKey() {
        T_booktype t_booktype = new T_booktype();
        t_booktype.setId("1");
        t_booktype.setBooktypename("计算机类2");
        t_booktype.setBooktypedesc("计算机书籍4");

        int update = t_booktypeMapper.updateByPrimaryKey(t_booktype);
        System.out.println("springboot已更新数据");
        int a = 10/0;
        return update ;
    }
}
