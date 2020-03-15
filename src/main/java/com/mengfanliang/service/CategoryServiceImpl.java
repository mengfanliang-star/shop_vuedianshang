package com.mengfanliang.service;

import com.github.pagehelper.PageHelper;
import com.mengfanliang.entity.Category;
import com.mengfanliang.entity.CategoryExample;
import com.mengfanliang.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper mapper;
    @Override
    public List<Category> categoryList(int page,int rows) {
        PageHelper.startPage(page,rows);
        return mapper.selectTree();
    }

    @Override
    public int add(Category category) {

        return mapper.insert(category);
    }

    @Override
    public int remove(int id) {
        CategoryExample example=new CategoryExample();
        CategoryExample.Criteria c=example.createCriteria();
        c.andCatIdEqualTo(id);
        return mapper.deleteByExample(example);



    }

    @Override
    public int update(Category category) {
        return mapper.updateByPrimaryKey(category);
    }

    @Override
    public Category selectById(int id) {
        return mapper.selectByPrimaryKey(id);
    }
}
