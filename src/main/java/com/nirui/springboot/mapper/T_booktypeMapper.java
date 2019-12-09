package com.nirui.springboot.mapper;

import com.nirui.springboot.entity.T_booktype;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface T_booktypeMapper {
    int deleteByPrimaryKey(String id);

    int insert(T_booktype record);

    int insertSelective(T_booktype record);

    T_booktype selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(T_booktype record);

    int updateByPrimaryKey(T_booktype record);
    List<T_booktype> getAll();
}