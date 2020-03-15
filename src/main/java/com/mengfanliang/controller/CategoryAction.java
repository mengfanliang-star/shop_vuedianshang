package com.mengfanliang.controller;

import com.mengfanliang.entity.Category;
import com.mengfanliang.result.R;
import com.mengfanliang.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.DispatcherServlet;

@RestController
@CrossOrigin

public class CategoryAction {
    @Autowired
    CategoryService service;
    @GetMapping("categories")
    public R getCategoriesList(int pagenum,int pagesize){

        return R.ok().data("categoryList",service.categoryList(pagenum,pagesize));
       // return R.ok().data1(service.categoryList());
    }
    @PostMapping("addcategories")

    public R add(@RequestBody Category category){
       int i= service.add(category);
                return R.ok().data("添加成功",i);

    }

    @DeleteMapping("remove")
    public R remove(int id){
       return R.ok().data("删除",service.remove(id));

    }

    @PutMapping("update")
    public R update(@RequestBody Category category){
        int i=service.update(category);
        return R.ok().data("修改",i);

    }

    @GetMapping("getone")
    public R getCategoryOne(int id){
        Category category=service.selectById(id);
        return R.ok().data("category",category);

    }



}
