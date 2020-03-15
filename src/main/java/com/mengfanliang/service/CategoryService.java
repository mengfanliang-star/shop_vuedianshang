package com.mengfanliang.service;

import com.mengfanliang.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> categoryList(int page,int rows);
    int add(Category category);
    int remove(int id);
    int update(Category category);
    Category selectById(int id);
}
