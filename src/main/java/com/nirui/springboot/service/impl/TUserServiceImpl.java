package com.nirui.springboot.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.nirui.springboot.entity.TUser;
import com.nirui.springboot.mapper.TUserMapper;
import com.nirui.springboot.service.TUserService;
@Service
public class TUserServiceImpl implements TUserService{

    @Resource
    private TUserMapper tUserMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TUser record) {
        return tUserMapper.insert(record);
    }

    @Override
    public int insertSelective(TUser record) {
        return tUserMapper.insertSelective(record);
    }

    @Override
    public TUser selectByPrimaryKey(Integer id) {
        return tUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TUser record) {
        return tUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TUser record) {
        return tUserMapper.updateByPrimaryKey(record);
    }

}
