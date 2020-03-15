package com.mengfanliang.controller;

import com.mengfanliang.entity.SpRole;
import com.mengfanliang.exception.SpRoleException;
import com.mengfanliang.result.R;
import com.mengfanliang.result.ResultCode;
import com.mengfanliang.service.SpRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("a")
public class SpRoleAction {
    @Autowired
    SpRoleService service;
    @RequestMapping("b")
    public Map<String,Object> getList(String name, int page, int rows) throws SpRoleException {
        List<SpRole> list =service.findList(name,page,rows);
        Map<String,Object> map=new HashMap<String,Object>();
        String a="aaa";
        map.put("role",list);
        map.put("a",a);

        return map;
       //return list;
       // int a=10/0;
//        if(page==1){
//
//                throw new SpRoleException(800,"fdafqdrq23213");
//
//        }
        //return R.ok().data("role",list).meta(300,"双卡双待没看");


    }

}
