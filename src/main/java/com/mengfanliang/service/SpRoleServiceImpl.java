package com.mengfanliang.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.mengfanliang.entity.SpRole;
import com.mengfanliang.entity.SpRoleExample;
import com.mengfanliang.mapper.SpRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SpRoleServiceImpl implements SpRoleService {
   @Autowired
    SpRoleMapper mapper;
    @Override
    public List<SpRole> findList(String name,int page,int rows) {
        PageHelper.startPage(page,rows);
        SpRoleExample example=new SpRoleExample();

        return mapper.selectByExample(example);
    }
}
